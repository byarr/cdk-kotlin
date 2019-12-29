package com.brianyarr.cdk.gen

import org.reflections.Reflections
import org.reflections.scanners.SubTypesScanner
import org.reflections.scanners.TypeAnnotationsScanner
import java.io.File
import java.io.FileOutputStream
import java.lang.reflect.Modifier
import java.net.URL
import java.net.URLClassLoader
import java.nio.file.Files

class CodeGen(val m: Module) {

    private val subTypesScanner: SubTypesScanner
    private val subtypes: MutableList<String> = mutableListOf()
    val urlClassLoader: URLClassLoader

    init {
        val tempDir = Files.createTempDirectory("cdkjar").toFile()

        val file = File(tempDir, m.fileName())

        URL(m.url()).openStream().use {inp ->
            FileOutputStream(file).use {
                inp.copyTo(it)
            }
        }

        urlClassLoader = URLClassLoader(arrayOf(file.toURL()), javaClass.classLoader)

        subTypesScanner = SubTypesScanner(false)
        val reflections = Reflections(ModuleGenerator.groupId, "software.amazon.awscdk.services.${m.artifact}", urlClassLoader, subTypesScanner, TypeAnnotationsScanner())
        loadSubclasses("software.amazon.awscdk.core.Resource")
    }

    private fun loadSubclasses(clazz: String) {
        val res = subTypesScanner.store.get(clazz)
        res.forEach {
            subtypes.add(it)
            loadSubclasses(it)
        }
    }

    fun getActualResources(): Sequence<Class<*>> {
        return subtypes.asSequence()
                .filterNot { it.equals("software.amazon.awscdk.core.Resource\$Jsii\$Proxy") }
                .onEach { println(it) }
                .map { Class.forName(it, false, urlClassLoader)}
                .filterNot { it.isInterface }
                .filterNot { Modifier.isAbstract(it.modifiers) }

    }

    fun generate() {
        val resources = getActualResources().toList()
        if (resources.isEmpty()) {
            println("Skipping")
        } else {
            println(resources)
//            val outDir = File(m.artifact)
//            outDir.mkdir()
        }
    }

    fun writeGradleFile(outDir: File) {
        FileOutputStream(File(outDir, "build.gradle.kts")).use {
            it.bufferedWriter().appendln("dependencies {\n" +
                    "    api(\"${m.group}:${m.artifact}\")\n" +
                    "}")
        }
    }

}