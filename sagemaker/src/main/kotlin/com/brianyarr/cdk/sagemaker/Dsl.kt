package com.brianyarr.cdk.sagemaker

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.sagemaker.CfnCodeRepository
import software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstance
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps
import software.amazon.awscdk.services.sagemaker.CfnModel
import software.amazon.awscdk.services.sagemaker.CfnModelProps
import software.amazon.awscdk.services.sagemaker.CfnWorkteam
import software.amazon.awscdk.services.sagemaker.CfnWorkteamProps
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps
import software.amazon.awscdk.services.sagemaker.CfnEndpoint
import software.amazon.awscdk.services.sagemaker.CfnEndpointProps

fun Construct.cfnCodeRepository(id: String, init: CfnCodeRepositoryProps.Builder.() -> Unit): CfnCodeRepository {
    val propsBuilder = CfnCodeRepositoryProps.builder()
    propsBuilder.init()
    
    return CfnCodeRepository(this, id, propsBuilder.build())
}

fun Construct.cfnNotebookInstanceLifecycleConfig(id: String, init: CfnNotebookInstanceLifecycleConfigProps.Builder.() -> Unit): CfnNotebookInstanceLifecycleConfig {
    val propsBuilder = CfnNotebookInstanceLifecycleConfigProps.builder()
    propsBuilder.init()
    
    return CfnNotebookInstanceLifecycleConfig(this, id, propsBuilder.build())
}

fun Construct.cfnNotebookInstance(id: String, init: CfnNotebookInstanceProps.Builder.() -> Unit): CfnNotebookInstance {
    val propsBuilder = CfnNotebookInstanceProps.builder()
    propsBuilder.init()
    
    return CfnNotebookInstance(this, id, propsBuilder.build())
}

fun Construct.cfnModel(id: String, init: CfnModelProps.Builder.() -> Unit): CfnModel {
    val propsBuilder = CfnModelProps.builder()
    propsBuilder.init()
    
    return CfnModel(this, id, propsBuilder.build())
}

fun Construct.cfnWorkteam(id: String, init: CfnWorkteamProps.Builder.() -> Unit): CfnWorkteam {
    val propsBuilder = CfnWorkteamProps.builder()
    propsBuilder.init()
    
    return CfnWorkteam(this, id, propsBuilder.build())
}

fun Construct.cfnEndpointConfig(id: String, init: CfnEndpointConfigProps.Builder.() -> Unit): CfnEndpointConfig {
    val propsBuilder = CfnEndpointConfigProps.builder()
    propsBuilder.init()
    
    return CfnEndpointConfig(this, id, propsBuilder.build())
}

fun Construct.cfnEndpoint(id: String, init: CfnEndpointProps.Builder.() -> Unit): CfnEndpoint {
    val propsBuilder = CfnEndpointProps.builder()
    propsBuilder.init()
    
    return CfnEndpoint(this, id, propsBuilder.build())
}

