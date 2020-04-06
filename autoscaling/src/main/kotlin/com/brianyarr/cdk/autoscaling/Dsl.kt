package com.brianyarr.cdk.autoscaling

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps
import software.amazon.awscdk.services.autoscaling.StepScalingAction
import software.amazon.awscdk.services.autoscaling.StepScalingActionProps
import software.amazon.awscdk.services.autoscaling.LifecycleHook
import software.amazon.awscdk.services.autoscaling.LifecycleHookProps
import software.amazon.awscdk.services.autoscaling.AutoScalingGroup
import software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps
import software.amazon.awscdk.services.autoscaling.CfnLifecycleHook
import software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps
import software.amazon.awscdk.services.autoscaling.StepScalingPolicy
import software.amazon.awscdk.services.autoscaling.StepScalingPolicyProps
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps
import software.amazon.awscdk.services.autoscaling.CfnScheduledAction
import software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps
import software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicy
import software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps
import software.amazon.awscdk.services.autoscaling.ScheduledAction
import software.amazon.awscdk.services.autoscaling.ScheduledActionProps

fun Construct.cfnLaunchConfiguration(id: String, init: CfnLaunchConfigurationProps.Builder.() -> Unit): CfnLaunchConfiguration {
    val propsBuilder = CfnLaunchConfigurationProps.builder()
    propsBuilder.init()
    
    return CfnLaunchConfiguration(this, id, propsBuilder.build())
}

fun Construct.stepScalingAction(id: String, init: StepScalingActionProps.Builder.() -> Unit): StepScalingAction {
    val propsBuilder = StepScalingActionProps.builder()
    propsBuilder.init()
    
    return StepScalingAction(this, id, propsBuilder.build())
}

fun Construct.lifecycleHook(id: String, init: LifecycleHookProps.Builder.() -> Unit): LifecycleHook {
    val propsBuilder = LifecycleHookProps.builder()
    propsBuilder.init()
    
    return LifecycleHook(this, id, propsBuilder.build())
}

fun Construct.autoScalingGroup(id: String, init: AutoScalingGroupProps.Builder.() -> Unit): AutoScalingGroup {
    val propsBuilder = AutoScalingGroupProps.builder()
    propsBuilder.init()
    
    return AutoScalingGroup(this, id, propsBuilder.build())
}

fun Construct.cfnLifecycleHook(id: String, init: CfnLifecycleHookProps.Builder.() -> Unit): CfnLifecycleHook {
    val propsBuilder = CfnLifecycleHookProps.builder()
    propsBuilder.init()
    
    return CfnLifecycleHook(this, id, propsBuilder.build())
}

fun Construct.stepScalingPolicy(id: String, init: StepScalingPolicyProps.Builder.() -> Unit): StepScalingPolicy {
    val propsBuilder = StepScalingPolicyProps.builder()
    propsBuilder.init()
    
    return StepScalingPolicy(this, id, propsBuilder.build())
}

fun Construct.cfnScalingPolicy(id: String, init: CfnScalingPolicyProps.Builder.() -> Unit): CfnScalingPolicy {
    val propsBuilder = CfnScalingPolicyProps.builder()
    propsBuilder.init()
    
    return CfnScalingPolicy(this, id, propsBuilder.build())
}

fun Construct.cfnAutoScalingGroup(id: String, init: CfnAutoScalingGroupProps.Builder.() -> Unit): CfnAutoScalingGroup {
    val propsBuilder = CfnAutoScalingGroupProps.builder()
    propsBuilder.init()
    
    return CfnAutoScalingGroup(this, id, propsBuilder.build())
}

fun Construct.cfnScheduledAction(id: String, init: CfnScheduledActionProps.Builder.() -> Unit): CfnScheduledAction {
    val propsBuilder = CfnScheduledActionProps.builder()
    propsBuilder.init()
    
    return CfnScheduledAction(this, id, propsBuilder.build())
}

fun Construct.targetTrackingScalingPolicy(id: String, init: TargetTrackingScalingPolicyProps.Builder.() -> Unit): TargetTrackingScalingPolicy {
    val propsBuilder = TargetTrackingScalingPolicyProps.builder()
    propsBuilder.init()
    
    return TargetTrackingScalingPolicy(this, id, propsBuilder.build())
}

fun Construct.scheduledAction(id: String, init: ScheduledActionProps.Builder.() -> Unit): ScheduledAction {
    val propsBuilder = ScheduledActionProps.builder()
    propsBuilder.init()
    
    return ScheduledAction(this, id, propsBuilder.build())
}

