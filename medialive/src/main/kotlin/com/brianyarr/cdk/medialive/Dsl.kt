package com.brianyarr.cdk.medialive

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.medialive.CfnInput
import software.amazon.awscdk.services.medialive.CfnInputProps
import software.amazon.awscdk.services.medialive.CfnChannel
import software.amazon.awscdk.services.medialive.CfnChannelProps
import software.amazon.awscdk.services.medialive.CfnInputSecurityGroup
import software.amazon.awscdk.services.medialive.CfnInputSecurityGroupProps

fun Construct.cfnInput(id: String, init: CfnInputProps.Builder.() -> Unit): CfnInput {
    val propsBuilder = CfnInputProps.builder()
    propsBuilder.init()
    
    return CfnInput(this, id, propsBuilder.build())
}

fun Construct.cfnChannel(id: String, init: CfnChannelProps.Builder.() -> Unit): CfnChannel {
    val propsBuilder = CfnChannelProps.builder()
    propsBuilder.init()
    
    return CfnChannel(this, id, propsBuilder.build())
}

fun Construct.cfnInputSecurityGroup(id: String, init: CfnInputSecurityGroupProps.Builder.() -> Unit): CfnInputSecurityGroup {
    val propsBuilder = CfnInputSecurityGroupProps.builder()
    propsBuilder.init()
    
    return CfnInputSecurityGroup(this, id, propsBuilder.build())
}

