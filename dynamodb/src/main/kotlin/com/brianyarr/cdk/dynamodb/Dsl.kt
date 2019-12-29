package com.brianyarr.cdk.dynamodb

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.dynamodb.Table
import software.amazon.awscdk.services.dynamodb.TableProps

fun Construct.table(id: String, init: TableProps.Builder.() -> Unit): Table {
    val propsBuilder = TableProps.builder()
    propsBuilder.init()
    
    return Table(this, id, propsBuilder.build())
}


