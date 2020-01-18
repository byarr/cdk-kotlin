package com.brianyarr.cdk.dax

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.dax.CfnCluster
import software.amazon.awscdk.services.dax.CfnClusterProps
import software.amazon.awscdk.services.dax.CfnSubnetGroup
import software.amazon.awscdk.services.dax.CfnSubnetGroupProps
import software.amazon.awscdk.services.dax.CfnParameterGroup
import software.amazon.awscdk.services.dax.CfnParameterGroupProps

fun Construct.cfnCluster(id: String, init: CfnClusterProps.Builder.() -> Unit): CfnCluster {
    val propsBuilder = CfnClusterProps.builder()
    propsBuilder.init()
    
    return CfnCluster(this, id, propsBuilder.build())
}

fun Construct.cfnSubnetGroup(id: String, init: CfnSubnetGroupProps.Builder.() -> Unit): CfnSubnetGroup {
    val propsBuilder = CfnSubnetGroupProps.builder()
    propsBuilder.init()
    
    return CfnSubnetGroup(this, id, propsBuilder.build())
}

fun Construct.cfnParameterGroup(id: String, init: CfnParameterGroupProps.Builder.() -> Unit): CfnParameterGroup {
    val propsBuilder = CfnParameterGroupProps.builder()
    propsBuilder.init()
    
    return CfnParameterGroup(this, id, propsBuilder.build())
}

