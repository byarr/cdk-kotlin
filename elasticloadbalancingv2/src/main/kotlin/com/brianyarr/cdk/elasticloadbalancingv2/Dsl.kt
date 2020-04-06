package com.brianyarr.cdk.elasticloadbalancingv2

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroupProps
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroupProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRule
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRuleProps
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroupProps
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificateProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps

fun Construct.applicationTargetGroup(id: String, init: ApplicationTargetGroupProps.Builder.() -> Unit): ApplicationTargetGroup {
    val propsBuilder = ApplicationTargetGroupProps.builder()
    propsBuilder.init()
    
    return ApplicationTargetGroup(this, id, propsBuilder.build())
}

fun Construct.cfnListenerCertificate(id: String, init: CfnListenerCertificateProps.Builder.() -> Unit): CfnListenerCertificate {
    val propsBuilder = CfnListenerCertificateProps.builder()
    propsBuilder.init()
    
    return CfnListenerCertificate(this, id, propsBuilder.build())
}

fun Construct.cfnLoadBalancer(id: String, init: CfnLoadBalancerProps.Builder.() -> Unit): CfnLoadBalancer {
    val propsBuilder = CfnLoadBalancerProps.builder()
    propsBuilder.init()
    
    return CfnLoadBalancer(this, id, propsBuilder.build())
}

fun Construct.cfnTargetGroup(id: String, init: CfnTargetGroupProps.Builder.() -> Unit): CfnTargetGroup {
    val propsBuilder = CfnTargetGroupProps.builder()
    propsBuilder.init()
    
    return CfnTargetGroup(this, id, propsBuilder.build())
}

fun Construct.applicationListenerRule(id: String, init: ApplicationListenerRuleProps.Builder.() -> Unit): ApplicationListenerRule {
    val propsBuilder = ApplicationListenerRuleProps.builder()
    propsBuilder.init()
    
    return ApplicationListenerRule(this, id, propsBuilder.build())
}

fun Construct.networkTargetGroup(id: String, init: NetworkTargetGroupProps.Builder.() -> Unit): NetworkTargetGroup {
    val propsBuilder = NetworkTargetGroupProps.builder()
    propsBuilder.init()
    
    return NetworkTargetGroup(this, id, propsBuilder.build())
}

fun Construct.cfnListener(id: String, init: CfnListenerProps.Builder.() -> Unit): CfnListener {
    val propsBuilder = CfnListenerProps.builder()
    propsBuilder.init()
    
    return CfnListener(this, id, propsBuilder.build())
}

fun Construct.applicationListenerCertificate(id: String, init: ApplicationListenerCertificateProps.Builder.() -> Unit): ApplicationListenerCertificate {
    val propsBuilder = ApplicationListenerCertificateProps.builder()
    propsBuilder.init()
    
    return ApplicationListenerCertificate(this, id, propsBuilder.build())
}

fun Construct.applicationLoadBalancer(id: String, init: ApplicationLoadBalancerProps.Builder.() -> Unit): ApplicationLoadBalancer {
    val propsBuilder = ApplicationLoadBalancerProps.builder()
    propsBuilder.init()
    
    return ApplicationLoadBalancer(this, id, propsBuilder.build())
}

fun Construct.cfnListenerRule(id: String, init: CfnListenerRuleProps.Builder.() -> Unit): CfnListenerRule {
    val propsBuilder = CfnListenerRuleProps.builder()
    propsBuilder.init()
    
    return CfnListenerRule(this, id, propsBuilder.build())
}

fun Construct.networkLoadBalancer(id: String, init: NetworkLoadBalancerProps.Builder.() -> Unit): NetworkLoadBalancer {
    val propsBuilder = NetworkLoadBalancerProps.builder()
    propsBuilder.init()
    
    return NetworkLoadBalancer(this, id, propsBuilder.build())
}

fun Construct.networkListener(id: String, init: NetworkListenerProps.Builder.() -> Unit): NetworkListener {
    val propsBuilder = NetworkListenerProps.builder()
    propsBuilder.init()
    
    return NetworkListener(this, id, propsBuilder.build())
}

fun Construct.applicationListener(id: String, init: ApplicationListenerProps.Builder.() -> Unit): ApplicationListener {
    val propsBuilder = ApplicationListenerProps.builder()
    propsBuilder.init()
    
    return ApplicationListener(this, id, propsBuilder.build())
}

