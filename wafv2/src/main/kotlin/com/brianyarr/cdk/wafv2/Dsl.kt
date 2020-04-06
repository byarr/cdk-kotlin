package com.brianyarr.cdk.wafv2

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.wafv2.CfnIPSet
import software.amazon.awscdk.services.wafv2.CfnIPSetProps
import software.amazon.awscdk.services.wafv2.CfnRegexPatternSet
import software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps
import software.amazon.awscdk.services.wafv2.CfnRuleGroup
import software.amazon.awscdk.services.wafv2.CfnRuleGroupProps
import software.amazon.awscdk.services.wafv2.CfnWebACL
import software.amazon.awscdk.services.wafv2.CfnWebACLProps

fun Construct.cfnIPSet(id: String, init: CfnIPSetProps.Builder.() -> Unit): CfnIPSet {
    val propsBuilder = CfnIPSetProps.builder()
    propsBuilder.init()
    
    return CfnIPSet(this, id, propsBuilder.build())
}

fun Construct.cfnRegexPatternSet(id: String, init: CfnRegexPatternSetProps.Builder.() -> Unit): CfnRegexPatternSet {
    val propsBuilder = CfnRegexPatternSetProps.builder()
    propsBuilder.init()
    
    return CfnRegexPatternSet(this, id, propsBuilder.build())
}

fun Construct.cfnRuleGroup(id: String, init: CfnRuleGroupProps.Builder.() -> Unit): CfnRuleGroup {
    val propsBuilder = CfnRuleGroupProps.builder()
    propsBuilder.init()
    
    return CfnRuleGroup(this, id, propsBuilder.build())
}

fun Construct.cfnWebACL(id: String, init: CfnWebACLProps.Builder.() -> Unit): CfnWebACL {
    val propsBuilder = CfnWebACLProps.builder()
    propsBuilder.init()
    
    return CfnWebACL(this, id, propsBuilder.build())
}

