package com.brianyarr.cdk.ssm

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.ssm.StringParameter
import software.amazon.awscdk.services.ssm.StringParameterProps
import software.amazon.awscdk.services.ssm.StringListParameter
import software.amazon.awscdk.services.ssm.StringListParameterProps

fun Construct.stringParameter(id: String, init: StringParameterProps.Builder.() -> Unit): StringParameter {
    val propsBuilder = StringParameterProps.builder()
    propsBuilder.init()
    
    return StringParameter(this, id, propsBuilder.build())
}


fun Construct.stringListParameter(id: String, init: StringListParameterProps.Builder.() -> Unit): StringListParameter {
    val propsBuilder = StringListParameterProps.builder()
    propsBuilder.init()
    
    return StringListParameter(this, id, propsBuilder.build())
}


