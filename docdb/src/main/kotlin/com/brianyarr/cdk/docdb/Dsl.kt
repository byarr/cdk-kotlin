package com.brianyarr.cdk.docdb

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup
import software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps
import software.amazon.awscdk.services.docdb.CfnDBInstance
import software.amazon.awscdk.services.docdb.CfnDBInstanceProps
import software.amazon.awscdk.services.docdb.CfnDBCluster
import software.amazon.awscdk.services.docdb.CfnDBClusterProps
import software.amazon.awscdk.services.docdb.CfnDBSubnetGroup
import software.amazon.awscdk.services.docdb.CfnDBSubnetGroupProps

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

fun Construct.cfnDBCluster(id: String, init: CfnDBClusterProps.Builder.() -> Unit): CfnDBCluster {
    val propsBuilder = CfnDBClusterProps.builder()
    propsBuilder.init()
    
    return CfnDBCluster(this, id, propsBuilder.build())
}

fun Construct.cfnDBSubnetGroup(id: String, init: CfnDBSubnetGroupProps.Builder.() -> Unit): CfnDBSubnetGroup {
    val propsBuilder = CfnDBSubnetGroupProps.builder()
    propsBuilder.init()
    
    return CfnDBSubnetGroup(this, id, propsBuilder.build())
}

