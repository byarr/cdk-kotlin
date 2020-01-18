package com.brianyarr.cdk.msk

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.msk.CfnCluster
import software.amazon.awscdk.services.msk.CfnClusterProps

fun Construct.cfnCluster(id: String, init: CfnClusterProps.Builder.() -> Unit): CfnCluster {
    val propsBuilder = CfnClusterProps.builder()
    propsBuilder.init()
    
    return CfnCluster(this, id, propsBuilder.build())
}

