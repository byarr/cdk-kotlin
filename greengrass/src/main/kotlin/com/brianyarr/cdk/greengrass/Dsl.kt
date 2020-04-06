package com.brianyarr.cdk.greengrass

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinition
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionProps
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinition
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps
import software.amazon.awscdk.services.greengrass.CfnGroupVersion
import software.amazon.awscdk.services.greengrass.CfnGroupVersionProps
import software.amazon.awscdk.services.greengrass.CfnGroup
import software.amazon.awscdk.services.greengrass.CfnGroupProps
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionProps
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps
import software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps
import software.amazon.awscdk.services.greengrass.CfnCoreDefinition
import software.amazon.awscdk.services.greengrass.CfnCoreDefinitionProps
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinition
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionProps
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinition
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionProps
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionProps

fun Construct.cfnFunctionDefinition(id: String, init: CfnFunctionDefinitionProps.Builder.() -> Unit): CfnFunctionDefinition {
    val propsBuilder = CfnFunctionDefinitionProps.builder()
    propsBuilder.init()
    
    return CfnFunctionDefinition(this, id, propsBuilder.build())
}

fun Construct.cfnLoggerDefinition(id: String, init: CfnLoggerDefinitionProps.Builder.() -> Unit): CfnLoggerDefinition {
    val propsBuilder = CfnLoggerDefinitionProps.builder()
    propsBuilder.init()
    
    return CfnLoggerDefinition(this, id, propsBuilder.build())
}

fun Construct.cfnDeviceDefinitionVersion(id: String, init: CfnDeviceDefinitionVersionProps.Builder.() -> Unit): CfnDeviceDefinitionVersion {
    val propsBuilder = CfnDeviceDefinitionVersionProps.builder()
    propsBuilder.init()
    
    return CfnDeviceDefinitionVersion(this, id, propsBuilder.build())
}

fun Construct.cfnFunctionDefinitionVersion(id: String, init: CfnFunctionDefinitionVersionProps.Builder.() -> Unit): CfnFunctionDefinitionVersion {
    val propsBuilder = CfnFunctionDefinitionVersionProps.builder()
    propsBuilder.init()
    
    return CfnFunctionDefinitionVersion(this, id, propsBuilder.build())
}

fun Construct.cfnGroupVersion(id: String, init: CfnGroupVersionProps.Builder.() -> Unit): CfnGroupVersion {
    val propsBuilder = CfnGroupVersionProps.builder()
    propsBuilder.init()
    
    return CfnGroupVersion(this, id, propsBuilder.build())
}

fun Construct.cfnGroup(id: String, init: CfnGroupProps.Builder.() -> Unit): CfnGroup {
    val propsBuilder = CfnGroupProps.builder()
    propsBuilder.init()
    
    return CfnGroup(this, id, propsBuilder.build())
}

fun Construct.cfnSubscriptionDefinition(id: String, init: CfnSubscriptionDefinitionProps.Builder.() -> Unit): CfnSubscriptionDefinition {
    val propsBuilder = CfnSubscriptionDefinitionProps.builder()
    propsBuilder.init()
    
    return CfnSubscriptionDefinition(this, id, propsBuilder.build())
}

fun Construct.cfnConnectorDefinitionVersion(id: String, init: CfnConnectorDefinitionVersionProps.Builder.() -> Unit): CfnConnectorDefinitionVersion {
    val propsBuilder = CfnConnectorDefinitionVersionProps.builder()
    propsBuilder.init()
    
    return CfnConnectorDefinitionVersion(this, id, propsBuilder.build())
}

fun Construct.cfnCoreDefinitionVersion(id: String, init: CfnCoreDefinitionVersionProps.Builder.() -> Unit): CfnCoreDefinitionVersion {
    val propsBuilder = CfnCoreDefinitionVersionProps.builder()
    propsBuilder.init()
    
    return CfnCoreDefinitionVersion(this, id, propsBuilder.build())
}

fun Construct.cfnCoreDefinition(id: String, init: CfnCoreDefinitionProps.Builder.() -> Unit): CfnCoreDefinition {
    val propsBuilder = CfnCoreDefinitionProps.builder()
    propsBuilder.init()
    
    return CfnCoreDefinition(this, id, propsBuilder.build())
}

fun Construct.cfnConnectorDefinition(id: String, init: CfnConnectorDefinitionProps.Builder.() -> Unit): CfnConnectorDefinition {
    val propsBuilder = CfnConnectorDefinitionProps.builder()
    propsBuilder.init()
    
    return CfnConnectorDefinition(this, id, propsBuilder.build())
}

fun Construct.cfnResourceDefinitionVersion(id: String, init: CfnResourceDefinitionVersionProps.Builder.() -> Unit): CfnResourceDefinitionVersion {
    val propsBuilder = CfnResourceDefinitionVersionProps.builder()
    propsBuilder.init()
    
    return CfnResourceDefinitionVersion(this, id, propsBuilder.build())
}

fun Construct.cfnLoggerDefinitionVersion(id: String, init: CfnLoggerDefinitionVersionProps.Builder.() -> Unit): CfnLoggerDefinitionVersion {
    val propsBuilder = CfnLoggerDefinitionVersionProps.builder()
    propsBuilder.init()
    
    return CfnLoggerDefinitionVersion(this, id, propsBuilder.build())
}

fun Construct.cfnDeviceDefinition(id: String, init: CfnDeviceDefinitionProps.Builder.() -> Unit): CfnDeviceDefinition {
    val propsBuilder = CfnDeviceDefinitionProps.builder()
    propsBuilder.init()
    
    return CfnDeviceDefinition(this, id, propsBuilder.build())
}

fun Construct.cfnSubscriptionDefinitionVersion(id: String, init: CfnSubscriptionDefinitionVersionProps.Builder.() -> Unit): CfnSubscriptionDefinitionVersion {
    val propsBuilder = CfnSubscriptionDefinitionVersionProps.builder()
    propsBuilder.init()
    
    return CfnSubscriptionDefinitionVersion(this, id, propsBuilder.build())
}

fun Construct.cfnResourceDefinition(id: String, init: CfnResourceDefinitionProps.Builder.() -> Unit): CfnResourceDefinition {
    val propsBuilder = CfnResourceDefinitionProps.builder()
    propsBuilder.init()
    
    return CfnResourceDefinition(this, id, propsBuilder.build())
}

