package com.brianyarr.cdk.glue

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.glue.Database
import software.amazon.awscdk.services.glue.DatabaseProps
import software.amazon.awscdk.services.glue.Table
import software.amazon.awscdk.services.glue.TableProps

fun Construct.database(id: String, init: DatabaseProps.Builder.() -> Unit): Database {
    val propsBuilder = DatabaseProps.builder()
    propsBuilder.init()
    
    return Database(this, id, propsBuilder.build())
}


fun Construct.table(id: String, init: TableProps.Builder.() -> Unit): Table {
    val propsBuilder = TableProps.builder()
    propsBuilder.init()
    
    return Table(this, id, propsBuilder.build())
}


