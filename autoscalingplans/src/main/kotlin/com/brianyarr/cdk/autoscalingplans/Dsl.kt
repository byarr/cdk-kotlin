package com.brianyarr.cdk.autoscalingplans

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps

fun Construct.cfnScalingPlan(id: String, init: CfnScalingPlanProps.Builder.() -> Unit): CfnScalingPlan {
    val propsBuilder = CfnScalingPlanProps.builder()
    propsBuilder.init()
    
    return CfnScalingPlan(this, id, propsBuilder.build())
}

