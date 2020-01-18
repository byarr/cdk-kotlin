package com.brianyarr.cdk.codestarnotifications

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule
import software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps

fun Construct.cfnNotificationRule(id: String, init: CfnNotificationRuleProps.Builder.() -> Unit): CfnNotificationRule {
    val propsBuilder = CfnNotificationRuleProps.builder()
    propsBuilder.init()
    
    return CfnNotificationRule(this, id, propsBuilder.build())
}

