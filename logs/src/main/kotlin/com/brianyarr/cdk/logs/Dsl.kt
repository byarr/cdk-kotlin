package com.brianyarr.cdk.logs

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.logs.SubscriptionFilter
import software.amazon.awscdk.services.logs.SubscriptionFilterProps
import software.amazon.awscdk.services.logs.MetricFilter
import software.amazon.awscdk.services.logs.MetricFilterProps
import software.amazon.awscdk.services.logs.CrossAccountDestination
import software.amazon.awscdk.services.logs.CrossAccountDestinationProps
import software.amazon.awscdk.services.logs.LogGroup
import software.amazon.awscdk.services.logs.LogGroupProps
import software.amazon.awscdk.services.logs.LogStream
import software.amazon.awscdk.services.logs.LogStreamProps

fun Construct.subscriptionFilter(id: String, init: SubscriptionFilterProps.Builder.() -> Unit): SubscriptionFilter {
    val propsBuilder = SubscriptionFilterProps.builder()
    propsBuilder.init()
    
    return SubscriptionFilter(this, id, propsBuilder.build())
}


fun Construct.metricFilter(id: String, init: MetricFilterProps.Builder.() -> Unit): MetricFilter {
    val propsBuilder = MetricFilterProps.builder()
    propsBuilder.init()
    
    return MetricFilter(this, id, propsBuilder.build())
}


fun Construct.crossAccountDestination(id: String, init: CrossAccountDestinationProps.Builder.() -> Unit): CrossAccountDestination {
    val propsBuilder = CrossAccountDestinationProps.builder()
    propsBuilder.init()
    
    return CrossAccountDestination(this, id, propsBuilder.build())
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


