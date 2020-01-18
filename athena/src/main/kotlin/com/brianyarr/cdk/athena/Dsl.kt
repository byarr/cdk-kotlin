package com.brianyarr.cdk.athena

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.athena.CfnNamedQuery
import software.amazon.awscdk.services.athena.CfnNamedQueryProps

fun Construct.cfnNamedQuery(id: String, init: CfnNamedQueryProps.Builder.() -> Unit): CfnNamedQuery {
    val propsBuilder = CfnNamedQueryProps.builder()
    propsBuilder.init()
    
    return CfnNamedQuery(this, id, propsBuilder.build())
}

