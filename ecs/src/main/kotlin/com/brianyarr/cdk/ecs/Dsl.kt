package com.brianyarr.cdk.ecs

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.ecs.Ec2TaskDefinition
import software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps
import software.amazon.awscdk.services.ecs.CfnService
import software.amazon.awscdk.services.ecs.CfnServiceProps
import software.amazon.awscdk.services.ecs.Cluster
import software.amazon.awscdk.services.ecs.ClusterProps
import software.amazon.awscdk.services.ecs.FirelensLogRouter
import software.amazon.awscdk.services.ecs.FirelensLogRouterProps
import software.amazon.awscdk.services.ecs.CfnTaskSet
import software.amazon.awscdk.services.ecs.CfnTaskSetProps
import software.amazon.awscdk.services.ecs.LinuxParameters
import software.amazon.awscdk.services.ecs.LinuxParametersProps
import software.amazon.awscdk.services.ecs.ScalableTaskCount
import software.amazon.awscdk.services.ecs.ScalableTaskCountProps
import software.amazon.awscdk.services.ecs.CfnCluster
import software.amazon.awscdk.services.ecs.CfnClusterProps
import software.amazon.awscdk.services.ecs.Ec2Service
import software.amazon.awscdk.services.ecs.Ec2ServiceProps
import software.amazon.awscdk.services.ecs.FargateTaskDefinition
import software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps
import software.amazon.awscdk.services.ecs.ContainerDefinition
import software.amazon.awscdk.services.ecs.ContainerDefinitionProps
import software.amazon.awscdk.services.ecs.TaskDefinition
import software.amazon.awscdk.services.ecs.TaskDefinitionProps
import software.amazon.awscdk.services.ecs.FargateService
import software.amazon.awscdk.services.ecs.FargateServiceProps
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps
import software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet
import software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps

fun Construct.ec2TaskDefinition(id: String, init: Ec2TaskDefinitionProps.Builder.() -> Unit): Ec2TaskDefinition {
    val propsBuilder = Ec2TaskDefinitionProps.builder()
    propsBuilder.init()
    
    return Ec2TaskDefinition(this, id, propsBuilder.build())
}

fun Construct.cfnService(id: String, init: CfnServiceProps.Builder.() -> Unit): CfnService {
    val propsBuilder = CfnServiceProps.builder()
    propsBuilder.init()
    
    return CfnService(this, id, propsBuilder.build())
}

fun Construct.cluster(id: String, init: ClusterProps.Builder.() -> Unit): Cluster {
    val propsBuilder = ClusterProps.builder()
    propsBuilder.init()
    
    return Cluster(this, id, propsBuilder.build())
}

fun Construct.firelensLogRouter(id: String, init: FirelensLogRouterProps.Builder.() -> Unit): FirelensLogRouter {
    val propsBuilder = FirelensLogRouterProps.builder()
    propsBuilder.init()
    
    return FirelensLogRouter(this, id, propsBuilder.build())
}

fun Construct.cfnTaskSet(id: String, init: CfnTaskSetProps.Builder.() -> Unit): CfnTaskSet {
    val propsBuilder = CfnTaskSetProps.builder()
    propsBuilder.init()
    
    return CfnTaskSet(this, id, propsBuilder.build())
}

fun Construct.linuxParameters(id: String, init: LinuxParametersProps.Builder.() -> Unit): LinuxParameters {
    val propsBuilder = LinuxParametersProps.builder()
    propsBuilder.init()
    
    return LinuxParameters(this, id, propsBuilder.build())
}

fun Construct.scalableTaskCount(id: String, init: ScalableTaskCountProps.Builder.() -> Unit): ScalableTaskCount {
    val propsBuilder = ScalableTaskCountProps.builder()
    propsBuilder.init()
    
    return ScalableTaskCount(this, id, propsBuilder.build())
}

fun Construct.cfnCluster(id: String, init: CfnClusterProps.Builder.() -> Unit): CfnCluster {
    val propsBuilder = CfnClusterProps.builder()
    propsBuilder.init()
    
    return CfnCluster(this, id, propsBuilder.build())
}

fun Construct.ec2Service(id: String, init: Ec2ServiceProps.Builder.() -> Unit): Ec2Service {
    val propsBuilder = Ec2ServiceProps.builder()
    propsBuilder.init()
    
    return Ec2Service(this, id, propsBuilder.build())
}

fun Construct.fargateTaskDefinition(id: String, init: FargateTaskDefinitionProps.Builder.() -> Unit): FargateTaskDefinition {
    val propsBuilder = FargateTaskDefinitionProps.builder()
    propsBuilder.init()
    
    return FargateTaskDefinition(this, id, propsBuilder.build())
}

fun Construct.containerDefinition(id: String, init: ContainerDefinitionProps.Builder.() -> Unit): ContainerDefinition {
    val propsBuilder = ContainerDefinitionProps.builder()
    propsBuilder.init()
    
    return ContainerDefinition(this, id, propsBuilder.build())
}

fun Construct.taskDefinition(id: String, init: TaskDefinitionProps.Builder.() -> Unit): TaskDefinition {
    val propsBuilder = TaskDefinitionProps.builder()
    propsBuilder.init()
    
    return TaskDefinition(this, id, propsBuilder.build())
}

fun Construct.fargateService(id: String, init: FargateServiceProps.Builder.() -> Unit): FargateService {
    val propsBuilder = FargateServiceProps.builder()
    propsBuilder.init()
    
    return FargateService(this, id, propsBuilder.build())
}

fun Construct.cfnTaskDefinition(id: String, init: CfnTaskDefinitionProps.Builder.() -> Unit): CfnTaskDefinition {
    val propsBuilder = CfnTaskDefinitionProps.builder()
    propsBuilder.init()
    
    return CfnTaskDefinition(this, id, propsBuilder.build())
}

fun Construct.cfnPrimaryTaskSet(id: String, init: CfnPrimaryTaskSetProps.Builder.() -> Unit): CfnPrimaryTaskSet {
    val propsBuilder = CfnPrimaryTaskSetProps.builder()
    propsBuilder.init()
    
    return CfnPrimaryTaskSet(this, id, propsBuilder.build())
}

