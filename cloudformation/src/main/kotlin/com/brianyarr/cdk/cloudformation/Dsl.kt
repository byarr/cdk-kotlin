package com.brianyarr.cdk.cloudformation

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.cloudformation.CfnWaitCondition
import software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps
import software.amazon.awscdk.services.cloudformation.CustomResource
import software.amazon.awscdk.services.cloudformation.CustomResourceProps
import software.amazon.awscdk.services.cloudformation.CfnMacro
import software.amazon.awscdk.services.cloudformation.CfnMacroProps
import software.amazon.awscdk.services.cloudformation.NestedStack
import software.amazon.awscdk.services.cloudformation.NestedStackProps
import software.amazon.awscdk.services.cloudformation.CfnCustomResource
import software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps
import software.amazon.awscdk.services.cloudformation.CfnStack
import software.amazon.awscdk.services.cloudformation.CfnStackProps

fun Construct.cfnWaitCondition(id: String, init: CfnWaitConditionProps.Builder.() -> Unit): CfnWaitCondition {
    val propsBuilder = CfnWaitConditionProps.builder()
    propsBuilder.init()
    
    return CfnWaitCondition(this, id, propsBuilder.build())
}

fun Construct.customResource(id: String, init: CustomResourceProps.Builder.() -> Unit): CustomResource {
    val propsBuilder = CustomResourceProps.builder()
    propsBuilder.init()
    
    return CustomResource(this, id, propsBuilder.build())
}

fun Construct.cfnMacro(id: String, init: CfnMacroProps.Builder.() -> Unit): CfnMacro {
    val propsBuilder = CfnMacroProps.builder()
    propsBuilder.init()
    
    return CfnMacro(this, id, propsBuilder.build())
}

fun Construct.nestedStack(id: String, init: NestedStackProps.Builder.() -> Unit): NestedStack {
    val propsBuilder = NestedStackProps.builder()
    propsBuilder.init()
    
    return NestedStack(this, id, propsBuilder.build())
}

fun Construct.cfnCustomResource(id: String, init: CfnCustomResourceProps.Builder.() -> Unit): CfnCustomResource {
    val propsBuilder = CfnCustomResourceProps.builder()
    propsBuilder.init()
    
    return CfnCustomResource(this, id, propsBuilder.build())
}

fun Construct.cfnStack(id: String, init: CfnStackProps.Builder.() -> Unit): CfnStack {
    val propsBuilder = CfnStackProps.builder()
    propsBuilder.init()
    
    return CfnStack(this, id, propsBuilder.build())
}

