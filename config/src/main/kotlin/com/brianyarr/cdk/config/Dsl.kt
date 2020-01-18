package com.brianyarr.cdk.config

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.config.CfnAggregationAuthorization
import software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps
import software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheck
import software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps
import software.amazon.awscdk.services.config.CustomRule
import software.amazon.awscdk.services.config.CustomRuleProps
import software.amazon.awscdk.services.config.ManagedRule
import software.amazon.awscdk.services.config.ManagedRuleProps
import software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck
import software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps
import software.amazon.awscdk.services.config.CfnDeliveryChannel
import software.amazon.awscdk.services.config.CfnDeliveryChannelProps
import software.amazon.awscdk.services.config.CfnRemediationConfiguration
import software.amazon.awscdk.services.config.CfnRemediationConfigurationProps
import software.amazon.awscdk.services.config.AccessKeysRotated
import software.amazon.awscdk.services.config.AccessKeysRotatedProps
import software.amazon.awscdk.services.config.CfnConfigurationAggregator
import software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps
import software.amazon.awscdk.services.config.CfnConfigRule
import software.amazon.awscdk.services.config.CfnConfigRuleProps
import software.amazon.awscdk.services.config.CfnConfigurationRecorder
import software.amazon.awscdk.services.config.CfnConfigurationRecorderProps
import software.amazon.awscdk.services.config.CfnOrganizationConfigRule
import software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps

fun Construct.cfnAggregationAuthorization(id: String, init: CfnAggregationAuthorizationProps.Builder.() -> Unit): CfnAggregationAuthorization {
    val propsBuilder = CfnAggregationAuthorizationProps.builder()
    propsBuilder.init()
    
    return CfnAggregationAuthorization(this, id, propsBuilder.build())
}

fun Construct.cloudFormationStackDriftDetectionCheck(id: String, init: CloudFormationStackDriftDetectionCheckProps.Builder.() -> Unit): CloudFormationStackDriftDetectionCheck {
    val propsBuilder = CloudFormationStackDriftDetectionCheckProps.builder()
    propsBuilder.init()
    
    return CloudFormationStackDriftDetectionCheck(this, id, propsBuilder.build())
}

fun Construct.customRule(id: String, init: CustomRuleProps.Builder.() -> Unit): CustomRule {
    val propsBuilder = CustomRuleProps.builder()
    propsBuilder.init()
    
    return CustomRule(this, id, propsBuilder.build())
}

fun Construct.managedRule(id: String, init: ManagedRuleProps.Builder.() -> Unit): ManagedRule {
    val propsBuilder = ManagedRuleProps.builder()
    propsBuilder.init()
    
    return ManagedRule(this, id, propsBuilder.build())
}

fun Construct.cloudFormationStackNotificationCheck(id: String, init: CloudFormationStackNotificationCheckProps.Builder.() -> Unit): CloudFormationStackNotificationCheck {
    val propsBuilder = CloudFormationStackNotificationCheckProps.builder()
    propsBuilder.init()
    
    return CloudFormationStackNotificationCheck(this, id, propsBuilder.build())
}

fun Construct.cfnDeliveryChannel(id: String, init: CfnDeliveryChannelProps.Builder.() -> Unit): CfnDeliveryChannel {
    val propsBuilder = CfnDeliveryChannelProps.builder()
    propsBuilder.init()
    
    return CfnDeliveryChannel(this, id, propsBuilder.build())
}

fun Construct.cfnRemediationConfiguration(id: String, init: CfnRemediationConfigurationProps.Builder.() -> Unit): CfnRemediationConfiguration {
    val propsBuilder = CfnRemediationConfigurationProps.builder()
    propsBuilder.init()
    
    return CfnRemediationConfiguration(this, id, propsBuilder.build())
}

fun Construct.accessKeysRotated(id: String, init: AccessKeysRotatedProps.Builder.() -> Unit): AccessKeysRotated {
    val propsBuilder = AccessKeysRotatedProps.builder()
    propsBuilder.init()
    
    return AccessKeysRotated(this, id, propsBuilder.build())
}

fun Construct.cfnConfigurationAggregator(id: String, init: CfnConfigurationAggregatorProps.Builder.() -> Unit): CfnConfigurationAggregator {
    val propsBuilder = CfnConfigurationAggregatorProps.builder()
    propsBuilder.init()
    
    return CfnConfigurationAggregator(this, id, propsBuilder.build())
}

fun Construct.cfnConfigRule(id: String, init: CfnConfigRuleProps.Builder.() -> Unit): CfnConfigRule {
    val propsBuilder = CfnConfigRuleProps.builder()
    propsBuilder.init()
    
    return CfnConfigRule(this, id, propsBuilder.build())
}

fun Construct.cfnConfigurationRecorder(id: String, init: CfnConfigurationRecorderProps.Builder.() -> Unit): CfnConfigurationRecorder {
    val propsBuilder = CfnConfigurationRecorderProps.builder()
    propsBuilder.init()
    
    return CfnConfigurationRecorder(this, id, propsBuilder.build())
}

fun Construct.cfnOrganizationConfigRule(id: String, init: CfnOrganizationConfigRuleProps.Builder.() -> Unit): CfnOrganizationConfigRule {
    val propsBuilder = CfnOrganizationConfigRuleProps.builder()
    propsBuilder.init()
    
    return CfnOrganizationConfigRule(this, id, propsBuilder.build())
}

