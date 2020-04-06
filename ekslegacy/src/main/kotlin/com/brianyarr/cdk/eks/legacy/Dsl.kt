package com.brianyarr.cdk.eks.legacy

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.eks.legacy.HelmChart
import software.amazon.awscdk.services.eks.legacy.HelmChartProps
import software.amazon.awscdk.services.eks.legacy.CfnNodegroup
import software.amazon.awscdk.services.eks.legacy.CfnNodegroupProps
import software.amazon.awscdk.services.eks.legacy.KubernetesResource
import software.amazon.awscdk.services.eks.legacy.KubernetesResourceProps
import software.amazon.awscdk.services.eks.legacy.Cluster
import software.amazon.awscdk.services.eks.legacy.ClusterProps
import software.amazon.awscdk.services.eks.legacy.CfnCluster
import software.amazon.awscdk.services.eks.legacy.CfnClusterProps
import software.amazon.awscdk.services.eks.legacy.AwsAuth
import software.amazon.awscdk.services.eks.legacy.AwsAuthProps

fun Construct.helmChart(id: String, init: HelmChartProps.Builder.() -> Unit): HelmChart {
    val propsBuilder = HelmChartProps.builder()
    propsBuilder.init()
    
    return HelmChart(this, id, propsBuilder.build())
}

fun Construct.cfnNodegroup(id: String, init: CfnNodegroupProps.Builder.() -> Unit): CfnNodegroup {
    val propsBuilder = CfnNodegroupProps.builder()
    propsBuilder.init()
    
    return CfnNodegroup(this, id, propsBuilder.build())
}

fun Construct.kubernetesResource(id: String, init: KubernetesResourceProps.Builder.() -> Unit): KubernetesResource {
    val propsBuilder = KubernetesResourceProps.builder()
    propsBuilder.init()
    
    return KubernetesResource(this, id, propsBuilder.build())
}

fun Construct.cluster(id: String, init: ClusterProps.Builder.() -> Unit): Cluster {
    val propsBuilder = ClusterProps.builder()
    propsBuilder.init()
    
    return Cluster(this, id, propsBuilder.build())
}

fun Construct.cfnCluster(id: String, init: CfnClusterProps.Builder.() -> Unit): CfnCluster {
    val propsBuilder = CfnClusterProps.builder()
    propsBuilder.init()
    
    return CfnCluster(this, id, propsBuilder.build())
}

fun Construct.awsAuth(id: String, init: AwsAuthProps.Builder.() -> Unit): AwsAuth {
    val propsBuilder = AwsAuthProps.builder()
    propsBuilder.init()
    
    return AwsAuth(this, id, propsBuilder.build())
}

