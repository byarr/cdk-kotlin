package com.brianyarr.cdk.codedeploy

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroup
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfigProps
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps
import software.amazon.awscdk.services.codedeploy.CfnApplication
import software.amazon.awscdk.services.codedeploy.CfnApplicationProps
import software.amazon.awscdk.services.codedeploy.LambdaApplication
import software.amazon.awscdk.services.codedeploy.LambdaApplicationProps
import software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup
import software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupProps
import software.amazon.awscdk.services.codedeploy.ServerApplication
import software.amazon.awscdk.services.codedeploy.ServerApplicationProps
import software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig
import software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps
import software.amazon.awscdk.services.codedeploy.EcsApplication
import software.amazon.awscdk.services.codedeploy.EcsApplicationProps

fun Construct.lambdaDeploymentGroup(id: String, init: LambdaDeploymentGroupProps.Builder.() -> Unit): LambdaDeploymentGroup {
    val propsBuilder = LambdaDeploymentGroupProps.builder()
    propsBuilder.init()
    
    return LambdaDeploymentGroup(this, id, propsBuilder.build())
}

fun Construct.cfnDeploymentConfig(id: String, init: CfnDeploymentConfigProps.Builder.() -> Unit): CfnDeploymentConfig {
    val propsBuilder = CfnDeploymentConfigProps.builder()
    propsBuilder.init()
    
    return CfnDeploymentConfig(this, id, propsBuilder.build())
}

fun Construct.cfnDeploymentGroup(id: String, init: CfnDeploymentGroupProps.Builder.() -> Unit): CfnDeploymentGroup {
    val propsBuilder = CfnDeploymentGroupProps.builder()
    propsBuilder.init()
    
    return CfnDeploymentGroup(this, id, propsBuilder.build())
}

fun Construct.cfnApplication(id: String, init: CfnApplicationProps.Builder.() -> Unit): CfnApplication {
    val propsBuilder = CfnApplicationProps.builder()
    propsBuilder.init()
    
    return CfnApplication(this, id, propsBuilder.build())
}

fun Construct.lambdaApplication(id: String, init: LambdaApplicationProps.Builder.() -> Unit): LambdaApplication {
    val propsBuilder = LambdaApplicationProps.builder()
    propsBuilder.init()
    
    return LambdaApplication(this, id, propsBuilder.build())
}

fun Construct.serverDeploymentGroup(id: String, init: ServerDeploymentGroupProps.Builder.() -> Unit): ServerDeploymentGroup {
    val propsBuilder = ServerDeploymentGroupProps.builder()
    propsBuilder.init()
    
    return ServerDeploymentGroup(this, id, propsBuilder.build())
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

fun Construct.ecsApplication(id: String, init: EcsApplicationProps.Builder.() -> Unit): EcsApplication {
    val propsBuilder = EcsApplicationProps.builder()
    propsBuilder.init()
    
    return EcsApplication(this, id, propsBuilder.build())
}

