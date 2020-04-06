package com.brianyarr.cdk.waf

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.waf.CfnRule
import software.amazon.awscdk.services.waf.CfnRuleProps
import software.amazon.awscdk.services.waf.CfnXssMatchSet
import software.amazon.awscdk.services.waf.CfnXssMatchSetProps
import software.amazon.awscdk.services.waf.CfnIPSet
import software.amazon.awscdk.services.waf.CfnIPSetProps
import software.amazon.awscdk.services.waf.CfnByteMatchSet
import software.amazon.awscdk.services.waf.CfnByteMatchSetProps
import software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet
import software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSetProps
import software.amazon.awscdk.services.waf.CfnSizeConstraintSet
import software.amazon.awscdk.services.waf.CfnSizeConstraintSetProps
import software.amazon.awscdk.services.waf.CfnWebACL
import software.amazon.awscdk.services.waf.CfnWebACLProps

fun Construct.cfnRule(id: String, init: CfnRuleProps.Builder.() -> Unit): CfnRule {
    val propsBuilder = CfnRuleProps.builder()
    propsBuilder.init()
    
    return CfnRule(this, id, propsBuilder.build())
}

fun Construct.cfnXssMatchSet(id: String, init: CfnXssMatchSetProps.Builder.() -> Unit): CfnXssMatchSet {
    val propsBuilder = CfnXssMatchSetProps.builder()
    propsBuilder.init()
    
    return CfnXssMatchSet(this, id, propsBuilder.build())
}

fun Construct.cfnIPSet(id: String, init: CfnIPSetProps.Builder.() -> Unit): CfnIPSet {
    val propsBuilder = CfnIPSetProps.builder()
    propsBuilder.init()
    
    return CfnIPSet(this, id, propsBuilder.build())
}

fun Construct.cfnByteMatchSet(id: String, init: CfnByteMatchSetProps.Builder.() -> Unit): CfnByteMatchSet {
    val propsBuilder = CfnByteMatchSetProps.builder()
    propsBuilder.init()
    
    return CfnByteMatchSet(this, id, propsBuilder.build())
}

fun Construct.cfnSqlInjectionMatchSet(id: String, init: CfnSqlInjectionMatchSetProps.Builder.() -> Unit): CfnSqlInjectionMatchSet {
    val propsBuilder = CfnSqlInjectionMatchSetProps.builder()
    propsBuilder.init()
    
    return CfnSqlInjectionMatchSet(this, id, propsBuilder.build())
}

fun Construct.cfnSizeConstraintSet(id: String, init: CfnSizeConstraintSetProps.Builder.() -> Unit): CfnSizeConstraintSet {
    val propsBuilder = CfnSizeConstraintSetProps.builder()
    propsBuilder.init()
    
    return CfnSizeConstraintSet(this, id, propsBuilder.build())
}

fun Construct.cfnWebACL(id: String, init: CfnWebACLProps.Builder.() -> Unit): CfnWebACL {
    val propsBuilder = CfnWebACLProps.builder()
    propsBuilder.init()
    
    return CfnWebACL(this, id, propsBuilder.build())
}

