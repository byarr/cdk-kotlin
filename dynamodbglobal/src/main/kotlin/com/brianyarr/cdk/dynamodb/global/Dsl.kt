package com.brianyarr.cdk.dynamodb.global

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.dynamodb.global.GlobalTable
import software.amazon.awscdk.services.dynamodb.global.GlobalTableProps

fun Construct.globalTable(id: String, init: GlobalTableProps.Builder.() -> Unit): GlobalTable {
    val propsBuilder = GlobalTableProps.builder()
    propsBuilder.init()
    
    return GlobalTable(this, id, propsBuilder.build())
}

