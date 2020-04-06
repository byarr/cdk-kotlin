package com.brianyarr.cdk.amplify

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.amplify.CfnBranch
import software.amazon.awscdk.services.amplify.CfnBranchProps
import software.amazon.awscdk.services.amplify.CfnApp
import software.amazon.awscdk.services.amplify.CfnAppProps
import software.amazon.awscdk.services.amplify.CfnDomain
import software.amazon.awscdk.services.amplify.CfnDomainProps
import software.amazon.awscdk.services.amplify.Branch
import software.amazon.awscdk.services.amplify.BranchProps
import software.amazon.awscdk.services.amplify.App
import software.amazon.awscdk.services.amplify.AppProps
import software.amazon.awscdk.services.amplify.Domain
import software.amazon.awscdk.services.amplify.DomainProps

fun Construct.cfnBranch(id: String, init: CfnBranchProps.Builder.() -> Unit): CfnBranch {
    val propsBuilder = CfnBranchProps.builder()
    propsBuilder.init()
    
    return CfnBranch(this, id, propsBuilder.build())
}

fun Construct.cfnApp(id: String, init: CfnAppProps.Builder.() -> Unit): CfnApp {
    val propsBuilder = CfnAppProps.builder()
    propsBuilder.init()
    
    return CfnApp(this, id, propsBuilder.build())
}

fun Construct.cfnDomain(id: String, init: CfnDomainProps.Builder.() -> Unit): CfnDomain {
    val propsBuilder = CfnDomainProps.builder()
    propsBuilder.init()
    
    return CfnDomain(this, id, propsBuilder.build())
}

fun Construct.branch(id: String, init: BranchProps.Builder.() -> Unit): Branch {
    val propsBuilder = BranchProps.builder()
    propsBuilder.init()
    
    return Branch(this, id, propsBuilder.build())
}

fun Construct.app(id: String, init: AppProps.Builder.() -> Unit): App {
    val propsBuilder = AppProps.builder()
    propsBuilder.init()
    
    return App(this, id, propsBuilder.build())
}

fun Construct.domain(id: String, init: DomainProps.Builder.() -> Unit): Domain {
    val propsBuilder = DomainProps.builder()
    propsBuilder.init()
    
    return Domain(this, id, propsBuilder.build())
}

