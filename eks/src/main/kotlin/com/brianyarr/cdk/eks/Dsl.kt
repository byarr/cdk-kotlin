package com.brianyarr.cdk.eks

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.eks.AwsAuth
import software.amazon.awscdk.services.eks.AwsAuthProps
import software.amazon.awscdk.services.eks.KubernetesResource
import software.amazon.awscdk.services.eks.KubernetesResourceProps
import software.amazon.awscdk.services.eks.CfnCluster
import software.amazon.awscdk.services.eks.CfnClusterProps
import software.amazon.awscdk.services.eks.Cluster
import software.amazon.awscdk.services.eks.ClusterProps
import software.amazon.awscdk.services.eks.CfnNodegroup
import software.amazon.awscdk.services.eks.CfnNodegroupProps

fun Construct.awsAuth(id: String, init: AwsAuthProps.Builder.() -> Unit): AwsAuth {
    val propsBuilder = AwsAuthProps.builder()
    propsBuilder.init()
    
    return AwsAuth(this, id, propsBuilder.build())
}

fun Construct.kubernetesResource(id: String, init: KubernetesResourceProps.Builder.() -> Unit): KubernetesResource {
    val propsBuilder = KubernetesResourceProps.builder()
    propsBuilder.init()
    
    return KubernetesResource(this, id, propsBuilder.build())
}

fun Construct.cfnCluster(id: String, init: CfnClusterProps.Builder.() -> Unit): CfnCluster {
    val propsBuilder = CfnClusterProps.builder()
    propsBuilder.init()
    
    return CfnCluster(this, id, propsBuilder.build())
}

fun Construct.cluster(id: String, init: ClusterProps.Builder.() -> Unit): Cluster {
    val propsBuilder = ClusterProps.builder()
    propsBuilder.init()
    
    return Cluster(this, id, propsBuilder.build())
}

fun Construct.cfnNodegroup(id: String, init: CfnNodegroupProps.Builder.() -> Unit): CfnNodegroup {
    val propsBuilder = CfnNodegroupProps.builder()
    propsBuilder.init()
    
    return CfnNodegroup(this, id, propsBuilder.build())
}

