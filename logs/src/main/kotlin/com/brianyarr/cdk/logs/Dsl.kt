package com.brianyarr.cdk.logs

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.logs.CfnSubscriptionFilter
import software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps
import software.amazon.awscdk.services.logs.CfnLogStream
import software.amazon.awscdk.services.logs.CfnLogStreamProps
import software.amazon.awscdk.services.logs.MetricFilter
import software.amazon.awscdk.services.logs.MetricFilterProps
import software.amazon.awscdk.services.logs.CfnLogGroup
import software.amazon.awscdk.services.logs.CfnLogGroupProps
import software.amazon.awscdk.services.logs.CrossAccountDestination
import software.amazon.awscdk.services.logs.CrossAccountDestinationProps
import software.amazon.awscdk.services.logs.CfnDestination
import software.amazon.awscdk.services.logs.CfnDestinationProps
import software.amazon.awscdk.services.logs.CfnMetricFilter
import software.amazon.awscdk.services.logs.CfnMetricFilterProps
import software.amazon.awscdk.services.logs.SubscriptionFilter
import software.amazon.awscdk.services.logs.SubscriptionFilterProps
import software.amazon.awscdk.services.logs.LogGroup
import software.amazon.awscdk.services.logs.LogGroupProps
import software.amazon.awscdk.services.logs.LogStream
import software.amazon.awscdk.services.logs.LogStreamProps

fun Construct.cfnSubscriptionFilter(id: String, init: CfnSubscriptionFilterProps.Builder.() -> Unit): CfnSubscriptionFilter {
    val propsBuilder = CfnSubscriptionFilterProps.builder()
    propsBuilder.init()
    
    return CfnSubscriptionFilter(this, id, propsBuilder.build())
}

fun Construct.cfnLogStream(id: String, init: CfnLogStreamProps.Builder.() -> Unit): CfnLogStream {
    val propsBuilder = CfnLogStreamProps.builder()
    propsBuilder.init()
    
    return CfnLogStream(this, id, propsBuilder.build())
}

fun Construct.metricFilter(id: String, init: MetricFilterProps.Builder.() -> Unit): MetricFilter {
    val propsBuilder = MetricFilterProps.builder()
    propsBuilder.init()
    
    return MetricFilter(this, id, propsBuilder.build())
}

fun Construct.cfnLogGroup(id: String, init: CfnLogGroupProps.Builder.() -> Unit): CfnLogGroup {
    val propsBuilder = CfnLogGroupProps.builder()
    propsBuilder.init()
    
    return CfnLogGroup(this, id, propsBuilder.build())
}

fun Construct.crossAccountDestination(id: String, init: CrossAccountDestinationProps.Builder.() -> Unit): CrossAccountDestination {
    val propsBuilder = CrossAccountDestinationProps.builder()
    propsBuilder.init()
    
    return CrossAccountDestination(this, id, propsBuilder.build())
}

fun Construct.cfnDestination(id: String, init: CfnDestinationProps.Builder.() -> Unit): CfnDestination {
    val propsBuilder = CfnDestinationProps.builder()
    propsBuilder.init()
    
    return CfnDestination(this, id, propsBuilder.build())
}

fun Construct.cfnMetricFilter(id: String, init: CfnMetricFilterProps.Builder.() -> Unit): CfnMetricFilter {
    val propsBuilder = CfnMetricFilterProps.builder()
    propsBuilder.init()
    
    return CfnMetricFilter(this, id, propsBuilder.build())
}

fun Construct.subscriptionFilter(id: String, init: SubscriptionFilterProps.Builder.() -> Unit): SubscriptionFilter {
    val propsBuilder = SubscriptionFilterProps.builder()
    propsBuilder.init()
    
    return SubscriptionFilter(this, id, propsBuilder.build())
}

fun Construct.logGroup(id: String, init: LogGroupProps.Builder.() -> Unit): LogGroup {
    val propsBuilder = LogGroupProps.builder()
    propsBuilder.init()
    
    return LogGroup(this, id, propsBuilder.build())
}

fun Construct.logStream(id: String, init: LogStreamProps.Builder.() -> Unit): LogStream {
    val propsBuilder = LogStreamProps.builder()
    propsBuilder.init()
    
    return LogStream(this, id, propsBuilder.build())
}

