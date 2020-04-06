package com.brianyarr.cdk.appstream

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.appstream.CfnStackFleetAssociation
import software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps
import software.amazon.awscdk.services.appstream.CfnUser
import software.amazon.awscdk.services.appstream.CfnUserProps
import software.amazon.awscdk.services.appstream.CfnImageBuilder
import software.amazon.awscdk.services.appstream.CfnImageBuilderProps
import software.amazon.awscdk.services.appstream.CfnStackUserAssociation
import software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps
import software.amazon.awscdk.services.appstream.CfnStack
import software.amazon.awscdk.services.appstream.CfnStackProps
import software.amazon.awscdk.services.appstream.CfnDirectoryConfig
import software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps
import software.amazon.awscdk.services.appstream.CfnFleet
import software.amazon.awscdk.services.appstream.CfnFleetProps

fun Construct.cfnStackFleetAssociation(id: String, init: CfnStackFleetAssociationProps.Builder.() -> Unit): CfnStackFleetAssociation {
    val propsBuilder = CfnStackFleetAssociationProps.builder()
    propsBuilder.init()
    
    return CfnStackFleetAssociation(this, id, propsBuilder.build())
}

fun Construct.cfnUser(id: String, init: CfnUserProps.Builder.() -> Unit): CfnUser {
    val propsBuilder = CfnUserProps.builder()
    propsBuilder.init()
    
    return CfnUser(this, id, propsBuilder.build())
}

fun Construct.cfnImageBuilder(id: String, init: CfnImageBuilderProps.Builder.() -> Unit): CfnImageBuilder {
    val propsBuilder = CfnImageBuilderProps.builder()
    propsBuilder.init()
    
    return CfnImageBuilder(this, id, propsBuilder.build())
}

fun Construct.cfnStackUserAssociation(id: String, init: CfnStackUserAssociationProps.Builder.() -> Unit): CfnStackUserAssociation {
    val propsBuilder = CfnStackUserAssociationProps.builder()
    propsBuilder.init()
    
    return CfnStackUserAssociation(this, id, propsBuilder.build())
}

fun Construct.cfnStack(id: String, init: CfnStackProps.Builder.() -> Unit): CfnStack {
    val propsBuilder = CfnStackProps.builder()
    propsBuilder.init()
    
    return CfnStack(this, id, propsBuilder.build())
}

fun Construct.cfnDirectoryConfig(id: String, init: CfnDirectoryConfigProps.Builder.() -> Unit): CfnDirectoryConfig {
    val propsBuilder = CfnDirectoryConfigProps.builder()
    propsBuilder.init()
    
    return CfnDirectoryConfig(this, id, propsBuilder.build())
}

fun Construct.cfnFleet(id: String, init: CfnFleetProps.Builder.() -> Unit): CfnFleet {
    val propsBuilder = CfnFleetProps.builder()
    propsBuilder.init()
    
    return CfnFleet(this, id, propsBuilder.build())
}

