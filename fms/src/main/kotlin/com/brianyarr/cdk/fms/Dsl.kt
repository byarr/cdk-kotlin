package com.brianyarr.cdk.fms

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.fms.CfnPolicy
import software.amazon.awscdk.services.fms.CfnPolicyProps
import software.amazon.awscdk.services.fms.CfnNotificationChannel
import software.amazon.awscdk.services.fms.CfnNotificationChannelProps

fun Construct.cfnPolicy(id: String, init: CfnPolicyProps.Builder.() -> Unit): CfnPolicy {
    val propsBuilder = CfnPolicyProps.builder()
    propsBuilder.init()
    
    return CfnPolicy(this, id, propsBuilder.build())
}

fun Construct.cfnNotificationChannel(id: String, init: CfnNotificationChannelProps.Builder.() -> Unit): CfnNotificationChannel {
    val propsBuilder = CfnNotificationChannelProps.builder()
    propsBuilder.init()
    
    return CfnNotificationChannel(this, id, propsBuilder.build())
}

