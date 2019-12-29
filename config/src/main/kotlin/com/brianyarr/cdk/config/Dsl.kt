package com.brianyarr.cdk.config

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck
import software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps
import software.amazon.awscdk.services.config.CustomRule
import software.amazon.awscdk.services.config.CustomRuleProps
import software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheck
import software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps
import software.amazon.awscdk.services.config.AccessKeysRotated
import software.amazon.awscdk.services.config.AccessKeysRotatedProps
import software.amazon.awscdk.services.config.ManagedRule
import software.amazon.awscdk.services.config.ManagedRuleProps

fun Construct.cloudFormationStackNotificationCheck(id: String, init: CloudFormationStackNotificationCheckProps.Builder.() -> Unit): CloudFormationStackNotificationCheck {
    val propsBuilder = CloudFormationStackNotificationCheckProps.builder()
    propsBuilder.init()
    
    return CloudFormationStackNotificationCheck(this, id, propsBuilder.build())
}


fun Construct.customRule(id: String, init: CustomRuleProps.Builder.() -> Unit): CustomRule {
    val propsBuilder = CustomRuleProps.builder()
    propsBuilder.init()
    
    return CustomRule(this, id, propsBuilder.build())
}


fun Construct.cloudFormationStackDriftDetectionCheck(id: String, init: CloudFormationStackDriftDetectionCheckProps.Builder.() -> Unit): CloudFormationStackDriftDetectionCheck {
    val propsBuilder = CloudFormationStackDriftDetectionCheckProps.builder()
    propsBuilder.init()
    
    return CloudFormationStackDriftDetectionCheck(this, id, propsBuilder.build())
}


fun Construct.accessKeysRotated(id: String, init: AccessKeysRotatedProps.Builder.() -> Unit): AccessKeysRotated {
    val propsBuilder = AccessKeysRotatedProps.builder()
    propsBuilder.init()
    
    return AccessKeysRotated(this, id, propsBuilder.build())
}


fun Construct.managedRule(id: String, init: ManagedRuleProps.Builder.() -> Unit): ManagedRule {
    val propsBuilder = ManagedRuleProps.builder()
    propsBuilder.init()
    
    return ManagedRule(this, id, propsBuilder.build())
}


