package com.brianyarr.cdk.eks

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.eks.Cluster
import software.amazon.awscdk.services.eks.ClusterProps

fun Construct.cluster(id: String, init: ClusterProps.Builder.() -> Unit): Cluster {
    val propsBuilder = ClusterProps.builder()
    propsBuilder.init()
    
    return Cluster(this, id, propsBuilder.build())
}


