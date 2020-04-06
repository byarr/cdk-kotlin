package com.brianyarr.cdk.iotevents

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.iotevents.CfnDetectorModel
import software.amazon.awscdk.services.iotevents.CfnDetectorModelProps
import software.amazon.awscdk.services.iotevents.CfnInput
import software.amazon.awscdk.services.iotevents.CfnInputProps

fun Construct.cfnDetectorModel(id: String, init: CfnDetectorModelProps.Builder.() -> Unit): CfnDetectorModel {
    val propsBuilder = CfnDetectorModelProps.builder()
    propsBuilder.init()
    
    return CfnDetectorModel(this, id, propsBuilder.build())
}

fun Construct.cfnInput(id: String, init: CfnInputProps.Builder.() -> Unit): CfnInput {
    val propsBuilder = CfnInputProps.builder()
    propsBuilder.init()
    
    return CfnInput(this, id, propsBuilder.build())
}

