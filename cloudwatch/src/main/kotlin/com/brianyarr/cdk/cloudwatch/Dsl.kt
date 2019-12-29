package com.brianyarr.cdk.cloudwatch

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.cloudwatch.Dashboard
import software.amazon.awscdk.services.cloudwatch.DashboardProps
import software.amazon.awscdk.services.cloudwatch.Alarm
import software.amazon.awscdk.services.cloudwatch.AlarmProps

fun Construct.dashboard(id: String, init: DashboardProps.Builder.() -> Unit): Dashboard {
    val propsBuilder = DashboardProps.builder()
    propsBuilder.init()
    
    return Dashboard(this, id, propsBuilder.build())
}


fun Construct.alarm(id: String, init: AlarmProps.Builder.() -> Unit): Alarm {
    val propsBuilder = AlarmProps.builder()
    propsBuilder.init()
    
    return Alarm(this, id, propsBuilder.build())
}


