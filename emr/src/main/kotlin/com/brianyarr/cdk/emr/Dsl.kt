package com.brianyarr.cdk.emr

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps
import software.amazon.awscdk.services.emr.CfnCluster
import software.amazon.awscdk.services.emr.CfnClusterProps
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfig
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps
import software.amazon.awscdk.services.emr.CfnSecurityConfiguration
import software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps
import software.amazon.awscdk.services.emr.CfnStep
import software.amazon.awscdk.services.emr.CfnStepProps

fun Construct.cfnInstanceGroupConfig(id: String, init: CfnInstanceGroupConfigProps.Builder.() -> Unit): CfnInstanceGroupConfig {
    val propsBuilder = CfnInstanceGroupConfigProps.builder()
    propsBuilder.init()
    
    return CfnInstanceGroupConfig(this, id, propsBuilder.build())
}

fun Construct.cfnCluster(id: String, init: CfnClusterProps.Builder.() -> Unit): CfnCluster {
    val propsBuilder = CfnClusterProps.builder()
    propsBuilder.init()
    
    return CfnCluster(this, id, propsBuilder.build())
}

fun Construct.cfnInstanceFleetConfig(id: String, init: CfnInstanceFleetConfigProps.Builder.() -> Unit): CfnInstanceFleetConfig {
    val propsBuilder = CfnInstanceFleetConfigProps.builder()
    propsBuilder.init()
    
    return CfnInstanceFleetConfig(this, id, propsBuilder.build())
}

fun Construct.cfnSecurityConfiguration(id: String, init: CfnSecurityConfigurationProps.Builder.() -> Unit): CfnSecurityConfiguration {
    val propsBuilder = CfnSecurityConfigurationProps.builder()
    propsBuilder.init()
    
    return CfnSecurityConfiguration(this, id, propsBuilder.build())
}

fun Construct.cfnStep(id: String, init: CfnStepProps.Builder.() -> Unit): CfnStep {
    val propsBuilder = CfnStepProps.builder()
    propsBuilder.init()
    
    return CfnStep(this, id, propsBuilder.build())
}

