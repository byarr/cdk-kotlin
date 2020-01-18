package com.brianyarr.cdk.ram

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.ram.CfnResourceShare
import software.amazon.awscdk.services.ram.CfnResourceShareProps

fun Construct.cfnResourceShare(id: String, init: CfnResourceShareProps.Builder.() -> Unit): CfnResourceShare {
    val propsBuilder = CfnResourceShareProps.builder()
    propsBuilder.init()
    
    return CfnResourceShare(this, id, propsBuilder.build())
}

