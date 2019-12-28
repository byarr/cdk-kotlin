package com.brianyarr.cdk.gen

import org.reflections.Reflections
import org.reflections.scanners.SubTypesScanner
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream
import java.net.URL
import java.net.URLClassLoader
import java.nio.file.Files

object CodeGen {

    fun generate(m: Module) {
        val tempDir = Files.createTempDirectory("cdkjar").toFile()


        val file = File(tempDir, m.fileName())

        URL(m.url()).openStream().use {inp ->
            FileOutputStream(file).use {
                inp.copyTo(it)
            }

        }


        val urlClassLoader = URLClassLoader(arrayOf(file.toURL()), javaClass.classLoader)

        val reflections = Reflections(ModuleGenerator.groupId, urlClassLoader, SubTypesScanner(true))
        println(reflections.getSubTypesOf(Class.forName("software.amazon.awscdk.core.Resource")))

    }

}