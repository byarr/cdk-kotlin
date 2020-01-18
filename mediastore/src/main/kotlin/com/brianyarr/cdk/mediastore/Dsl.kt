package com.brianyarr.cdk.mediastore

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.mediastore.CfnContainer
import software.amazon.awscdk.services.mediastore.CfnContainerProps

fun Construct.cfnContainer(id: String, init: CfnContainerProps.Builder.() -> Unit): CfnContainer {
    val propsBuilder = CfnContainerProps.builder()
    propsBuilder.init()
    
    return CfnContainer(this, id, propsBuilder.build())
}

