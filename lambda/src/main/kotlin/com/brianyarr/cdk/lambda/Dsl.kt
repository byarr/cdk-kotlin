package com.brianyarr.cdk.lambda

import software.amazon.awscdk.services.lambda.Function

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.lambda.FunctionProps


fun Construct.function(id: String, init: FunctionProps.Builder.() -> Unit): Function {
    val builder = FunctionProps.builder()
    builder.init()

    return Function(this, id, builder.build())
}