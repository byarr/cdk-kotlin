package com.brianyarr.cdk.codestarconnections

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.codestarconnections.CfnConnection
import software.amazon.awscdk.services.codestarconnections.CfnConnectionProps

fun Construct.cfnConnection(id: String, init: CfnConnectionProps.Builder.() -> Unit): CfnConnection {
    val propsBuilder = CfnConnectionProps.builder()
    propsBuilder.init()
    
    return CfnConnection(this, id, propsBuilder.build())
}

