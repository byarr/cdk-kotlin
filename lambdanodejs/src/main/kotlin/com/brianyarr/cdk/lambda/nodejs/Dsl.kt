package com.brianyarr.cdk.lambda.nodejs

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.lambda.nodejs.NodejsFunction
import software.amazon.awscdk.services.lambda.nodejs.NodejsFunctionProps

fun Construct.nodejsFunction(id: String, init: NodejsFunctionProps.Builder.() -> Unit): NodejsFunction {
    val propsBuilder = NodejsFunctionProps.builder()
    propsBuilder.init()
    
    return NodejsFunction(this, id, propsBuilder.build())
}

