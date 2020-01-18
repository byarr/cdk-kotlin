package com.brianyarr.cdk.stepfunctions

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.stepfunctions.Fail
import software.amazon.awscdk.services.stepfunctions.FailProps
import software.amazon.awscdk.services.stepfunctions.Choice
import software.amazon.awscdk.services.stepfunctions.ChoiceProps
import software.amazon.awscdk.services.stepfunctions.Task
import software.amazon.awscdk.services.stepfunctions.TaskProps
import software.amazon.awscdk.services.stepfunctions.Pass
import software.amazon.awscdk.services.stepfunctions.PassProps
import software.amazon.awscdk.services.stepfunctions.Parallel
import software.amazon.awscdk.services.stepfunctions.ParallelProps
import software.amazon.awscdk.services.stepfunctions.Map
import software.amazon.awscdk.services.stepfunctions.MapProps
import software.amazon.awscdk.services.stepfunctions.Wait
import software.amazon.awscdk.services.stepfunctions.WaitProps
import software.amazon.awscdk.services.stepfunctions.StateMachine
import software.amazon.awscdk.services.stepfunctions.StateMachineProps
import software.amazon.awscdk.services.stepfunctions.Activity
import software.amazon.awscdk.services.stepfunctions.ActivityProps
import software.amazon.awscdk.services.stepfunctions.CfnActivity
import software.amazon.awscdk.services.stepfunctions.CfnActivityProps
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps
import software.amazon.awscdk.services.stepfunctions.Succeed
import software.amazon.awscdk.services.stepfunctions.SucceedProps

fun Construct.fail(id: String, init: FailProps.Builder.() -> Unit): Fail {
    val propsBuilder = FailProps.builder()
    propsBuilder.init()
    
    return Fail(this, id, propsBuilder.build())
}

fun Construct.choice(id: String, init: ChoiceProps.Builder.() -> Unit): Choice {
    val propsBuilder = ChoiceProps.builder()
    propsBuilder.init()
    
    return Choice(this, id, propsBuilder.build())
}

fun Construct.task(id: String, init: TaskProps.Builder.() -> Unit): Task {
    val propsBuilder = TaskProps.builder()
    propsBuilder.init()
    
    return Task(this, id, propsBuilder.build())
}

fun Construct.pass(id: String, init: PassProps.Builder.() -> Unit): Pass {
    val propsBuilder = PassProps.builder()
    propsBuilder.init()
    
    return Pass(this, id, propsBuilder.build())
}

fun Construct.parallel(id: String, init: ParallelProps.Builder.() -> Unit): Parallel {
    val propsBuilder = ParallelProps.builder()
    propsBuilder.init()
    
    return Parallel(this, id, propsBuilder.build())
}

fun Construct.map(id: String, init: MapProps.Builder.() -> Unit): Map {
    val propsBuilder = MapProps.builder()
    propsBuilder.init()
    
    return Map(this, id, propsBuilder.build())
}

fun Construct.wait(id: String, init: WaitProps.Builder.() -> Unit): Wait {
    val propsBuilder = WaitProps.builder()
    propsBuilder.init()
    
    return Wait(this, id, propsBuilder.build())
}

fun Construct.stateMachine(id: String, init: StateMachineProps.Builder.() -> Unit): StateMachine {
    val propsBuilder = StateMachineProps.builder()
    propsBuilder.init()
    
    return StateMachine(this, id, propsBuilder.build())
}

fun Construct.activity(id: String, init: ActivityProps.Builder.() -> Unit): Activity {
    val propsBuilder = ActivityProps.builder()
    propsBuilder.init()
    
    return Activity(this, id, propsBuilder.build())
}

fun Construct.cfnActivity(id: String, init: CfnActivityProps.Builder.() -> Unit): CfnActivity {
    val propsBuilder = CfnActivityProps.builder()
    propsBuilder.init()
    
    return CfnActivity(this, id, propsBuilder.build())
}

fun Construct.cfnStateMachine(id: String, init: CfnStateMachineProps.Builder.() -> Unit): CfnStateMachine {
    val propsBuilder = CfnStateMachineProps.builder()
    propsBuilder.init()
    
    return CfnStateMachine(this, id, propsBuilder.build())
}

fun Construct.succeed(id: String, init: SucceedProps.Builder.() -> Unit): Succeed {
    val propsBuilder = SucceedProps.builder()
    propsBuilder.init()
    
    return Succeed(this, id, propsBuilder.build())
}

