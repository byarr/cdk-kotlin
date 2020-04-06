package com.brianyarr.cdk.batch

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.batch.CfnComputeEnvironment
import software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps
import software.amazon.awscdk.services.batch.CfnJobQueue
import software.amazon.awscdk.services.batch.CfnJobQueueProps
import software.amazon.awscdk.services.batch.CfnJobDefinition
import software.amazon.awscdk.services.batch.CfnJobDefinitionProps

fun Construct.cfnComputeEnvironment(id: String, init: CfnComputeEnvironmentProps.Builder.() -> Unit): CfnComputeEnvironment {
    val propsBuilder = CfnComputeEnvironmentProps.builder()
    propsBuilder.init()
    
    return CfnComputeEnvironment(this, id, propsBuilder.build())
}

fun Construct.cfnJobQueue(id: String, init: CfnJobQueueProps.Builder.() -> Unit): CfnJobQueue {
    val propsBuilder = CfnJobQueueProps.builder()
    propsBuilder.init()
    
    return CfnJobQueue(this, id, propsBuilder.build())
}

fun Construct.cfnJobDefinition(id: String, init: CfnJobDefinitionProps.Builder.() -> Unit): CfnJobDefinition {
    val propsBuilder = CfnJobDefinitionProps.builder()
    propsBuilder.init()
    
    return CfnJobDefinition(this, id, propsBuilder.build())
}

