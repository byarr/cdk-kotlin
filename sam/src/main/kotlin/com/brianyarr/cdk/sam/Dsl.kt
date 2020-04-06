package com.brianyarr.cdk.sam

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.sam.CfnApi
import software.amazon.awscdk.services.sam.CfnApiProps
import software.amazon.awscdk.services.sam.CfnSimpleTable
import software.amazon.awscdk.services.sam.CfnSimpleTableProps
import software.amazon.awscdk.services.sam.CfnFunction
import software.amazon.awscdk.services.sam.CfnFunctionProps
import software.amazon.awscdk.services.sam.CfnApplication
import software.amazon.awscdk.services.sam.CfnApplicationProps
import software.amazon.awscdk.services.sam.CfnLayerVersion
import software.amazon.awscdk.services.sam.CfnLayerVersionProps

fun Construct.cfnApi(id: String, init: CfnApiProps.Builder.() -> Unit): CfnApi {
    val propsBuilder = CfnApiProps.builder()
    propsBuilder.init()
    
    return CfnApi(this, id, propsBuilder.build())
}

fun Construct.cfnSimpleTable(id: String, init: CfnSimpleTableProps.Builder.() -> Unit): CfnSimpleTable {
    val propsBuilder = CfnSimpleTableProps.builder()
    propsBuilder.init()
    
    return CfnSimpleTable(this, id, propsBuilder.build())
}

fun Construct.cfnFunction(id: String, init: CfnFunctionProps.Builder.() -> Unit): CfnFunction {
    val propsBuilder = CfnFunctionProps.builder()
    propsBuilder.init()
    
    return CfnFunction(this, id, propsBuilder.build())
}

fun Construct.cfnApplication(id: String, init: CfnApplicationProps.Builder.() -> Unit): CfnApplication {
    val propsBuilder = CfnApplicationProps.builder()
    propsBuilder.init()
    
    return CfnApplication(this, id, propsBuilder.build())
}

fun Construct.cfnLayerVersion(id: String, init: CfnLayerVersionProps.Builder.() -> Unit): CfnLayerVersion {
    val propsBuilder = CfnLayerVersionProps.builder()
    propsBuilder.init()
    
    return CfnLayerVersion(this, id, propsBuilder.build())
}

