package com.brianyarr.cdk.ecs

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.ecs.FargateService
import software.amazon.awscdk.services.ecs.FargateServiceProps
import software.amazon.awscdk.services.ecs.Cluster
import software.amazon.awscdk.services.ecs.ClusterProps
import software.amazon.awscdk.services.ecs.FargateTaskDefinition
import software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps
import software.amazon.awscdk.services.ecs.Ec2Service
import software.amazon.awscdk.services.ecs.Ec2ServiceProps
import software.amazon.awscdk.services.ecs.TaskDefinition
import software.amazon.awscdk.services.ecs.TaskDefinitionProps
import software.amazon.awscdk.services.ecs.Ec2TaskDefinition
import software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps

fun Construct.fargateService(id: String, init: FargateServiceProps.Builder.() -> Unit): FargateService {
    val propsBuilder = FargateServiceProps.builder()
    propsBuilder.init()
    
    return FargateService(this, id, propsBuilder.build())
}


fun Construct.cluster(id: String, init: ClusterProps.Builder.() -> Unit): Cluster {
    val propsBuilder = ClusterProps.builder()
    propsBuilder.init()
    
    return Cluster(this, id, propsBuilder.build())
}


fun Construct.fargateTaskDefinition(id: String, init: FargateTaskDefinitionProps.Builder.() -> Unit): FargateTaskDefinition {
    val propsBuilder = FargateTaskDefinitionProps.builder()
    propsBuilder.init()
    
    return FargateTaskDefinition(this, id, propsBuilder.build())
}


fun Construct.ec2Service(id: String, init: Ec2ServiceProps.Builder.() -> Unit): Ec2Service {
    val propsBuilder = Ec2ServiceProps.builder()
    propsBuilder.init()
    
    return Ec2Service(this, id, propsBuilder.build())
}


fun Construct.taskDefinition(id: String, init: TaskDefinitionProps.Builder.() -> Unit): TaskDefinition {
    val propsBuilder = TaskDefinitionProps.builder()
    propsBuilder.init()
    
    return TaskDefinition(this, id, propsBuilder.build())
}


fun Construct.ec2TaskDefinition(id: String, init: Ec2TaskDefinitionProps.Builder.() -> Unit): Ec2TaskDefinition {
    val propsBuilder = Ec2TaskDefinitionProps.builder()
    propsBuilder.init()
    
    return Ec2TaskDefinition(this, id, propsBuilder.build())
}


