package com.brianyarr.cdk.dynamodb

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.dynamodb.Table
import software.amazon.awscdk.services.dynamodb.TableProps
import software.amazon.awscdk.services.dynamodb.CfnTable
import software.amazon.awscdk.services.dynamodb.CfnTableProps

fun Construct.table(id: String, init: TableProps.Builder.() -> Unit): Table {
    val propsBuilder = TableProps.builder()
    propsBuilder.init()
    
    return Table(this, id, propsBuilder.build())
}

fun Construct.cfnTable(id: String, init: CfnTableProps.Builder.() -> Unit): CfnTable {
    val propsBuilder = CfnTableProps.builder()
    propsBuilder.init()
    
    return CfnTable(this, id, propsBuilder.build())
}

