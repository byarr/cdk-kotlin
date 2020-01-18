package com.brianyarr.cdk.s3.deployment

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.s3.deployment.BucketDeployment
import software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps

fun Construct.bucketDeployment(id: String, init: BucketDeploymentProps.Builder.() -> Unit): BucketDeployment {
    val propsBuilder = BucketDeploymentProps.builder()
    propsBuilder.init()
    
    return BucketDeployment(this, id, propsBuilder.build())
}

