package com.brianyarr.cdk.opsworkscm

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.opsworkscm.CfnServer
import software.amazon.awscdk.services.opsworkscm.CfnServerProps

fun Construct.cfnServer(id: String, init: CfnServerProps.Builder.() -> Unit): CfnServer {
    val propsBuilder = CfnServerProps.builder()
    propsBuilder.init()
    
    return CfnServer(this, id, propsBuilder.build())
}

