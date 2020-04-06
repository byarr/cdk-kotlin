package com.brianyarr.cdk.events

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.events.Rule
import software.amazon.awscdk.services.events.RuleProps
import software.amazon.awscdk.services.events.EventBus
import software.amazon.awscdk.services.events.EventBusProps
import software.amazon.awscdk.services.events.CfnRule
import software.amazon.awscdk.services.events.CfnRuleProps
import software.amazon.awscdk.services.events.CfnEventBusPolicy
import software.amazon.awscdk.services.events.CfnEventBusPolicyProps
import software.amazon.awscdk.services.events.CfnEventBus
import software.amazon.awscdk.services.events.CfnEventBusProps

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

fun Construct.cfnRule(id: String, init: CfnRuleProps.Builder.() -> Unit): CfnRule {
    val propsBuilder = CfnRuleProps.builder()
    propsBuilder.init()
    
    return CfnRule(this, id, propsBuilder.build())
}

fun Construct.cfnEventBusPolicy(id: String, init: CfnEventBusPolicyProps.Builder.() -> Unit): CfnEventBusPolicy {
    val propsBuilder = CfnEventBusPolicyProps.builder()
    propsBuilder.init()
    
    return CfnEventBusPolicy(this, id, propsBuilder.build())
}

fun Construct.cfnEventBus(id: String, init: CfnEventBusProps.Builder.() -> Unit): CfnEventBus {
    val propsBuilder = CfnEventBusProps.builder()
    propsBuilder.init()
    
    return CfnEventBus(this, id, propsBuilder.build())
}

