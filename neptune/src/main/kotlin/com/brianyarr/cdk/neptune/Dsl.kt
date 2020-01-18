package com.brianyarr.cdk.neptune

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.neptune.CfnDBParameterGroup
import software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps
import software.amazon.awscdk.services.neptune.CfnDBSubnetGroup
import software.amazon.awscdk.services.neptune.CfnDBSubnetGroupProps
import software.amazon.awscdk.services.neptune.CfnDBCluster
import software.amazon.awscdk.services.neptune.CfnDBClusterProps
import software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroup
import software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps
import software.amazon.awscdk.services.neptune.CfnDBInstance
import software.amazon.awscdk.services.neptune.CfnDBInstanceProps

fun Construct.cfnDBParameterGroup(id: String, init: CfnDBParameterGroupProps.Builder.() -> Unit): CfnDBParameterGroup {
    val propsBuilder = CfnDBParameterGroupProps.builder()
    propsBuilder.init()
    
    return CfnDBParameterGroup(this, id, propsBuilder.build())
}

fun Construct.cfnDBSubnetGroup(id: String, init: CfnDBSubnetGroupProps.Builder.() -> Unit): CfnDBSubnetGroup {
    val propsBuilder = CfnDBSubnetGroupProps.builder()
    propsBuilder.init()
    
    return CfnDBSubnetGroup(this, id, propsBuilder.build())
}

fun Construct.cfnDBCluster(id: String, init: CfnDBClusterProps.Builder.() -> Unit): CfnDBCluster {
    val propsBuilder = CfnDBClusterProps.builder()
    propsBuilder.init()
    
    return CfnDBCluster(this, id, propsBuilder.build())
}

fun Construct.cfnDBClusterParameterGroup(id: String, init: CfnDBClusterParameterGroupProps.Builder.() -> Unit): CfnDBClusterParameterGroup {
    val propsBuilder = CfnDBClusterParameterGroupProps.builder()
    propsBuilder.init()
    
    return CfnDBClusterParameterGroup(this, id, propsBuilder.build())
}

fun Construct.cfnDBInstance(id: String, init: CfnDBInstanceProps.Builder.() -> Unit): CfnDBInstance {
    val propsBuilder = CfnDBInstanceProps.builder()
    propsBuilder.init()
    
    return CfnDBInstance(this, id, propsBuilder.build())
}

