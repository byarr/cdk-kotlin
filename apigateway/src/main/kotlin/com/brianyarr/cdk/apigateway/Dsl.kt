package com.brianyarr.cdk.apigateway

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.apigateway.RestApi
import software.amazon.awscdk.services.apigateway.RestApiProps

fun Construct.restApi(id: String, init: RestApiProps.Builder.() -> Unit): RestApi {
    val builder = RestApiProps.builder()
    builder.init()
    return RestApi(this, id, builder.build())
}