package com.brianyarr.cdk.waf.regional

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet
import software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps
import software.amazon.awscdk.services.waf.regional.CfnByteMatchSet
import software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps
import software.amazon.awscdk.services.waf.regional.CfnWebACL
import software.amazon.awscdk.services.waf.regional.CfnWebACLProps
import software.amazon.awscdk.services.waf.regional.CfnIPSet
import software.amazon.awscdk.services.waf.regional.CfnIPSetProps
import software.amazon.awscdk.services.waf.regional.CfnXssMatchSet
import software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps
import software.amazon.awscdk.services.waf.regional.CfnRule
import software.amazon.awscdk.services.waf.regional.CfnRuleProps
import software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet
import software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps
import software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet
import software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps
import software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation
import software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps
import software.amazon.awscdk.services.waf.regional.CfnRateBasedRule
import software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps
import software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet
import software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps

fun Construct.cfnSizeConstraintSet(id: String, init: CfnSizeConstraintSetProps.Builder.() -> Unit): CfnSizeConstraintSet {
    val propsBuilder = CfnSizeConstraintSetProps.builder()
    propsBuilder.init()
    
    return CfnSizeConstraintSet(this, id, propsBuilder.build())
}

fun Construct.cfnByteMatchSet(id: String, init: CfnByteMatchSetProps.Builder.() -> Unit): CfnByteMatchSet {
    val propsBuilder = CfnByteMatchSetProps.builder()
    propsBuilder.init()
    
    return CfnByteMatchSet(this, id, propsBuilder.build())
}

fun Construct.cfnWebACL(id: String, init: CfnWebACLProps.Builder.() -> Unit): CfnWebACL {
    val propsBuilder = CfnWebACLProps.builder()
    propsBuilder.init()
    
    return CfnWebACL(this, id, propsBuilder.build())
}

fun Construct.cfnIPSet(id: String, init: CfnIPSetProps.Builder.() -> Unit): CfnIPSet {
    val propsBuilder = CfnIPSetProps.builder()
    propsBuilder.init()
    
    return CfnIPSet(this, id, propsBuilder.build())
}

fun Construct.cfnXssMatchSet(id: String, init: CfnXssMatchSetProps.Builder.() -> Unit): CfnXssMatchSet {
    val propsBuilder = CfnXssMatchSetProps.builder()
    propsBuilder.init()
    
    return CfnXssMatchSet(this, id, propsBuilder.build())
}

fun Construct.cfnRule(id: String, init: CfnRuleProps.Builder.() -> Unit): CfnRule {
    val propsBuilder = CfnRuleProps.builder()
    propsBuilder.init()
    
    return CfnRule(this, id, propsBuilder.build())
}

fun Construct.cfnGeoMatchSet(id: String, init: CfnGeoMatchSetProps.Builder.() -> Unit): CfnGeoMatchSet {
    val propsBuilder = CfnGeoMatchSetProps.builder()
    propsBuilder.init()
    
    return CfnGeoMatchSet(this, id, propsBuilder.build())
}

fun Construct.cfnSqlInjectionMatchSet(id: String, init: CfnSqlInjectionMatchSetProps.Builder.() -> Unit): CfnSqlInjectionMatchSet {
    val propsBuilder = CfnSqlInjectionMatchSetProps.builder()
    propsBuilder.init()
    
    return CfnSqlInjectionMatchSet(this, id, propsBuilder.build())
}

fun Construct.cfnWebACLAssociation(id: String, init: CfnWebACLAssociationProps.Builder.() -> Unit): CfnWebACLAssociation {
    val propsBuilder = CfnWebACLAssociationProps.builder()
    propsBuilder.init()
    
    return CfnWebACLAssociation(this, id, propsBuilder.build())
}

fun Construct.cfnRateBasedRule(id: String, init: CfnRateBasedRuleProps.Builder.() -> Unit): CfnRateBasedRule {
    val propsBuilder = CfnRateBasedRuleProps.builder()
    propsBuilder.init()
    
    return CfnRateBasedRule(this, id, propsBuilder.build())
}

fun Construct.cfnRegexPatternSet(id: String, init: CfnRegexPatternSetProps.Builder.() -> Unit): CfnRegexPatternSet {
    val propsBuilder = CfnRegexPatternSetProps.builder()
    propsBuilder.init()
    
    return CfnRegexPatternSet(this, id, propsBuilder.build())
}

