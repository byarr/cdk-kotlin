package com.brianyarr.cdk.sqs

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.sqs.QueuePolicy
import software.amazon.awscdk.services.sqs.QueuePolicyProps
import software.amazon.awscdk.services.sqs.Queue
import software.amazon.awscdk.services.sqs.QueueProps

fun Construct.queuePolicy(id: String, init: QueuePolicyProps.Builder.() -> Unit): QueuePolicy {
    val propsBuilder = QueuePolicyProps.builder()
    propsBuilder.init()
    
    return QueuePolicy(this, id, propsBuilder.build())
}


fun Construct.queue(id: String, init: QueueProps.Builder.() -> Unit): Queue {
    val propsBuilder = QueueProps.builder()
    propsBuilder.init()
    
    return Queue(this, id, propsBuilder.build())
}


