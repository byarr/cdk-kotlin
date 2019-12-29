package com.brianyarr.cdk.codepipeline

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.codepipeline.Pipeline
import software.amazon.awscdk.services.codepipeline.PipelineProps

fun Construct.pipeline(id: String, init: PipelineProps.Builder.() -> Unit): Pipeline {
    val propsBuilder = PipelineProps.builder()
    propsBuilder.init()
    
    return Pipeline(this, id, propsBuilder.build())
}


