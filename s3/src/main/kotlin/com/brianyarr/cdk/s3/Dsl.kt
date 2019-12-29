package com.brianyarr.cdk.s3

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.s3.BucketPolicy
import software.amazon.awscdk.services.s3.BucketPolicyProps
import software.amazon.awscdk.services.s3.Bucket
import software.amazon.awscdk.services.s3.BucketProps

fun Construct.bucketPolicy(id: String, init: BucketPolicyProps.Builder.() -> Unit): BucketPolicy {
    val propsBuilder = BucketPolicyProps.builder()
    propsBuilder.init()
    
    return BucketPolicy(this, id, propsBuilder.build())
}


fun Construct.bucket(id: String, init: BucketProps.Builder.() -> Unit): Bucket {
    val propsBuilder = BucketProps.builder()
    propsBuilder.init()
    
    return Bucket(this, id, propsBuilder.build())
}


