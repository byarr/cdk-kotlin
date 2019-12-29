package com.brianyarr.cdk.lambda

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.lambda.SingletonFunction
import software.amazon.awscdk.services.lambda.SingletonFunctionProps
import software.amazon.awscdk.services.lambda.EventSourceMapping
import software.amazon.awscdk.services.lambda.EventSourceMappingProps
import software.amazon.awscdk.services.lambda.Function
import software.amazon.awscdk.services.lambda.FunctionProps
import software.amazon.awscdk.services.lambda.Version
import software.amazon.awscdk.services.lambda.VersionProps
import software.amazon.awscdk.services.lambda.Alias
import software.amazon.awscdk.services.lambda.AliasProps
import software.amazon.awscdk.services.lambda.LayerVersion
import software.amazon.awscdk.services.lambda.LayerVersionProps

fun Construct.singletonFunction(id: String, init: SingletonFunctionProps.Builder.() -> Unit): SingletonFunction {
    val propsBuilder = SingletonFunctionProps.builder()
    propsBuilder.init()
    
    return SingletonFunction(this, id, propsBuilder.build())
}


fun Construct.eventSourceMapping(id: String, init: EventSourceMappingProps.Builder.() -> Unit): EventSourceMapping {
    val propsBuilder = EventSourceMappingProps.builder()
    propsBuilder.init()
    
    return EventSourceMapping(this, id, propsBuilder.build())
}


fun Construct.function(id: String, init: FunctionProps.Builder.() -> Unit): Function {
    val propsBuilder = FunctionProps.builder()
    propsBuilder.init()
    
    return Function(this, id, propsBuilder.build())
}


fun Construct.version(id: String, init: VersionProps.Builder.() -> Unit): Version {
    val propsBuilder = VersionProps.builder()
    propsBuilder.init()
    
    return Version(this, id, propsBuilder.build())
}


fun Construct.alias(id: String, init: AliasProps.Builder.() -> Unit): Alias {
    val propsBuilder = AliasProps.builder()
    propsBuilder.init()
    
    return Alias(this, id, propsBuilder.build())
}


fun Construct.layerVersion(id: String, init: LayerVersionProps.Builder.() -> Unit): LayerVersion {
    val propsBuilder = LayerVersionProps.builder()
    propsBuilder.init()
    
    return LayerVersion(this, id, propsBuilder.build())
}


