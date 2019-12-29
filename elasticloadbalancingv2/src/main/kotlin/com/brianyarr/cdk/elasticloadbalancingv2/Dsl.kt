package com.brianyarr.cdk.elasticloadbalancingv2

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerProps

fun Construct.applicationListener(id: String, init: ApplicationListenerProps.Builder.() -> Unit): ApplicationListener {
    val propsBuilder = ApplicationListenerProps.builder()
    propsBuilder.init()
    
    return ApplicationListener(this, id, propsBuilder.build())
}


fun Construct.applicationLoadBalancer(id: String, init: ApplicationLoadBalancerProps.Builder.() -> Unit): ApplicationLoadBalancer {
    val propsBuilder = ApplicationLoadBalancerProps.builder()
    propsBuilder.init()
    
    return ApplicationLoadBalancer(this, id, propsBuilder.build())
}


fun Construct.networkListener(id: String, init: NetworkListenerProps.Builder.() -> Unit): NetworkListener {
    val propsBuilder = NetworkListenerProps.builder()
    propsBuilder.init()
    
    return NetworkListener(this, id, propsBuilder.build())
}


fun Construct.networkLoadBalancer(id: String, init: NetworkLoadBalancerProps.Builder.() -> Unit): NetworkLoadBalancer {
    val propsBuilder = NetworkLoadBalancerProps.builder()
    propsBuilder.init()
    
    return NetworkLoadBalancer(this, id, propsBuilder.build())
}


