package com.brianyarr.cdk.codepipeline

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.codepipeline.Pipeline
import software.amazon.awscdk.services.codepipeline.PipelineProps
import software.amazon.awscdk.services.codepipeline.CfnPipeline
import software.amazon.awscdk.services.codepipeline.CfnPipelineProps
import software.amazon.awscdk.services.codepipeline.CfnCustomActionType
import software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps
import software.amazon.awscdk.services.codepipeline.CfnWebhook
import software.amazon.awscdk.services.codepipeline.CfnWebhookProps

fun Construct.pipeline(id: String, init: PipelineProps.Builder.() -> Unit): Pipeline {
    val propsBuilder = PipelineProps.builder()
    propsBuilder.init()
    
    return Pipeline(this, id, propsBuilder.build())
}

fun Construct.cfnPipeline(id: String, init: CfnPipelineProps.Builder.() -> Unit): CfnPipeline {
    val propsBuilder = CfnPipelineProps.builder()
    propsBuilder.init()
    
    return CfnPipeline(this, id, propsBuilder.build())
}

fun Construct.cfnCustomActionType(id: String, init: CfnCustomActionTypeProps.Builder.() -> Unit): CfnCustomActionType {
    val propsBuilder = CfnCustomActionTypeProps.builder()
    propsBuilder.init()
    
    return CfnCustomActionType(this, id, propsBuilder.build())
}

fun Construct.cfnWebhook(id: String, init: CfnWebhookProps.Builder.() -> Unit): CfnWebhook {
    val propsBuilder = CfnWebhookProps.builder()
    propsBuilder.init()
    
    return CfnWebhook(this, id, propsBuilder.build())
}

