package com.brianyarr.cdk.applicationautoscaling

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps
import software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy
import software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps
import software.amazon.awscdk.services.applicationautoscaling.StepScalingAction
import software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps
import software.amazon.awscdk.services.applicationautoscaling.ScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps
import software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicy
import software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps

fun Construct.cfnScalableTarget(id: String, init: CfnScalableTargetProps.Builder.() -> Unit): CfnScalableTarget {
    val propsBuilder = CfnScalableTargetProps.builder()
    propsBuilder.init()
    
    return CfnScalableTarget(this, id, propsBuilder.build())
}

fun Construct.targetTrackingScalingPolicy(id: String, init: TargetTrackingScalingPolicyProps.Builder.() -> Unit): TargetTrackingScalingPolicy {
    val propsBuilder = TargetTrackingScalingPolicyProps.builder()
    propsBuilder.init()
    
    return TargetTrackingScalingPolicy(this, id, propsBuilder.build())
}

fun Construct.stepScalingAction(id: String, init: StepScalingActionProps.Builder.() -> Unit): StepScalingAction {
    val propsBuilder = StepScalingActionProps.builder()
    propsBuilder.init()
    
    return StepScalingAction(this, id, propsBuilder.build())
}

fun Construct.scalableTarget(id: String, init: ScalableTargetProps.Builder.() -> Unit): ScalableTarget {
    val propsBuilder = ScalableTargetProps.builder()
    propsBuilder.init()
    
    return ScalableTarget(this, id, propsBuilder.build())
}

fun Construct.cfnScalingPolicy(id: String, init: CfnScalingPolicyProps.Builder.() -> Unit): CfnScalingPolicy {
    val propsBuilder = CfnScalingPolicyProps.builder()
    propsBuilder.init()
    
    return CfnScalingPolicy(this, id, propsBuilder.build())
}

fun Construct.stepScalingPolicy(id: String, init: StepScalingPolicyProps.Builder.() -> Unit): StepScalingPolicy {
    val propsBuilder = StepScalingPolicyProps.builder()
    propsBuilder.init()
    
    return StepScalingPolicy(this, id, propsBuilder.build())
}

