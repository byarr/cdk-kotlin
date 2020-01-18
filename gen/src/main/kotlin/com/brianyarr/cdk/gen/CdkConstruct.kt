package com.brianyarr.cdk.gen

import java.lang.reflect.Modifier

class CdkConstruct(val clazz: Class<*>) {

    fun service(): String? {
        val packageName = clazz.packageName
        if (packageName.startsWith("software.amazon.awscdk.services.")) {
            return packageName.substring("software.amazon.awscdk.services.".length)
        }
        else {
            return null
        }
    }

    fun moduleName(): String {
        return service()?.replace(".", "")!!
    }

    fun isServiceConstruct(): Boolean {
        return clazz.name.contains("service") &&
                !clazz.isInterface &&
                ! Modifier.isAbstract(clazz.modifiers) &&
                ! clazz.isMemberClass
    }

    fun hasProps(): Boolean {
        val propsName = clazz.name + "Props"
        return try {
            Class.forName(propsName)
            true
        } catch (c : ClassNotFoundException) {
            false
        }
    }

}