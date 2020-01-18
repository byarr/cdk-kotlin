package com.brianyarr.cdk.cloudfront

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import software.amazon.awscdk.services.cloudfront.CfnDistributionProps
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps
import software.amazon.awscdk.services.cloudfront.OriginAccessIdentity
import software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps
import software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution
import software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps
import software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity
import software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps

fun Construct.cfnDistribution(id: String, init: CfnDistributionProps.Builder.() -> Unit): CfnDistribution {
    val propsBuilder = CfnDistributionProps.builder()
    propsBuilder.init()
    
    return CfnDistribution(this, id, propsBuilder.build())
}

fun Construct.cfnStreamingDistribution(id: String, init: CfnStreamingDistributionProps.Builder.() -> Unit): CfnStreamingDistribution {
    val propsBuilder = CfnStreamingDistributionProps.builder()
    propsBuilder.init()
    
    return CfnStreamingDistribution(this, id, propsBuilder.build())
}

fun Construct.originAccessIdentity(id: String, init: OriginAccessIdentityProps.Builder.() -> Unit): OriginAccessIdentity {
    val propsBuilder = OriginAccessIdentityProps.builder()
    propsBuilder.init()
    
    return OriginAccessIdentity(this, id, propsBuilder.build())
}

fun Construct.cloudFrontWebDistribution(id: String, init: CloudFrontWebDistributionProps.Builder.() -> Unit): CloudFrontWebDistribution {
    val propsBuilder = CloudFrontWebDistributionProps.builder()
    propsBuilder.init()
    
    return CloudFrontWebDistribution(this, id, propsBuilder.build())
}

fun Construct.cfnCloudFrontOriginAccessIdentity(id: String, init: CfnCloudFrontOriginAccessIdentityProps.Builder.() -> Unit): CfnCloudFrontOriginAccessIdentity {
    val propsBuilder = CfnCloudFrontOriginAccessIdentityProps.builder()
    propsBuilder.init()
    
    return CfnCloudFrontOriginAccessIdentity(this, id, propsBuilder.build())
}

