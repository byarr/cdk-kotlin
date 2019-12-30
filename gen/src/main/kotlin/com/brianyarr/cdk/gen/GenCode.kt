package com.brianyarr.cdk.gen

import org.reflections.Reflections
import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.core.Resource
import java.lang.reflect.Modifier

fun awsService(clazz: Class<*>): String {
    val packageName = clazz.packageName
    if (packageName.startsWith("software.amazon.awscdk.services.")) {
        return packageName.substring("software.amazon.awscdk.services.".length)
    }
    else {
        return packageName
    }

}

fun main() {
    val reflections = Reflections("software.amazon.awscdk")
    val resources = reflections.getSubTypesOf(Construct::class.java)

    val classesByService = resources.asSequence()
            .map { CdkConstruct(it) }
            .filter { it.isServiceConstruct() }
            .groupBy { it.service()!! }

    // generate the code for each
    classesByService.forEach {
        val generator = Generator(it.key)
        generator.generate(it.value)
    }

    // print the include statement for settings file
    println(
        classesByService.keys.asSequence()
                .map { it.replace(".", "") }
            .sorted()
            .map {"\"$it\""}
            .joinToString(separator = ", ", prefix = "include(", postfix = ")")
    )
}