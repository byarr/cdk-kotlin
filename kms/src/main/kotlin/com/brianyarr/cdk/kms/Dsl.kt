package com.brianyarr.cdk.kms

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.kms.Key
import software.amazon.awscdk.services.kms.KeyProps
import software.amazon.awscdk.services.kms.Alias
import software.amazon.awscdk.services.kms.AliasProps

fun Construct.key(id: String, init: KeyProps.Builder.() -> Unit): Key {
    val propsBuilder = KeyProps.builder()
    propsBuilder.init()
    
    return Key(this, id, propsBuilder.build())
}


fun Construct.alias(id: String, init: AliasProps.Builder.() -> Unit): Alias {
    val propsBuilder = AliasProps.builder()
    propsBuilder.init()
    
    return Alias(this, id, propsBuilder.build())
}


