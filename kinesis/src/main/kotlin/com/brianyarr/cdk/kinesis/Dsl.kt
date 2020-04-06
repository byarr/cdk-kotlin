package com.brianyarr.cdk.kinesis

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.kinesis.Stream
import software.amazon.awscdk.services.kinesis.StreamProps
import software.amazon.awscdk.services.kinesis.CfnStreamConsumer
import software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps
import software.amazon.awscdk.services.kinesis.CfnStream
import software.amazon.awscdk.services.kinesis.CfnStreamProps

fun Construct.stream(id: String, init: StreamProps.Builder.() -> Unit): Stream {
    val propsBuilder = StreamProps.builder()
    propsBuilder.init()
    
    return Stream(this, id, propsBuilder.build())
}

fun Construct.cfnStreamConsumer(id: String, init: CfnStreamConsumerProps.Builder.() -> Unit): CfnStreamConsumer {
    val propsBuilder = CfnStreamConsumerProps.builder()
    propsBuilder.init()
    
    return CfnStreamConsumer(this, id, propsBuilder.build())
}

fun Construct.cfnStream(id: String, init: CfnStreamProps.Builder.() -> Unit): CfnStream {
    val propsBuilder = CfnStreamProps.builder()
    propsBuilder.init()
    
    return CfnStream(this, id, propsBuilder.build())
}

