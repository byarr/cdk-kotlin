package com.brianyarr.cdk.autoscaling

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.autoscaling.AutoScalingGroup
import software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps
import software.amazon.awscdk.services.autoscaling.ScheduledAction
import software.amazon.awscdk.services.autoscaling.ScheduledActionProps
import software.amazon.awscdk.services.autoscaling.LifecycleHook
import software.amazon.awscdk.services.autoscaling.LifecycleHookProps

fun Construct.autoScalingGroup(id: String, init: AutoScalingGroupProps.Builder.() -> Unit): AutoScalingGroup {
    val propsBuilder = AutoScalingGroupProps.builder()
    propsBuilder.init()
    
    return AutoScalingGroup(this, id, propsBuilder.build())
}


fun Construct.scheduledAction(id: String, init: ScheduledActionProps.Builder.() -> Unit): ScheduledAction {
    val propsBuilder = ScheduledActionProps.builder()
    propsBuilder.init()
    
    return ScheduledAction(this, id, propsBuilder.build())
}


fun Construct.lifecycleHook(id: String, init: LifecycleHookProps.Builder.() -> Unit): LifecycleHook {
    val propsBuilder = LifecycleHookProps.builder()
    propsBuilder.init()
    
    return LifecycleHook(this, id, propsBuilder.build())
}


