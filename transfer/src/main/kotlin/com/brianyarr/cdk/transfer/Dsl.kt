package com.brianyarr.cdk.transfer

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.transfer.CfnServer
import software.amazon.awscdk.services.transfer.CfnServerProps
import software.amazon.awscdk.services.transfer.CfnUser
import software.amazon.awscdk.services.transfer.CfnUserProps

fun Construct.cfnServer(id: String, init: CfnServerProps.Builder.() -> Unit): CfnServer {
    val propsBuilder = CfnServerProps.builder()
    propsBuilder.init()
    
    return CfnServer(this, id, propsBuilder.build())
}

fun Construct.cfnUser(id: String, init: CfnUserProps.Builder.() -> Unit): CfnUser {
    val propsBuilder = CfnUserProps.builder()
    propsBuilder.init()
    
    return CfnUser(this, id, propsBuilder.build())
}

