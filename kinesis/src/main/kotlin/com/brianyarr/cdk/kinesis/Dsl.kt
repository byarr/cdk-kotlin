package com.brianyarr.cdk.kinesis

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.kinesis.Stream
import software.amazon.awscdk.services.kinesis.StreamProps

fun Construct.stream(id: String, init: StreamProps.Builder.() -> Unit): Stream {
    val propsBuilder = StreamProps.builder()
    propsBuilder.init()
    
    return Stream(this, id, propsBuilder.build())
}


