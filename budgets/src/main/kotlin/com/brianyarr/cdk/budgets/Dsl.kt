package com.brianyarr.cdk.budgets

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.budgets.CfnBudget
import software.amazon.awscdk.services.budgets.CfnBudgetProps

fun Construct.cfnBudget(id: String, init: CfnBudgetProps.Builder.() -> Unit): CfnBudget {
    val propsBuilder = CfnBudgetProps.builder()
    propsBuilder.init()
    
    return CfnBudget(this, id, propsBuilder.build())
}

