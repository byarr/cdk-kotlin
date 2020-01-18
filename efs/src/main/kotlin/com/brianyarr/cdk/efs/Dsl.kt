package com.brianyarr.cdk.efs

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.efs.CfnMountTarget
import software.amazon.awscdk.services.efs.CfnMountTargetProps
import software.amazon.awscdk.services.efs.CfnFileSystem
import software.amazon.awscdk.services.efs.CfnFileSystemProps

fun Construct.cfnMountTarget(id: String, init: CfnMountTargetProps.Builder.() -> Unit): CfnMountTarget {
    val propsBuilder = CfnMountTargetProps.builder()
    propsBuilder.init()
    
    return CfnMountTarget(this, id, propsBuilder.build())
}

fun Construct.cfnFileSystem(id: String, init: CfnFileSystemProps.Builder.() -> Unit): CfnFileSystem {
    val propsBuilder = CfnFileSystemProps.builder()
    propsBuilder.init()
    
    return CfnFileSystem(this, id, propsBuilder.build())
}

