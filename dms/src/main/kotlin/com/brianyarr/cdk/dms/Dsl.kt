package com.brianyarr.cdk.dms

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.dms.CfnEventSubscription
import software.amazon.awscdk.services.dms.CfnEventSubscriptionProps
import software.amazon.awscdk.services.dms.CfnReplicationTask
import software.amazon.awscdk.services.dms.CfnReplicationTaskProps
import software.amazon.awscdk.services.dms.CfnEndpoint
import software.amazon.awscdk.services.dms.CfnEndpointProps
import software.amazon.awscdk.services.dms.CfnCertificate
import software.amazon.awscdk.services.dms.CfnCertificateProps
import software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup
import software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps
import software.amazon.awscdk.services.dms.CfnReplicationInstance
import software.amazon.awscdk.services.dms.CfnReplicationInstanceProps

fun Construct.cfnEventSubscription(id: String, init: CfnEventSubscriptionProps.Builder.() -> Unit): CfnEventSubscription {
    val propsBuilder = CfnEventSubscriptionProps.builder()
    propsBuilder.init()
    
    return CfnEventSubscription(this, id, propsBuilder.build())
}

fun Construct.cfnReplicationTask(id: String, init: CfnReplicationTaskProps.Builder.() -> Unit): CfnReplicationTask {
    val propsBuilder = CfnReplicationTaskProps.builder()
    propsBuilder.init()
    
    return CfnReplicationTask(this, id, propsBuilder.build())
}

fun Construct.cfnEndpoint(id: String, init: CfnEndpointProps.Builder.() -> Unit): CfnEndpoint {
    val propsBuilder = CfnEndpointProps.builder()
    propsBuilder.init()
    
    return CfnEndpoint(this, id, propsBuilder.build())
}

fun Construct.cfnCertificate(id: String, init: CfnCertificateProps.Builder.() -> Unit): CfnCertificate {
    val propsBuilder = CfnCertificateProps.builder()
    propsBuilder.init()
    
    return CfnCertificate(this, id, propsBuilder.build())
}

fun Construct.cfnReplicationSubnetGroup(id: String, init: CfnReplicationSubnetGroupProps.Builder.() -> Unit): CfnReplicationSubnetGroup {
    val propsBuilder = CfnReplicationSubnetGroupProps.builder()
    propsBuilder.init()
    
    return CfnReplicationSubnetGroup(this, id, propsBuilder.build())
}

fun Construct.cfnReplicationInstance(id: String, init: CfnReplicationInstanceProps.Builder.() -> Unit): CfnReplicationInstance {
    val propsBuilder = CfnReplicationInstanceProps.builder()
    propsBuilder.init()
    
    return CfnReplicationInstance(this, id, propsBuilder.build())
}

