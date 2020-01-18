package com.brianyarr.cdk.s3

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.s3.BucketPolicy
import software.amazon.awscdk.services.s3.BucketPolicyProps
import software.amazon.awscdk.services.s3.CfnAccessPoint
import software.amazon.awscdk.services.s3.CfnAccessPointProps
import software.amazon.awscdk.services.s3.Bucket
import software.amazon.awscdk.services.s3.BucketProps
import software.amazon.awscdk.services.s3.CfnBucket
import software.amazon.awscdk.services.s3.CfnBucketProps
import software.amazon.awscdk.services.s3.CfnBucketPolicy
import software.amazon.awscdk.services.s3.CfnBucketPolicyProps

fun Construct.bucketPolicy(id: String, init: BucketPolicyProps.Builder.() -> Unit): BucketPolicy {
    val propsBuilder = BucketPolicyProps.builder()
    propsBuilder.init()
    
    return BucketPolicy(this, id, propsBuilder.build())
}

fun Construct.cfnAccessPoint(id: String, init: CfnAccessPointProps.Builder.() -> Unit): CfnAccessPoint {
    val propsBuilder = CfnAccessPointProps.builder()
    propsBuilder.init()
    
    return CfnAccessPoint(this, id, propsBuilder.build())
}

fun Construct.bucket(id: String, init: BucketProps.Builder.() -> Unit): Bucket {
    val propsBuilder = BucketProps.builder()
    propsBuilder.init()
    
    return Bucket(this, id, propsBuilder.build())
}

fun Construct.cfnBucket(id: String, init: CfnBucketProps.Builder.() -> Unit): CfnBucket {
    val propsBuilder = CfnBucketProps.builder()
    propsBuilder.init()
    
    return CfnBucket(this, id, propsBuilder.build())
}

fun Construct.cfnBucketPolicy(id: String, init: CfnBucketPolicyProps.Builder.() -> Unit): CfnBucketPolicy {
    val propsBuilder = CfnBucketPolicyProps.builder()
    propsBuilder.init()
    
    return CfnBucketPolicy(this, id, propsBuilder.build())
}

