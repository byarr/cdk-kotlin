package com.brianyarr.cdk.sqs


import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.sqs.Queue
import software.amazon.awscdk.services.sqs.QueueProps


fun Construct.queue(id: String, init: QueueProps.Builder.() -> Unit): Queue {
    val builder = QueueProps.builder()
    builder.init()

    return Queue(this, id, builder.build())
}