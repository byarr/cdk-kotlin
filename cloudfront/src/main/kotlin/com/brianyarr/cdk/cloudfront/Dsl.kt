package com.brianyarr.cdk.cloudfront

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.cloudfront.OriginAccessIdentity
import software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps

fun Construct.originAccessIdentity(id: String, init: OriginAccessIdentityProps.Builder.() -> Unit): OriginAccessIdentity {
    val propsBuilder = OriginAccessIdentityProps.builder()
    propsBuilder.init()
    
    return OriginAccessIdentity(this, id, propsBuilder.build())
}


