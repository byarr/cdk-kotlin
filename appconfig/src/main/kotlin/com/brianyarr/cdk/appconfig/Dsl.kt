package com.brianyarr.cdk.appconfig

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy
import software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps
import software.amazon.awscdk.services.appconfig.CfnDeployment
import software.amazon.awscdk.services.appconfig.CfnDeploymentProps
import software.amazon.awscdk.services.appconfig.CfnEnvironment
import software.amazon.awscdk.services.appconfig.CfnEnvironmentProps
import software.amazon.awscdk.services.appconfig.CfnConfigurationProfile
import software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps
import software.amazon.awscdk.services.appconfig.CfnApplication
import software.amazon.awscdk.services.appconfig.CfnApplicationProps

fun Construct.cfnDeploymentStrategy(id: String, init: CfnDeploymentStrategyProps.Builder.() -> Unit): CfnDeploymentStrategy {
    val propsBuilder = CfnDeploymentStrategyProps.builder()
    propsBuilder.init()
    
    return CfnDeploymentStrategy(this, id, propsBuilder.build())
}

fun Construct.cfnDeployment(id: String, init: CfnDeploymentProps.Builder.() -> Unit): CfnDeployment {
    val propsBuilder = CfnDeploymentProps.builder()
    propsBuilder.init()
    
    return CfnDeployment(this, id, propsBuilder.build())
}

fun Construct.cfnEnvironment(id: String, init: CfnEnvironmentProps.Builder.() -> Unit): CfnEnvironment {
    val propsBuilder = CfnEnvironmentProps.builder()
    propsBuilder.init()
    
    return CfnEnvironment(this, id, propsBuilder.build())
}

fun Construct.cfnConfigurationProfile(id: String, init: CfnConfigurationProfileProps.Builder.() -> Unit): CfnConfigurationProfile {
    val propsBuilder = CfnConfigurationProfileProps.builder()
    propsBuilder.init()
    
    return CfnConfigurationProfile(this, id, propsBuilder.build())
}

fun Construct.cfnApplication(id: String, init: CfnApplicationProps.Builder.() -> Unit): CfnApplication {
    val propsBuilder = CfnApplicationProps.builder()
    propsBuilder.init()
    
    return CfnApplication(this, id, propsBuilder.build())
}

