package com.brianyarr.cdk.route53resolver

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint
import software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps
import software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation
import software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps
import software.amazon.awscdk.services.route53resolver.CfnResolverRule
import software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps

fun Construct.cfnResolverEndpoint(id: String, init: CfnResolverEndpointProps.Builder.() -> Unit): CfnResolverEndpoint {
    val propsBuilder = CfnResolverEndpointProps.builder()
    propsBuilder.init()
    
    return CfnResolverEndpoint(this, id, propsBuilder.build())
}

fun Construct.cfnResolverRuleAssociation(id: String, init: CfnResolverRuleAssociationProps.Builder.() -> Unit): CfnResolverRuleAssociation {
    val propsBuilder = CfnResolverRuleAssociationProps.builder()
    propsBuilder.init()
    
    return CfnResolverRuleAssociation(this, id, propsBuilder.build())
}

fun Construct.cfnResolverRule(id: String, init: CfnResolverRuleProps.Builder.() -> Unit): CfnResolverRule {
    val propsBuilder = CfnResolverRuleProps.builder()
    propsBuilder.init()
    
    return CfnResolverRule(this, id, propsBuilder.build())
}

