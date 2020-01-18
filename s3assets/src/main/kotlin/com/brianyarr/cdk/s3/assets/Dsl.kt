package com.brianyarr.cdk.s3.assets

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.s3.assets.Asset
import software.amazon.awscdk.services.s3.assets.AssetProps

fun Construct.asset(id: String, init: AssetProps.Builder.() -> Unit): Asset {
    val propsBuilder = AssetProps.builder()
    propsBuilder.init()
    
    return Asset(this, id, propsBuilder.build())
}

