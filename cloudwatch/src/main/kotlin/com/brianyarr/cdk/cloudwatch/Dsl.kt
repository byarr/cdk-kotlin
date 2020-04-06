package com.brianyarr.cdk.cloudwatch

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarm
import software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps
import software.amazon.awscdk.services.cloudwatch.CfnAlarm
import software.amazon.awscdk.services.cloudwatch.CfnAlarmProps
import software.amazon.awscdk.services.cloudwatch.Alarm
import software.amazon.awscdk.services.cloudwatch.AlarmProps
import software.amazon.awscdk.services.cloudwatch.Dashboard
import software.amazon.awscdk.services.cloudwatch.DashboardProps
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps
import software.amazon.awscdk.services.cloudwatch.CfnInsightRule
import software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps
import software.amazon.awscdk.services.cloudwatch.CfnDashboard
import software.amazon.awscdk.services.cloudwatch.CfnDashboardProps

fun Construct.cfnCompositeAlarm(id: String, init: CfnCompositeAlarmProps.Builder.() -> Unit): CfnCompositeAlarm {
    val propsBuilder = CfnCompositeAlarmProps.builder()
    propsBuilder.init()
    
    return CfnCompositeAlarm(this, id, propsBuilder.build())
}

fun Construct.cfnAlarm(id: String, init: CfnAlarmProps.Builder.() -> Unit): CfnAlarm {
    val propsBuilder = CfnAlarmProps.builder()
    propsBuilder.init()
    
    return CfnAlarm(this, id, propsBuilder.build())
}

fun Construct.alarm(id: String, init: AlarmProps.Builder.() -> Unit): Alarm {
    val propsBuilder = AlarmProps.builder()
    propsBuilder.init()
    
    return Alarm(this, id, propsBuilder.build())
}

fun Construct.dashboard(id: String, init: DashboardProps.Builder.() -> Unit): Dashboard {
    val propsBuilder = DashboardProps.builder()
    propsBuilder.init()
    
    return Dashboard(this, id, propsBuilder.build())
}

fun Construct.cfnAnomalyDetector(id: String, init: CfnAnomalyDetectorProps.Builder.() -> Unit): CfnAnomalyDetector {
    val propsBuilder = CfnAnomalyDetectorProps.builder()
    propsBuilder.init()
    
    return CfnAnomalyDetector(this, id, propsBuilder.build())
}

fun Construct.cfnInsightRule(id: String, init: CfnInsightRuleProps.Builder.() -> Unit): CfnInsightRule {
    val propsBuilder = CfnInsightRuleProps.builder()
    propsBuilder.init()
    
    return CfnInsightRule(this, id, propsBuilder.build())
}

fun Construct.cfnDashboard(id: String, init: CfnDashboardProps.Builder.() -> Unit): CfnDashboard {
    val propsBuilder = CfnDashboardProps.builder()
    propsBuilder.init()
    
    return CfnDashboard(this, id, propsBuilder.build())
}

