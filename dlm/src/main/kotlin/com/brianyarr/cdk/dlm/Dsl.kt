package com.brianyarr.cdk.dlm

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps

fun Construct.cfnLifecyclePolicy(id: String, init: CfnLifecyclePolicyProps.Builder.() -> Unit): CfnLifecyclePolicy {
    val propsBuilder = CfnLifecyclePolicyProps.builder()
    propsBuilder.init()
    
    return CfnLifecyclePolicy(this, id, propsBuilder.build())
}

