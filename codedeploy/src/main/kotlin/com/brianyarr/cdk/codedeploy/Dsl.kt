package com.brianyarr.cdk.codedeploy

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.codedeploy.EcsApplication
import software.amazon.awscdk.services.codedeploy.EcsApplicationProps
import software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup
import software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupProps
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroup
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps
import software.amazon.awscdk.services.codedeploy.LambdaApplication
import software.amazon.awscdk.services.codedeploy.LambdaApplicationProps
import software.amazon.awscdk.services.codedeploy.ServerApplication
import software.amazon.awscdk.services.codedeploy.ServerApplicationProps
import software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig
import software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps

fun Construct.ecsApplication(id: String, init: EcsApplicationProps.Builder.() -> Unit): EcsApplication {
    val propsBuilder = EcsApplicationProps.builder()
    propsBuilder.init()
    
    return EcsApplication(this, id, propsBuilder.build())
}


fun Construct.serverDeploymentGroup(id: String, init: ServerDeploymentGroupProps.Builder.() -> Unit): ServerDeploymentGroup {
    val propsBuilder = ServerDeploymentGroupProps.builder()
    propsBuilder.init()
    
    return ServerDeploymentGroup(this, id, propsBuilder.build())
}


fun Construct.lambdaDeploymentGroup(id: String, init: LambdaDeploymentGroupProps.Builder.() -> Unit): LambdaDeploymentGroup {
    val propsBuilder = LambdaDeploymentGroupProps.builder()
    propsBuilder.init()
    
    return LambdaDeploymentGroup(this, id, propsBuilder.build())
}


fun Construct.lambdaApplication(id: String, init: LambdaApplicationProps.Builder.() -> Unit): LambdaApplication {
    val propsBuilder = LambdaApplicationProps.builder()
    propsBuilder.init()
    
    return LambdaApplication(this, id, propsBuilder.build())
}


fun Construct.serverApplication(id: String, init: ServerApplicationProps.Builder.() -> Unit): ServerApplication {
    val propsBuilder = ServerApplicationProps.builder()
    propsBuilder.init()
    
    return ServerApplication(this, id, propsBuilder.build())
}


fun Construct.serverDeploymentConfig(id: String, init: ServerDeploymentConfigProps.Builder.() -> Unit): ServerDeploymentConfig {
    val propsBuilder = ServerDeploymentConfigProps.builder()
    propsBuilder.init()
    
    return ServerDeploymentConfig(this, id, propsBuilder.build())
}


