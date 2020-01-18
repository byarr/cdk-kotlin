package com.brianyarr.cdk.securityhub

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.securityhub.CfnHub
import software.amazon.awscdk.services.securityhub.CfnHubProps

fun Construct.cfnHub(id: String, init: CfnHubProps.Builder.() -> Unit): CfnHub {
    val propsBuilder = CfnHubProps.builder()
    propsBuilder.init()
    
    return CfnHub(this, id, propsBuilder.build())
}

