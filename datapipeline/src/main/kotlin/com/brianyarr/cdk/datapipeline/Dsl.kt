package com.brianyarr.cdk.datapipeline

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.datapipeline.CfnPipeline
import software.amazon.awscdk.services.datapipeline.CfnPipelineProps

fun Construct.cfnPipeline(id: String, init: CfnPipelineProps.Builder.() -> Unit): CfnPipeline {
    val propsBuilder = CfnPipelineProps.builder()
    propsBuilder.init()
    
    return CfnPipeline(this, id, propsBuilder.build())
}

