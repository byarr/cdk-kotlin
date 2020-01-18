package com.brianyarr.cdk.elasticsearch

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.elasticsearch.CfnDomain
import software.amazon.awscdk.services.elasticsearch.CfnDomainProps

fun Construct.cfnDomain(id: String, init: CfnDomainProps.Builder.() -> Unit): CfnDomain {
    val propsBuilder = CfnDomainProps.builder()
    propsBuilder.init()
    
    return CfnDomain(this, id, propsBuilder.build())
}

