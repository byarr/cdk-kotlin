package com.brianyarr.cdk.events

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.events.Rule
import software.amazon.awscdk.services.events.RuleProps
import software.amazon.awscdk.services.events.EventBus
import software.amazon.awscdk.services.events.EventBusProps

fun Construct.rule(id: String, init: RuleProps.Builder.() -> Unit): Rule {
    val propsBuilder = RuleProps.builder()
    propsBuilder.init()
    
    return Rule(this, id, propsBuilder.build())
}


fun Construct.eventBus(id: String, init: EventBusProps.Builder.() -> Unit): EventBus {
    val propsBuilder = EventBusProps.builder()
    propsBuilder.init()
    
    return EventBus(this, id, propsBuilder.build())
}


