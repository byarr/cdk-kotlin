package com.brianyarr.cdk.sqs

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.sqs.Queue
import software.amazon.awscdk.services.sqs.QueueProps
import software.amazon.awscdk.services.sqs.QueuePolicy
import software.amazon.awscdk.services.sqs.QueuePolicyProps
import software.amazon.awscdk.services.sqs.CfnQueuePolicy
import software.amazon.awscdk.services.sqs.CfnQueuePolicyProps
import software.amazon.awscdk.services.sqs.CfnQueue
import software.amazon.awscdk.services.sqs.CfnQueueProps

fun Construct.queue(id: String, init: QueueProps.Builder.() -> Unit): Queue {
    val propsBuilder = QueueProps.builder()
    propsBuilder.init()
    
    return Queue(this, id, propsBuilder.build())
}

fun Construct.queuePolicy(id: String, init: QueuePolicyProps.Builder.() -> Unit): QueuePolicy {
    val propsBuilder = QueuePolicyProps.builder()
    propsBuilder.init()
    
    return QueuePolicy(this, id, propsBuilder.build())
}

fun Construct.cfnQueuePolicy(id: String, init: CfnQueuePolicyProps.Builder.() -> Unit): CfnQueuePolicy {
    val propsBuilder = CfnQueuePolicyProps.builder()
    propsBuilder.init()
    
    return CfnQueuePolicy(this, id, propsBuilder.build())
}

fun Construct.cfnQueue(id: String, init: CfnQueueProps.Builder.() -> Unit): CfnQueue {
    val propsBuilder = CfnQueueProps.builder()
    propsBuilder.init()
    
    return CfnQueue(this, id, propsBuilder.build())
}

