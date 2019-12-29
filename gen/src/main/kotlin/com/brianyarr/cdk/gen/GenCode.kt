package com.brianyarr.cdk.gen

import org.reflections.Reflections
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
    val resources = reflections.getSubTypesOf(Resource::class.java)
    val groupBy = resources.asSequence()
            .filterNot { it.isInterface }
            .filterNot { Modifier.isAbstract(it.modifiers) }
            .groupBy { awsService(it) }
    groupBy.forEach{
        println(it.key)
        println(it.value)
    }


    groupBy.forEach {
        val generator = Generator(it.key)
        generator.generate(it.value)
    }
}