package com.brianyarr.cdk.qldb

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.qldb.CfnLedger
import software.amazon.awscdk.services.qldb.CfnLedgerProps

fun Construct.cfnLedger(id: String, init: CfnLedgerProps.Builder.() -> Unit): CfnLedger {
    val propsBuilder = CfnLedgerProps.builder()
    propsBuilder.init()
    
    return CfnLedger(this, id, propsBuilder.build())
}

