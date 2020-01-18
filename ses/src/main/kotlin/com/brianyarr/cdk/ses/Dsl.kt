package com.brianyarr.cdk.ses

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.ses.CfnReceiptRule
import software.amazon.awscdk.services.ses.CfnReceiptRuleProps
import software.amazon.awscdk.services.ses.CfnReceiptFilter
import software.amazon.awscdk.services.ses.CfnReceiptFilterProps
import software.amazon.awscdk.services.ses.CfnConfigurationSet
import software.amazon.awscdk.services.ses.CfnConfigurationSetProps
import software.amazon.awscdk.services.ses.ReceiptFilter
import software.amazon.awscdk.services.ses.ReceiptFilterProps
import software.amazon.awscdk.services.ses.WhiteListReceiptFilter
import software.amazon.awscdk.services.ses.WhiteListReceiptFilterProps
import software.amazon.awscdk.services.ses.ReceiptRule
import software.amazon.awscdk.services.ses.ReceiptRuleProps
import software.amazon.awscdk.services.ses.CfnTemplate
import software.amazon.awscdk.services.ses.CfnTemplateProps
import software.amazon.awscdk.services.ses.DropSpamReceiptRule
import software.amazon.awscdk.services.ses.DropSpamReceiptRuleProps
import software.amazon.awscdk.services.ses.ReceiptRuleSet
import software.amazon.awscdk.services.ses.ReceiptRuleSetProps
import software.amazon.awscdk.services.ses.CfnReceiptRuleSet
import software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestinationProps

fun Construct.cfnReceiptRule(id: String, init: CfnReceiptRuleProps.Builder.() -> Unit): CfnReceiptRule {
    val propsBuilder = CfnReceiptRuleProps.builder()
    propsBuilder.init()
    
    return CfnReceiptRule(this, id, propsBuilder.build())
}

fun Construct.cfnReceiptFilter(id: String, init: CfnReceiptFilterProps.Builder.() -> Unit): CfnReceiptFilter {
    val propsBuilder = CfnReceiptFilterProps.builder()
    propsBuilder.init()
    
    return CfnReceiptFilter(this, id, propsBuilder.build())
}

fun Construct.cfnConfigurationSet(id: String, init: CfnConfigurationSetProps.Builder.() -> Unit): CfnConfigurationSet {
    val propsBuilder = CfnConfigurationSetProps.builder()
    propsBuilder.init()
    
    return CfnConfigurationSet(this, id, propsBuilder.build())
}

fun Construct.receiptFilter(id: String, init: ReceiptFilterProps.Builder.() -> Unit): ReceiptFilter {
    val propsBuilder = ReceiptFilterProps.builder()
    propsBuilder.init()
    
    return ReceiptFilter(this, id, propsBuilder.build())
}

fun Construct.whiteListReceiptFilter(id: String, init: WhiteListReceiptFilterProps.Builder.() -> Unit): WhiteListReceiptFilter {
    val propsBuilder = WhiteListReceiptFilterProps.builder()
    propsBuilder.init()
    
    return WhiteListReceiptFilter(this, id, propsBuilder.build())
}

fun Construct.receiptRule(id: String, init: ReceiptRuleProps.Builder.() -> Unit): ReceiptRule {
    val propsBuilder = ReceiptRuleProps.builder()
    propsBuilder.init()
    
    return ReceiptRule(this, id, propsBuilder.build())
}

fun Construct.cfnTemplate(id: String, init: CfnTemplateProps.Builder.() -> Unit): CfnTemplate {
    val propsBuilder = CfnTemplateProps.builder()
    propsBuilder.init()
    
    return CfnTemplate(this, id, propsBuilder.build())
}

fun Construct.dropSpamReceiptRule(id: String, init: DropSpamReceiptRuleProps.Builder.() -> Unit): DropSpamReceiptRule {
    val propsBuilder = DropSpamReceiptRuleProps.builder()
    propsBuilder.init()
    
    return DropSpamReceiptRule(this, id, propsBuilder.build())
}

fun Construct.receiptRuleSet(id: String, init: ReceiptRuleSetProps.Builder.() -> Unit): ReceiptRuleSet {
    val propsBuilder = ReceiptRuleSetProps.builder()
    propsBuilder.init()
    
    return ReceiptRuleSet(this, id, propsBuilder.build())
}

fun Construct.cfnReceiptRuleSet(id: String, init: CfnReceiptRuleSetProps.Builder.() -> Unit): CfnReceiptRuleSet {
    val propsBuilder = CfnReceiptRuleSetProps.builder()
    propsBuilder.init()
    
    return CfnReceiptRuleSet(this, id, propsBuilder.build())
}

fun Construct.cfnConfigurationSetEventDestination(id: String, init: CfnConfigurationSetEventDestinationProps.Builder.() -> Unit): CfnConfigurationSetEventDestination {
    val propsBuilder = CfnConfigurationSetEventDestinationProps.builder()
    propsBuilder.init()
    
    return CfnConfigurationSetEventDestination(this, id, propsBuilder.build())
}

