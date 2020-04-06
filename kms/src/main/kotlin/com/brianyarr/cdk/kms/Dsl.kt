package com.brianyarr.cdk.kms

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.kms.CfnKey
import software.amazon.awscdk.services.kms.CfnKeyProps
import software.amazon.awscdk.services.kms.Key
import software.amazon.awscdk.services.kms.KeyProps
import software.amazon.awscdk.services.kms.Alias
import software.amazon.awscdk.services.kms.AliasProps
import software.amazon.awscdk.services.kms.CfnAlias
import software.amazon.awscdk.services.kms.CfnAliasProps

fun Construct.cfnKey(id: String, init: CfnKeyProps.Builder.() -> Unit): CfnKey {
    val propsBuilder = CfnKeyProps.builder()
    propsBuilder.init()
    
    return CfnKey(this, id, propsBuilder.build())
}

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

fun Construct.cfnAlias(id: String, init: CfnAliasProps.Builder.() -> Unit): CfnAlias {
    val propsBuilder = CfnAliasProps.builder()
    propsBuilder.init()
    
    return CfnAlias(this, id, propsBuilder.build())
}

