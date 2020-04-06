package com.brianyarr.cdk.eks

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.eks.AwsAuth
import software.amazon.awscdk.services.eks.AwsAuthProps
import software.amazon.awscdk.services.eks.KubernetesResource
import software.amazon.awscdk.services.eks.KubernetesResourceProps
import software.amazon.awscdk.services.eks.Cluster
import software.amazon.awscdk.services.eks.ClusterProps
import software.amazon.awscdk.services.eks.KubernetesPatch
import software.amazon.awscdk.services.eks.KubernetesPatchProps
import software.amazon.awscdk.services.eks.FargateProfile
import software.amazon.awscdk.services.eks.FargateProfileProps
import software.amazon.awscdk.services.eks.FargateCluster
import software.amazon.awscdk.services.eks.FargateClusterProps
import software.amazon.awscdk.services.eks.CfnCluster
import software.amazon.awscdk.services.eks.CfnClusterProps
import software.amazon.awscdk.services.eks.HelmChart
import software.amazon.awscdk.services.eks.HelmChartProps
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

fun Construct.cluster(id: String, init: ClusterProps.Builder.() -> Unit): Cluster {
    val propsBuilder = ClusterProps.builder()
    propsBuilder.init()
    
    return Cluster(this, id, propsBuilder.build())
}

fun Construct.kubernetesPatch(id: String, init: KubernetesPatchProps.Builder.() -> Unit): KubernetesPatch {
    val propsBuilder = KubernetesPatchProps.builder()
    propsBuilder.init()
    
    return KubernetesPatch(this, id, propsBuilder.build())
}

fun Construct.fargateProfile(id: String, init: FargateProfileProps.Builder.() -> Unit): FargateProfile {
    val propsBuilder = FargateProfileProps.builder()
    propsBuilder.init()
    
    return FargateProfile(this, id, propsBuilder.build())
}

fun Construct.fargateCluster(id: String, init: FargateClusterProps.Builder.() -> Unit): FargateCluster {
    val propsBuilder = FargateClusterProps.builder()
    propsBuilder.init()
    
    return FargateCluster(this, id, propsBuilder.build())
}

fun Construct.cfnCluster(id: String, init: CfnClusterProps.Builder.() -> Unit): CfnCluster {
    val propsBuilder = CfnClusterProps.builder()
    propsBuilder.init()
    
    return CfnCluster(this, id, propsBuilder.build())
}

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

