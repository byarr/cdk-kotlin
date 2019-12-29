package com.brianyarr.cdk.gen

import java.io.File
import java.io.FileOutputStream

class Generator (val service: String) {

    val outDir = File(service)

    fun generate(classes: List<Class<*>>) {
        mkdir()

        writeGradleFile()

        generateDsl(classes)
    }

    private fun generateDsl(classes: List<Class<*>>) {
        val packageName = "com.brianyarr.cdk.$service"
        val srcDir = File(outDir, "src/main/kotlin/${packageName.replace('.', '/')}")
        srcDir.mkdirs()

        val srcFile = File(srcDir, "Dsl.kt")

        FileOutputStream(srcFile).use {
            it.bufferedWriter().appendln("package $packageName")
        }
    }

    private fun writeGradleFile() {
        FileOutputStream(File(outDir, "build.gradle.kts")).use {
            it.bufferedWriter().appendln("dependencies {\n" +
                    "    api(\"software.amazon.awscdk:${service}\")\n" +
                    "}")
        }
    }

    private fun mkdir() {
        outDir.mkdir()
    }

}