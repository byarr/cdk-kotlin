package com.brianyarr.cdk.eventschemas

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.eventschemas.CfnRegistry
import software.amazon.awscdk.services.eventschemas.CfnRegistryProps
import software.amazon.awscdk.services.eventschemas.CfnSchema
import software.amazon.awscdk.services.eventschemas.CfnSchemaProps
import software.amazon.awscdk.services.eventschemas.CfnDiscoverer
import software.amazon.awscdk.services.eventschemas.CfnDiscovererProps

fun Construct.cfnRegistry(id: String, init: CfnRegistryProps.Builder.() -> Unit): CfnRegistry {
    val propsBuilder = CfnRegistryProps.builder()
    propsBuilder.init()
    
    return CfnRegistry(this, id, propsBuilder.build())
}

fun Construct.cfnSchema(id: String, init: CfnSchemaProps.Builder.() -> Unit): CfnSchema {
    val propsBuilder = CfnSchemaProps.builder()
    propsBuilder.init()
    
    return CfnSchema(this, id, propsBuilder.build())
}

fun Construct.cfnDiscoverer(id: String, init: CfnDiscovererProps.Builder.() -> Unit): CfnDiscoverer {
    val propsBuilder = CfnDiscovererProps.builder()
    propsBuilder.init()
    
    return CfnDiscoverer(this, id, propsBuilder.build())
}

