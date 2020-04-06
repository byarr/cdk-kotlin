package com.brianyarr.cdk.iotanalytics

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.iotanalytics.CfnDatastore
import software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps
import software.amazon.awscdk.services.iotanalytics.CfnChannel
import software.amazon.awscdk.services.iotanalytics.CfnChannelProps
import software.amazon.awscdk.services.iotanalytics.CfnDataset
import software.amazon.awscdk.services.iotanalytics.CfnDatasetProps
import software.amazon.awscdk.services.iotanalytics.CfnPipeline
import software.amazon.awscdk.services.iotanalytics.CfnPipelineProps

fun Construct.cfnDatastore(id: String, init: CfnDatastoreProps.Builder.() -> Unit): CfnDatastore {
    val propsBuilder = CfnDatastoreProps.builder()
    propsBuilder.init()
    
    return CfnDatastore(this, id, propsBuilder.build())
}

fun Construct.cfnChannel(id: String, init: CfnChannelProps.Builder.() -> Unit): CfnChannel {
    val propsBuilder = CfnChannelProps.builder()
    propsBuilder.init()
    
    return CfnChannel(this, id, propsBuilder.build())
}

fun Construct.cfnDataset(id: String, init: CfnDatasetProps.Builder.() -> Unit): CfnDataset {
    val propsBuilder = CfnDatasetProps.builder()
    propsBuilder.init()
    
    return CfnDataset(this, id, propsBuilder.build())
}

fun Construct.cfnPipeline(id: String, init: CfnPipelineProps.Builder.() -> Unit): CfnPipeline {
    val propsBuilder = CfnPipelineProps.builder()
    propsBuilder.init()
    
    return CfnPipeline(this, id, propsBuilder.build())
}

