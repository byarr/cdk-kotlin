package com.brianyarr.cdk.iot

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.iot.CfnTopicRule
import software.amazon.awscdk.services.iot.CfnTopicRuleProps
import software.amazon.awscdk.services.iot.CfnCertificate
import software.amazon.awscdk.services.iot.CfnCertificateProps
import software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment
import software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps
import software.amazon.awscdk.services.iot.CfnPolicy
import software.amazon.awscdk.services.iot.CfnPolicyProps
import software.amazon.awscdk.services.iot.CfnThing
import software.amazon.awscdk.services.iot.CfnThingProps
import software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachment
import software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps

fun Construct.cfnTopicRule(id: String, init: CfnTopicRuleProps.Builder.() -> Unit): CfnTopicRule {
    val propsBuilder = CfnTopicRuleProps.builder()
    propsBuilder.init()
    
    return CfnTopicRule(this, id, propsBuilder.build())
}

fun Construct.cfnCertificate(id: String, init: CfnCertificateProps.Builder.() -> Unit): CfnCertificate {
    val propsBuilder = CfnCertificateProps.builder()
    propsBuilder.init()
    
    return CfnCertificate(this, id, propsBuilder.build())
}

fun Construct.cfnThingPrincipalAttachment(id: String, init: CfnThingPrincipalAttachmentProps.Builder.() -> Unit): CfnThingPrincipalAttachment {
    val propsBuilder = CfnThingPrincipalAttachmentProps.builder()
    propsBuilder.init()
    
    return CfnThingPrincipalAttachment(this, id, propsBuilder.build())
}

fun Construct.cfnPolicy(id: String, init: CfnPolicyProps.Builder.() -> Unit): CfnPolicy {
    val propsBuilder = CfnPolicyProps.builder()
    propsBuilder.init()
    
    return CfnPolicy(this, id, propsBuilder.build())
}

fun Construct.cfnThing(id: String, init: CfnThingProps.Builder.() -> Unit): CfnThing {
    val propsBuilder = CfnThingProps.builder()
    propsBuilder.init()
    
    return CfnThing(this, id, propsBuilder.build())
}

fun Construct.cfnPolicyPrincipalAttachment(id: String, init: CfnPolicyPrincipalAttachmentProps.Builder.() -> Unit): CfnPolicyPrincipalAttachment {
    val propsBuilder = CfnPolicyPrincipalAttachmentProps.builder()
    propsBuilder.init()
    
    return CfnPolicyPrincipalAttachment(this, id, propsBuilder.build())
}

