package com.brianyarr.cdk.applicationautoscaling

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.applicationautoscaling.ScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps

fun Construct.scalableTarget(id: String, init: ScalableTargetProps.Builder.() -> Unit): ScalableTarget {
    val propsBuilder = ScalableTargetProps.builder()
    propsBuilder.init()
    
    return ScalableTarget(this, id, propsBuilder.build())
}


