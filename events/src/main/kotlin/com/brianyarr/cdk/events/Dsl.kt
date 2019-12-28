package com.brianyarr.cdk.events

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.events.Rule
import software.amazon.awscdk.services.events.RuleProps

fun Construct.rule(id: String, init: RuleProps.Builder.() -> Unit): Rule {
    val builder = RuleProps.builder()
    builder.init()
    return Rule(this, id, builder.build())
}