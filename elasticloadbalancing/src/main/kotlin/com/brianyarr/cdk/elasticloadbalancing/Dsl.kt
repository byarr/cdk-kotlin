package com.brianyarr.cdk.elasticloadbalancing

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps

fun Construct.loadBalancer(id: String, init: LoadBalancerProps.Builder.() -> Unit): LoadBalancer {
    val propsBuilder = LoadBalancerProps.builder()
    propsBuilder.init()
    
    return LoadBalancer(this, id, propsBuilder.build())
}


