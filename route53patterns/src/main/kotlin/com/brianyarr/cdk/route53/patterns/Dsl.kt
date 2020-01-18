package com.brianyarr.cdk.route53.patterns

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.route53.patterns.HttpsRedirect
import software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps

fun Construct.httpsRedirect(id: String, init: HttpsRedirectProps.Builder.() -> Unit): HttpsRedirect {
    val propsBuilder = HttpsRedirectProps.builder()
    propsBuilder.init()
    
    return HttpsRedirect(this, id, propsBuilder.build())
}

