package com.brianyarr.cdk.batch

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.batch.CfnJobQueue
import software.amazon.awscdk.services.batch.CfnJobQueueProps
import software.amazon.awscdk.services.batch.JobDefinition
import software.amazon.awscdk.services.batch.JobDefinitionProps
import software.amazon.awscdk.services.batch.CfnJobDefinition
import software.amazon.awscdk.services.batch.CfnJobDefinitionProps
import software.amazon.awscdk.services.batch.JobQueue
import software.amazon.awscdk.services.batch.JobQueueProps
import software.amazon.awscdk.services.batch.CfnComputeEnvironment
import software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps
import software.amazon.awscdk.services.batch.ComputeEnvironment
import software.amazon.awscdk.services.batch.ComputeEnvironmentProps

fun Construct.cfnJobQueue(id: String, init: CfnJobQueueProps.Builder.() -> Unit): CfnJobQueue {
    val propsBuilder = CfnJobQueueProps.builder()
    propsBuilder.init()
    
    return CfnJobQueue(this, id, propsBuilder.build())
}

fun Construct.jobDefinition(id: String, init: JobDefinitionProps.Builder.() -> Unit): JobDefinition {
    val propsBuilder = JobDefinitionProps.builder()
    propsBuilder.init()
    
    return JobDefinition(this, id, propsBuilder.build())
}

fun Construct.cfnJobDefinition(id: String, init: CfnJobDefinitionProps.Builder.() -> Unit): CfnJobDefinition {
    val propsBuilder = CfnJobDefinitionProps.builder()
    propsBuilder.init()
    
    return CfnJobDefinition(this, id, propsBuilder.build())
}

fun Construct.jobQueue(id: String, init: JobQueueProps.Builder.() -> Unit): JobQueue {
    val propsBuilder = JobQueueProps.builder()
    propsBuilder.init()
    
    return JobQueue(this, id, propsBuilder.build())
}

fun Construct.cfnComputeEnvironment(id: String, init: CfnComputeEnvironmentProps.Builder.() -> Unit): CfnComputeEnvironment {
    val propsBuilder = CfnComputeEnvironmentProps.builder()
    propsBuilder.init()
    
    return CfnComputeEnvironment(this, id, propsBuilder.build())
}

fun Construct.computeEnvironment(id: String, init: ComputeEnvironmentProps.Builder.() -> Unit): ComputeEnvironment {
    val propsBuilder = ComputeEnvironmentProps.builder()
    propsBuilder.init()
    
    return ComputeEnvironment(this, id, propsBuilder.build())
}

