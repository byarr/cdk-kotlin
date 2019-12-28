package com.brianyarr.cdk.lambda

import software.amazon.awscdk.services.lambda.Function

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.lambda.FunctionProps
import software.amazon.awscdk.services.lambda.SingletonFunction
import software.amazon.awscdk.services.lambda.SingletonFunctionProps


fun Construct.function(id: String, init: FunctionProps.Builder.() -> Unit): Function {
    val builder = FunctionProps.builder()
    builder.init()

    return Function(this, id, builder.build())
}

fun Construct.singletonFunction(id: String, init: SingletonFunctionProps.Builder.() -> Unit): SingletonFunction {
    val builder = SingletonFunctionProps.builder()
    builder.init()

    return SingletonFunction(this, id, builder.build())
}