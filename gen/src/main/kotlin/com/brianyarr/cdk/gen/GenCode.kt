package com.brianyarr.cdk.gen

import org.reflections.Reflections
import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.core.Resource
import java.lang.reflect.Modifier
import java.io.File
import java.io.FileOutputStream

val rootProjectName = "cdk-kotlin"
val includes = listOf("core", "examples", "serverless")

fun awsService(clazz: Class<*>): String {
    val packageName = clazz.`package`.name
    if (packageName.startsWith("software.amazon.awscdk.services.")) {
        return packageName.substring("software.amazon.awscdk.services.".length)
    }
    else {
        return packageName
    }

}

private fun asInclude(subprojects: Sequence<String>): String {
    return subprojects
            .map {"\"$it\""}
            .joinToString(separator = ", ", prefix = "include(", postfix = ")")
}

private fun writeSettingsFile(rootDir: String, modules: Sequence<String>) {

    val settingsFile = File(rootDir, "settings.gradle.kts")

    FileOutputStream(settingsFile).use {
        val bufferedWriter = it.bufferedWriter()
        bufferedWriter.appendln("""rootProject.name = "${rootProjectName}"""".trimMargin())
        bufferedWriter.appendln()

        bufferedWriter.appendln(asInclude(includes.asSequence()))
        bufferedWriter.appendln(asInclude(modules))
        bufferedWriter.flush()
    }

}

fun main(args: Array<String>) {
    val reflections = Reflections("software.amazon.awscdk")
    val resources = reflections.getSubTypesOf(Construct::class.java)

    val classesByService = resources.asSequence()
            .map { CdkConstruct(it) }
            .filter { it.isServiceConstruct() }
            .filter { it.hasProps() }
            .groupBy { it.service()!! }

    // generate the code for each
    classesByService.forEach {
        val generator = Generator(it.key, args[0])
        generator.generate(it.value)
    }

    writeSettingsFile(args[0], classesByService.keys.asSequence()
            .map { it.replace(".", "") }
            .sorted())

}