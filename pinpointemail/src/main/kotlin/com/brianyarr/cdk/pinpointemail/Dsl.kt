package com.brianyarr.cdk.pinpointemail

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.pinpointemail.CfnIdentity
import software.amazon.awscdk.services.pinpointemail.CfnIdentityProps
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestinationProps
import software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPool
import software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps

fun Construct.cfnIdentity(id: String, init: CfnIdentityProps.Builder.() -> Unit): CfnIdentity {
    val propsBuilder = CfnIdentityProps.builder()
    propsBuilder.init()
    
    return CfnIdentity(this, id, propsBuilder.build())
}

fun Construct.cfnConfigurationSetEventDestination(id: String, init: CfnConfigurationSetEventDestinationProps.Builder.() -> Unit): CfnConfigurationSetEventDestination {
    val propsBuilder = CfnConfigurationSetEventDestinationProps.builder()
    propsBuilder.init()
    
    return CfnConfigurationSetEventDestination(this, id, propsBuilder.build())
}

fun Construct.cfnDedicatedIpPool(id: String, init: CfnDedicatedIpPoolProps.Builder.() -> Unit): CfnDedicatedIpPool {
    val propsBuilder = CfnDedicatedIpPoolProps.builder()
    propsBuilder.init()
    
    return CfnDedicatedIpPool(this, id, propsBuilder.build())
}

fun Construct.cfnConfigurationSet(id: String, init: CfnConfigurationSetProps.Builder.() -> Unit): CfnConfigurationSet {
    val propsBuilder = CfnConfigurationSetProps.builder()
    propsBuilder.init()
    
    return CfnConfigurationSet(this, id, propsBuilder.build())
}

