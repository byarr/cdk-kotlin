package com.brianyarr.cdk.serverless

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.lambda.Function
import software.amazon.awscdk.services.lambda.FunctionProps

class Serverless(scope: Construct, id: String): Construct(scope, id) {

    var lambdaSettings: FunctionProps.Builder.() -> Unit = {}

    fun lambdaSettings(init: FunctionProps.Builder.() -> Unit) {
        this.lambdaSettings = init
    }

    fun function(id: String, init: FunctionProps.Builder.() -> Unit): Function {
        val builder = FunctionProps.builder()
        builder.lambdaSettings()
        builder.init()
        return Function(this, id, builder.build())
    }

}

fun Construct.serverless(id: String, init: Serverless.() -> Unit): Serverless {
    val serverless = Serverless(this, id)
    serverless.init()
    return serverless
}