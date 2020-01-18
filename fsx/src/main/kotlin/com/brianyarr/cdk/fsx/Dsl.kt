package com.brianyarr.cdk.fsx

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.fsx.CfnFileSystem
import software.amazon.awscdk.services.fsx.CfnFileSystemProps

fun Construct.cfnFileSystem(id: String, init: CfnFileSystemProps.Builder.() -> Unit): CfnFileSystem {
    val propsBuilder = CfnFileSystemProps.builder()
    propsBuilder.init()
    
    return CfnFileSystem(this, id, propsBuilder.build())
}

