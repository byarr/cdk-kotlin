package com.brianyarr.cdk.sdb

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.sdb.CfnDomain
import software.amazon.awscdk.services.sdb.CfnDomainProps

fun Construct.cfnDomain(id: String, init: CfnDomainProps.Builder.() -> Unit): CfnDomain {
    val propsBuilder = CfnDomainProps.builder()
    propsBuilder.init()
    
    return CfnDomain(this, id, propsBuilder.build())
}

