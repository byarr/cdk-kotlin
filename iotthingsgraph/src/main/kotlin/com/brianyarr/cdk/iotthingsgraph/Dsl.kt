package com.brianyarr.cdk.iotthingsgraph

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate
import software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps

fun Construct.cfnFlowTemplate(id: String, init: CfnFlowTemplateProps.Builder.() -> Unit): CfnFlowTemplate {
    val propsBuilder = CfnFlowTemplateProps.builder()
    propsBuilder.init()
    
    return CfnFlowTemplate(this, id, propsBuilder.build())
}

