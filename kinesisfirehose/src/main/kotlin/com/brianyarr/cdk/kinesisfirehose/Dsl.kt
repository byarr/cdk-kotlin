package com.brianyarr.cdk.kinesisfirehose

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps

fun Construct.cfnDeliveryStream(id: String, init: CfnDeliveryStreamProps.Builder.() -> Unit): CfnDeliveryStream {
    val propsBuilder = CfnDeliveryStreamProps.builder()
    propsBuilder.init()
    
    return CfnDeliveryStream(this, id, propsBuilder.build())
}

