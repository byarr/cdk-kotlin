package com.brianyarr.cdk.workspaces

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.workspaces.CfnWorkspace
import software.amazon.awscdk.services.workspaces.CfnWorkspaceProps

fun Construct.cfnWorkspace(id: String, init: CfnWorkspaceProps.Builder.() -> Unit): CfnWorkspace {
    val propsBuilder = CfnWorkspaceProps.builder()
    propsBuilder.init()
    
    return CfnWorkspace(this, id, propsBuilder.build())
}

