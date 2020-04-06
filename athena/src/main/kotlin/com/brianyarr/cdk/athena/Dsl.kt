package com.brianyarr.cdk.athena

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.athena.CfnNamedQuery
import software.amazon.awscdk.services.athena.CfnNamedQueryProps
import software.amazon.awscdk.services.athena.CfnWorkGroup
import software.amazon.awscdk.services.athena.CfnWorkGroupProps

fun Construct.cfnNamedQuery(id: String, init: CfnNamedQueryProps.Builder.() -> Unit): CfnNamedQuery {
    val propsBuilder = CfnNamedQueryProps.builder()
    propsBuilder.init()
    
    return CfnNamedQuery(this, id, propsBuilder.build())
}

fun Construct.cfnWorkGroup(id: String, init: CfnWorkGroupProps.Builder.() -> Unit): CfnWorkGroup {
    val propsBuilder = CfnWorkGroupProps.builder()
    propsBuilder.init()
    
    return CfnWorkGroup(this, id, propsBuilder.build())
}

