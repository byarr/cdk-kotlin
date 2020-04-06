package com.brianyarr.cdk.opsworks

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.opsworks.CfnStack
import software.amazon.awscdk.services.opsworks.CfnStackProps
import software.amazon.awscdk.services.opsworks.CfnLayer
import software.amazon.awscdk.services.opsworks.CfnLayerProps
import software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment
import software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps
import software.amazon.awscdk.services.opsworks.CfnUserProfile
import software.amazon.awscdk.services.opsworks.CfnUserProfileProps
import software.amazon.awscdk.services.opsworks.CfnInstance
import software.amazon.awscdk.services.opsworks.CfnInstanceProps
import software.amazon.awscdk.services.opsworks.CfnApp
import software.amazon.awscdk.services.opsworks.CfnAppProps
import software.amazon.awscdk.services.opsworks.CfnVolume
import software.amazon.awscdk.services.opsworks.CfnVolumeProps

fun Construct.cfnStack(id: String, init: CfnStackProps.Builder.() -> Unit): CfnStack {
    val propsBuilder = CfnStackProps.builder()
    propsBuilder.init()
    
    return CfnStack(this, id, propsBuilder.build())
}

fun Construct.cfnLayer(id: String, init: CfnLayerProps.Builder.() -> Unit): CfnLayer {
    val propsBuilder = CfnLayerProps.builder()
    propsBuilder.init()
    
    return CfnLayer(this, id, propsBuilder.build())
}

fun Construct.cfnElasticLoadBalancerAttachment(id: String, init: CfnElasticLoadBalancerAttachmentProps.Builder.() -> Unit): CfnElasticLoadBalancerAttachment {
    val propsBuilder = CfnElasticLoadBalancerAttachmentProps.builder()
    propsBuilder.init()
    
    return CfnElasticLoadBalancerAttachment(this, id, propsBuilder.build())
}

fun Construct.cfnUserProfile(id: String, init: CfnUserProfileProps.Builder.() -> Unit): CfnUserProfile {
    val propsBuilder = CfnUserProfileProps.builder()
    propsBuilder.init()
    
    return CfnUserProfile(this, id, propsBuilder.build())
}

fun Construct.cfnInstance(id: String, init: CfnInstanceProps.Builder.() -> Unit): CfnInstance {
    val propsBuilder = CfnInstanceProps.builder()
    propsBuilder.init()
    
    return CfnInstance(this, id, propsBuilder.build())
}

fun Construct.cfnApp(id: String, init: CfnAppProps.Builder.() -> Unit): CfnApp {
    val propsBuilder = CfnAppProps.builder()
    propsBuilder.init()
    
    return CfnApp(this, id, propsBuilder.build())
}

fun Construct.cfnVolume(id: String, init: CfnVolumeProps.Builder.() -> Unit): CfnVolume {
    val propsBuilder = CfnVolumeProps.builder()
    propsBuilder.init()
    
    return CfnVolume(this, id, propsBuilder.build())
}

