package com.brianyarr.cdk.ecs.patterns

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2Service
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2ServiceProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateServiceProps
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2Task
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2Service
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2ServiceProps
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2ServiceProps
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateService
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateServiceProps
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTask
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedFargateService
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedFargateServiceProps

fun Construct.applicationLoadBalancedEc2Service(id: String, init: ApplicationLoadBalancedEc2ServiceProps.Builder.() -> Unit): ApplicationLoadBalancedEc2Service {
    val propsBuilder = ApplicationLoadBalancedEc2ServiceProps.builder()
    propsBuilder.init()
    
    return ApplicationLoadBalancedEc2Service(this, id, propsBuilder.build())
}

fun Construct.applicationLoadBalancedFargateService(id: String, init: ApplicationLoadBalancedFargateServiceProps.Builder.() -> Unit): ApplicationLoadBalancedFargateService {
    val propsBuilder = ApplicationLoadBalancedFargateServiceProps.builder()
    propsBuilder.init()
    
    return ApplicationLoadBalancedFargateService(this, id, propsBuilder.build())
}

fun Construct.scheduledEc2Task(id: String, init: ScheduledEc2TaskProps.Builder.() -> Unit): ScheduledEc2Task {
    val propsBuilder = ScheduledEc2TaskProps.builder()
    propsBuilder.init()
    
    return ScheduledEc2Task(this, id, propsBuilder.build())
}

fun Construct.queueProcessingEc2Service(id: String, init: QueueProcessingEc2ServiceProps.Builder.() -> Unit): QueueProcessingEc2Service {
    val propsBuilder = QueueProcessingEc2ServiceProps.builder()
    propsBuilder.init()
    
    return QueueProcessingEc2Service(this, id, propsBuilder.build())
}

fun Construct.networkLoadBalancedEc2Service(id: String, init: NetworkLoadBalancedEc2ServiceProps.Builder.() -> Unit): NetworkLoadBalancedEc2Service {
    val propsBuilder = NetworkLoadBalancedEc2ServiceProps.builder()
    propsBuilder.init()
    
    return NetworkLoadBalancedEc2Service(this, id, propsBuilder.build())
}

fun Construct.queueProcessingFargateService(id: String, init: QueueProcessingFargateServiceProps.Builder.() -> Unit): QueueProcessingFargateService {
    val propsBuilder = QueueProcessingFargateServiceProps.builder()
    propsBuilder.init()
    
    return QueueProcessingFargateService(this, id, propsBuilder.build())
}

fun Construct.scheduledFargateTask(id: String, init: ScheduledFargateTaskProps.Builder.() -> Unit): ScheduledFargateTask {
    val propsBuilder = ScheduledFargateTaskProps.builder()
    propsBuilder.init()
    
    return ScheduledFargateTask(this, id, propsBuilder.build())
}

fun Construct.networkLoadBalancedFargateService(id: String, init: NetworkLoadBalancedFargateServiceProps.Builder.() -> Unit): NetworkLoadBalancedFargateService {
    val propsBuilder = NetworkLoadBalancedFargateServiceProps.builder()
    propsBuilder.init()
    
    return NetworkLoadBalancedFargateService(this, id, propsBuilder.build())
}

