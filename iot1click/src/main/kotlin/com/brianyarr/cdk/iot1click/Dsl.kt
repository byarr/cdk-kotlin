package com.brianyarr.cdk.iot1click

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.iot1click.CfnProject
import software.amazon.awscdk.services.iot1click.CfnProjectProps
import software.amazon.awscdk.services.iot1click.CfnPlacement
import software.amazon.awscdk.services.iot1click.CfnPlacementProps
import software.amazon.awscdk.services.iot1click.CfnDevice
import software.amazon.awscdk.services.iot1click.CfnDeviceProps

fun Construct.cfnProject(id: String, init: CfnProjectProps.Builder.() -> Unit): CfnProject {
    val propsBuilder = CfnProjectProps.builder()
    propsBuilder.init()
    
    return CfnProject(this, id, propsBuilder.build())
}

fun Construct.cfnPlacement(id: String, init: CfnPlacementProps.Builder.() -> Unit): CfnPlacement {
    val propsBuilder = CfnPlacementProps.builder()
    propsBuilder.init()
    
    return CfnPlacement(this, id, propsBuilder.build())
}

fun Construct.cfnDevice(id: String, init: CfnDeviceProps.Builder.() -> Unit): CfnDevice {
    val propsBuilder = CfnDeviceProps.builder()
    propsBuilder.init()
    
    return CfnDevice(this, id, propsBuilder.build())
}

