package com.brianyarr.cdk.elasticache

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress
import software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps
import software.amazon.awscdk.services.elasticache.CfnSecurityGroup
import software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps
import software.amazon.awscdk.services.elasticache.CfnCacheCluster
import software.amazon.awscdk.services.elasticache.CfnCacheClusterProps
import software.amazon.awscdk.services.elasticache.CfnSubnetGroup
import software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup
import software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps
import software.amazon.awscdk.services.elasticache.CfnParameterGroup
import software.amazon.awscdk.services.elasticache.CfnParameterGroupProps

fun Construct.cfnSecurityGroupIngress(id: String, init: CfnSecurityGroupIngressProps.Builder.() -> Unit): CfnSecurityGroupIngress {
    val propsBuilder = CfnSecurityGroupIngressProps.builder()
    propsBuilder.init()
    
    return CfnSecurityGroupIngress(this, id, propsBuilder.build())
}

fun Construct.cfnSecurityGroup(id: String, init: CfnSecurityGroupProps.Builder.() -> Unit): CfnSecurityGroup {
    val propsBuilder = CfnSecurityGroupProps.builder()
    propsBuilder.init()
    
    return CfnSecurityGroup(this, id, propsBuilder.build())
}

fun Construct.cfnCacheCluster(id: String, init: CfnCacheClusterProps.Builder.() -> Unit): CfnCacheCluster {
    val propsBuilder = CfnCacheClusterProps.builder()
    propsBuilder.init()
    
    return CfnCacheCluster(this, id, propsBuilder.build())
}

fun Construct.cfnSubnetGroup(id: String, init: CfnSubnetGroupProps.Builder.() -> Unit): CfnSubnetGroup {
    val propsBuilder = CfnSubnetGroupProps.builder()
    propsBuilder.init()
    
    return CfnSubnetGroup(this, id, propsBuilder.build())
}

fun Construct.cfnReplicationGroup(id: String, init: CfnReplicationGroupProps.Builder.() -> Unit): CfnReplicationGroup {
    val propsBuilder = CfnReplicationGroupProps.builder()
    propsBuilder.init()
    
    return CfnReplicationGroup(this, id, propsBuilder.build())
}

fun Construct.cfnParameterGroup(id: String, init: CfnParameterGroupProps.Builder.() -> Unit): CfnParameterGroup {
    val propsBuilder = CfnParameterGroupProps.builder()
    propsBuilder.init()
    
    return CfnParameterGroup(this, id, propsBuilder.build())
}

