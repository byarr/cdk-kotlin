package com.brianyarr.cdk.stepfunctions

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.stepfunctions.Activity
import software.amazon.awscdk.services.stepfunctions.ActivityProps
import software.amazon.awscdk.services.stepfunctions.StateMachine
import software.amazon.awscdk.services.stepfunctions.StateMachineProps

fun Construct.activity(id: String, init: ActivityProps.Builder.() -> Unit): Activity {
    val propsBuilder = ActivityProps.builder()
    propsBuilder.init()
    
    return Activity(this, id, propsBuilder.build())
}


fun Construct.stateMachine(id: String, init: StateMachineProps.Builder.() -> Unit): StateMachine {
    val propsBuilder = StateMachineProps.builder()
    propsBuilder.init()
    
    return StateMachine(this, id, propsBuilder.build())
}


