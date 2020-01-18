package com.brianyarr.cdk.mediaconvert

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.mediaconvert.CfnQueue
import software.amazon.awscdk.services.mediaconvert.CfnQueueProps
import software.amazon.awscdk.services.mediaconvert.CfnPreset
import software.amazon.awscdk.services.mediaconvert.CfnPresetProps
import software.amazon.awscdk.services.mediaconvert.CfnJobTemplate
import software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps

fun Construct.cfnQueue(id: String, init: CfnQueueProps.Builder.() -> Unit): CfnQueue {
    val propsBuilder = CfnQueueProps.builder()
    propsBuilder.init()
    
    return CfnQueue(this, id, propsBuilder.build())
}

fun Construct.cfnPreset(id: String, init: CfnPresetProps.Builder.() -> Unit): CfnPreset {
    val propsBuilder = CfnPresetProps.builder()
    propsBuilder.init()
    
    return CfnPreset(this, id, propsBuilder.build())
}

fun Construct.cfnJobTemplate(id: String, init: CfnJobTemplateProps.Builder.() -> Unit): CfnJobTemplate {
    val propsBuilder = CfnJobTemplateProps.builder()
    propsBuilder.init()
    
    return CfnJobTemplate(this, id, propsBuilder.build())
}

