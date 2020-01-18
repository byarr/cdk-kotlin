package com.brianyarr.cdk.amazonmq

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.amazonmq.CfnBroker
import software.amazon.awscdk.services.amazonmq.CfnBrokerProps
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps
import software.amazon.awscdk.services.amazonmq.CfnConfiguration
import software.amazon.awscdk.services.amazonmq.CfnConfigurationProps

fun Construct.cfnBroker(id: String, init: CfnBrokerProps.Builder.() -> Unit): CfnBroker {
    val propsBuilder = CfnBrokerProps.builder()
    propsBuilder.init()
    
    return CfnBroker(this, id, propsBuilder.build())
}

fun Construct.cfnConfigurationAssociation(id: String, init: CfnConfigurationAssociationProps.Builder.() -> Unit): CfnConfigurationAssociation {
    val propsBuilder = CfnConfigurationAssociationProps.builder()
    propsBuilder.init()
    
    return CfnConfigurationAssociation(this, id, propsBuilder.build())
}

fun Construct.cfnConfiguration(id: String, init: CfnConfigurationProps.Builder.() -> Unit): CfnConfiguration {
    val propsBuilder = CfnConfigurationProps.builder()
    propsBuilder.init()
    
    return CfnConfiguration(this, id, propsBuilder.build())
}

