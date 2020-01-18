package com.brianyarr.cdk.amplify

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.amplify.CfnDomain
import software.amazon.awscdk.services.amplify.CfnDomainProps
import software.amazon.awscdk.services.amplify.CfnApp
import software.amazon.awscdk.services.amplify.CfnAppProps
import software.amazon.awscdk.services.amplify.CfnBranch
import software.amazon.awscdk.services.amplify.CfnBranchProps

fun Construct.cfnDomain(id: String, init: CfnDomainProps.Builder.() -> Unit): CfnDomain {
    val propsBuilder = CfnDomainProps.builder()
    propsBuilder.init()
    
    return CfnDomain(this, id, propsBuilder.build())
}

fun Construct.cfnApp(id: String, init: CfnAppProps.Builder.() -> Unit): CfnApp {
    val propsBuilder = CfnAppProps.builder()
    propsBuilder.init()
    
    return CfnApp(this, id, propsBuilder.build())
}

fun Construct.cfnBranch(id: String, init: CfnBranchProps.Builder.() -> Unit): CfnBranch {
    val propsBuilder = CfnBranchProps.builder()
    propsBuilder.init()
    
    return CfnBranch(this, id, propsBuilder.build())
}

