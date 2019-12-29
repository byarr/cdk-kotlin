package com.brianyarr.cdk.ses

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.ses.ReceiptRuleSet
import software.amazon.awscdk.services.ses.ReceiptRuleSetProps
import software.amazon.awscdk.services.ses.ReceiptFilter
import software.amazon.awscdk.services.ses.ReceiptFilterProps
import software.amazon.awscdk.services.ses.ReceiptRule
import software.amazon.awscdk.services.ses.ReceiptRuleProps

fun Construct.receiptRuleSet(id: String, init: ReceiptRuleSetProps.Builder.() -> Unit): ReceiptRuleSet {
    val propsBuilder = ReceiptRuleSetProps.builder()
    propsBuilder.init()
    
    return ReceiptRuleSet(this, id, propsBuilder.build())
}


fun Construct.receiptFilter(id: String, init: ReceiptFilterProps.Builder.() -> Unit): ReceiptFilter {
    val propsBuilder = ReceiptFilterProps.builder()
    propsBuilder.init()
    
    return ReceiptFilter(this, id, propsBuilder.build())
}


fun Construct.receiptRule(id: String, init: ReceiptRuleProps.Builder.() -> Unit): ReceiptRule {
    val propsBuilder = ReceiptRuleProps.builder()
    propsBuilder.init()
    
    return ReceiptRule(this, id, propsBuilder.build())
}


