package com.brianyarr.cdk.lambda

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.lambda.EventSourceMapping
import software.amazon.awscdk.services.lambda.EventSourceMappingProps
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfig
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps
import software.amazon.awscdk.services.lambda.CfnLayerVersionPermission
import software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps
import software.amazon.awscdk.services.lambda.CfnFunction
import software.amazon.awscdk.services.lambda.CfnFunctionProps
import software.amazon.awscdk.services.lambda.Alias
import software.amazon.awscdk.services.lambda.AliasProps
import software.amazon.awscdk.services.lambda.EventInvokeConfig
import software.amazon.awscdk.services.lambda.EventInvokeConfigProps
import software.amazon.awscdk.services.lambda.Version
import software.amazon.awscdk.services.lambda.VersionProps
import software.amazon.awscdk.services.lambda.SingletonFunction
import software.amazon.awscdk.services.lambda.SingletonFunctionProps
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping
import software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps
import software.amazon.awscdk.services.lambda.CfnVersion
import software.amazon.awscdk.services.lambda.CfnVersionProps
import software.amazon.awscdk.services.lambda.LayerVersion
import software.amazon.awscdk.services.lambda.LayerVersionProps
import software.amazon.awscdk.services.lambda.CfnLayerVersion
import software.amazon.awscdk.services.lambda.CfnLayerVersionProps
import software.amazon.awscdk.services.lambda.CfnPermission
import software.amazon.awscdk.services.lambda.CfnPermissionProps
import software.amazon.awscdk.services.lambda.Function
import software.amazon.awscdk.services.lambda.FunctionProps
import software.amazon.awscdk.services.lambda.LogRetention
import software.amazon.awscdk.services.lambda.LogRetentionProps
import software.amazon.awscdk.services.lambda.CfnAlias
import software.amazon.awscdk.services.lambda.CfnAliasProps

fun Construct.eventSourceMapping(id: String, init: EventSourceMappingProps.Builder.() -> Unit): EventSourceMapping {
    val propsBuilder = EventSourceMappingProps.builder()
    propsBuilder.init()
    
    return EventSourceMapping(this, id, propsBuilder.build())
}

fun Construct.cfnEventInvokeConfig(id: String, init: CfnEventInvokeConfigProps.Builder.() -> Unit): CfnEventInvokeConfig {
    val propsBuilder = CfnEventInvokeConfigProps.builder()
    propsBuilder.init()
    
    return CfnEventInvokeConfig(this, id, propsBuilder.build())
}

fun Construct.cfnLayerVersionPermission(id: String, init: CfnLayerVersionPermissionProps.Builder.() -> Unit): CfnLayerVersionPermission {
    val propsBuilder = CfnLayerVersionPermissionProps.builder()
    propsBuilder.init()
    
    return CfnLayerVersionPermission(this, id, propsBuilder.build())
}

fun Construct.cfnFunction(id: String, init: CfnFunctionProps.Builder.() -> Unit): CfnFunction {
    val propsBuilder = CfnFunctionProps.builder()
    propsBuilder.init()
    
    return CfnFunction(this, id, propsBuilder.build())
}

fun Construct.alias(id: String, init: AliasProps.Builder.() -> Unit): Alias {
    val propsBuilder = AliasProps.builder()
    propsBuilder.init()
    
    return Alias(this, id, propsBuilder.build())
}

fun Construct.eventInvokeConfig(id: String, init: EventInvokeConfigProps.Builder.() -> Unit): EventInvokeConfig {
    val propsBuilder = EventInvokeConfigProps.builder()
    propsBuilder.init()
    
    return EventInvokeConfig(this, id, propsBuilder.build())
}

fun Construct.version(id: String, init: VersionProps.Builder.() -> Unit): Version {
    val propsBuilder = VersionProps.builder()
    propsBuilder.init()
    
    return Version(this, id, propsBuilder.build())
}

fun Construct.singletonFunction(id: String, init: SingletonFunctionProps.Builder.() -> Unit): SingletonFunction {
    val propsBuilder = SingletonFunctionProps.builder()
    propsBuilder.init()
    
    return SingletonFunction(this, id, propsBuilder.build())
}

fun Construct.cfnEventSourceMapping(id: String, init: CfnEventSourceMappingProps.Builder.() -> Unit): CfnEventSourceMapping {
    val propsBuilder = CfnEventSourceMappingProps.builder()
    propsBuilder.init()
    
    return CfnEventSourceMapping(this, id, propsBuilder.build())
}

fun Construct.cfnVersion(id: String, init: CfnVersionProps.Builder.() -> Unit): CfnVersion {
    val propsBuilder = CfnVersionProps.builder()
    propsBuilder.init()
    
    return CfnVersion(this, id, propsBuilder.build())
}

fun Construct.layerVersion(id: String, init: LayerVersionProps.Builder.() -> Unit): LayerVersion {
    val propsBuilder = LayerVersionProps.builder()
    propsBuilder.init()
    
    return LayerVersion(this, id, propsBuilder.build())
}

fun Construct.cfnLayerVersion(id: String, init: CfnLayerVersionProps.Builder.() -> Unit): CfnLayerVersion {
    val propsBuilder = CfnLayerVersionProps.builder()
    propsBuilder.init()
    
    return CfnLayerVersion(this, id, propsBuilder.build())
}

fun Construct.cfnPermission(id: String, init: CfnPermissionProps.Builder.() -> Unit): CfnPermission {
    val propsBuilder = CfnPermissionProps.builder()
    propsBuilder.init()
    
    return CfnPermission(this, id, propsBuilder.build())
}

fun Construct.function(id: String, init: FunctionProps.Builder.() -> Unit): Function {
    val propsBuilder = FunctionProps.builder()
    propsBuilder.init()
    
    return Function(this, id, propsBuilder.build())
}

fun Construct.logRetention(id: String, init: LogRetentionProps.Builder.() -> Unit): LogRetention {
    val propsBuilder = LogRetentionProps.builder()
    propsBuilder.init()
    
    return LogRetention(this, id, propsBuilder.build())
}

fun Construct.cfnAlias(id: String, init: CfnAliasProps.Builder.() -> Unit): CfnAlias {
    val propsBuilder = CfnAliasProps.builder()
    propsBuilder.init()
    
    return CfnAlias(this, id, propsBuilder.build())
}

