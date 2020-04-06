package com.brianyarr.cdk.managedblockchain

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.managedblockchain.CfnMember
import software.amazon.awscdk.services.managedblockchain.CfnMemberProps
import software.amazon.awscdk.services.managedblockchain.CfnNode
import software.amazon.awscdk.services.managedblockchain.CfnNodeProps

fun Construct.cfnMember(id: String, init: CfnMemberProps.Builder.() -> Unit): CfnMember {
    val propsBuilder = CfnMemberProps.builder()
    propsBuilder.init()
    
    return CfnMember(this, id, propsBuilder.build())
}

fun Construct.cfnNode(id: String, init: CfnNodeProps.Builder.() -> Unit): CfnNode {
    val propsBuilder = CfnNodeProps.builder()
    propsBuilder.init()
    
    return CfnNode(this, id, propsBuilder.build())
}

