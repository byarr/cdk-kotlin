package com.brianyarr.cdk.gen

import java.io.File
import java.io.FileOutputStream

class Generator(private val service: String, private val rootDir: String) {

    private val outDir = File(rootDir, service.replace(".", ""))

    fun generate(classes: List<CdkConstruct>) {
        mkdir()

        writeGradleFile()

        generateDsl(classes)
    }

    private fun generateDsl(classes: List<CdkConstruct>) {
        val packageName = "com.brianyarr.cdk.$service"
        val srcDir = File(outDir, "src/main/kotlin/${packageName.replace('.', '/')}")
        srcDir.mkdirs()

        val srcFile = File(srcDir, "Dsl.kt")

        val imports = classes.asSequence()
                .map {it.clazz }
                .map { it.name }
                .flatMap { sequenceOf(it, "${it}Props") }
                .map { "import $it" }
                .joinToString(separator = "\n")


        FileOutputStream(srcFile).use {
            val bufferedWriter = it.bufferedWriter()
            bufferedWriter.appendln("package $packageName")
            bufferedWriter.newLine()

            bufferedWriter.appendln("import software.amazon.awscdk.core.Construct")
            bufferedWriter.appendln(imports)
            bufferedWriter.newLine()


            classes.forEach {
                bufferedWriter.appendln(resourceDsl(it.clazz))
                bufferedWriter.newLine()
            }

            bufferedWriter.flush()
        }
    }

    private fun resourceDsl(clazz: Class<*>): String {

        val resourceShortName = clazz.simpleName
        val functionName = resourceShortName[0].toLowerCase() + resourceShortName.substring(1)
        val propShortName = clazz.simpleName + "Props"

        return """
            fun Construct.$functionName(id: String, init: ${propShortName}.Builder.() -> Unit): $resourceShortName {
                val propsBuilder = ${propShortName}.builder()
                propsBuilder.init()
                
                return $resourceShortName(this, id, propsBuilder.build())
            }
        """.trimIndent()
    }

    private fun writeGradleFile() {
        var groupId = service.replace('.', '-')
        if (groupId == "waf-regional") {
            groupId = "wafregional"
        }

        FileOutputStream(File(outDir, "build.gradle.kts")).use {
            val bufferedWriter = it.bufferedWriter()
            bufferedWriter.appendln("dependencies {\n" +
                    "    api(\"software.amazon.awscdk:${groupId}\")\n" +
                    "}")
            bufferedWriter.flush()
        }
    }

    private fun mkdir() {
        outDir.mkdir()
    }

}