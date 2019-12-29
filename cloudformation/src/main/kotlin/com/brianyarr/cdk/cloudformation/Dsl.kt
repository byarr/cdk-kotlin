package com.brianyarr.cdk.cloudformation

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.cloudformation.CustomResource
import software.amazon.awscdk.services.cloudformation.CustomResourceProps

fun Construct.customResource(id: String, init: CustomResourceProps.Builder.() -> Unit): CustomResource {
    val propsBuilder = CustomResourceProps.builder()
    propsBuilder.init()
    
    return CustomResource(this, id, propsBuilder.build())
}


