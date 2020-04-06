package com.brianyarr.cdk.cloudtrail

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.cloudtrail.CfnTrail
import software.amazon.awscdk.services.cloudtrail.CfnTrailProps
import software.amazon.awscdk.services.cloudtrail.Trail
import software.amazon.awscdk.services.cloudtrail.TrailProps

fun Construct.cfnTrail(id: String, init: CfnTrailProps.Builder.() -> Unit): CfnTrail {
    val propsBuilder = CfnTrailProps.builder()
    propsBuilder.init()
    
    return CfnTrail(this, id, propsBuilder.build())
}

fun Construct.trail(id: String, init: TrailProps.Builder.() -> Unit): Trail {
    val propsBuilder = TrailProps.builder()
    propsBuilder.init()
    
    return Trail(this, id, propsBuilder.build())
}

