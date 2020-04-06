package com.brianyarr.cdk.rds

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.rds.DatabaseInstance
import software.amazon.awscdk.services.rds.DatabaseInstanceProps
import software.amazon.awscdk.services.rds.CfnDBParameterGroup
import software.amazon.awscdk.services.rds.CfnDBParameterGroupProps
import software.amazon.awscdk.services.rds.SecretRotation
import software.amazon.awscdk.services.rds.SecretRotationProps
import software.amazon.awscdk.services.rds.CfnEventSubscription
import software.amazon.awscdk.services.rds.CfnEventSubscriptionProps
import software.amazon.awscdk.services.rds.CfnDBClusterParameterGroup
import software.amazon.awscdk.services.rds.CfnDBClusterParameterGroupProps
import software.amazon.awscdk.services.rds.DatabaseSecret
import software.amazon.awscdk.services.rds.DatabaseSecretProps
import software.amazon.awscdk.services.rds.CfnOptionGroup
import software.amazon.awscdk.services.rds.CfnOptionGroupProps
import software.amazon.awscdk.services.rds.DatabaseInstanceReadReplica
import software.amazon.awscdk.services.rds.DatabaseInstanceReadReplicaProps
import software.amazon.awscdk.services.rds.DatabaseCluster
import software.amazon.awscdk.services.rds.DatabaseClusterProps
import software.amazon.awscdk.services.rds.ParameterGroup
import software.amazon.awscdk.services.rds.ParameterGroupProps
import software.amazon.awscdk.services.rds.CfnDBInstance
import software.amazon.awscdk.services.rds.CfnDBInstanceProps
import software.amazon.awscdk.services.rds.CfnDBSecurityGroup
import software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps
import software.amazon.awscdk.services.rds.CfnDBCluster
import software.amazon.awscdk.services.rds.CfnDBClusterProps
import software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress
import software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps
import software.amazon.awscdk.services.rds.OptionGroup
import software.amazon.awscdk.services.rds.OptionGroupProps
import software.amazon.awscdk.services.rds.CfnDBSubnetGroup
import software.amazon.awscdk.services.rds.CfnDBSubnetGroupProps
import software.amazon.awscdk.services.rds.DatabaseInstanceFromSnapshot
import software.amazon.awscdk.services.rds.DatabaseInstanceFromSnapshotProps
import software.amazon.awscdk.services.rds.ClusterParameterGroup
import software.amazon.awscdk.services.rds.ClusterParameterGroupProps

fun Construct.databaseInstance(id: String, init: DatabaseInstanceProps.Builder.() -> Unit): DatabaseInstance {
    val propsBuilder = DatabaseInstanceProps.builder()
    propsBuilder.init()
    
    return DatabaseInstance(this, id, propsBuilder.build())
}

fun Construct.cfnDBParameterGroup(id: String, init: CfnDBParameterGroupProps.Builder.() -> Unit): CfnDBParameterGroup {
    val propsBuilder = CfnDBParameterGroupProps.builder()
    propsBuilder.init()
    
    return CfnDBParameterGroup(this, id, propsBuilder.build())
}

fun Construct.secretRotation(id: String, init: SecretRotationProps.Builder.() -> Unit): SecretRotation {
    val propsBuilder = SecretRotationProps.builder()
    propsBuilder.init()
    
    return SecretRotation(this, id, propsBuilder.build())
}

fun Construct.cfnEventSubscription(id: String, init: CfnEventSubscriptionProps.Builder.() -> Unit): CfnEventSubscription {
    val propsBuilder = CfnEventSubscriptionProps.builder()
    propsBuilder.init()
    
    return CfnEventSubscription(this, id, propsBuilder.build())
}

fun Construct.cfnDBClusterParameterGroup(id: String, init: CfnDBClusterParameterGroupProps.Builder.() -> Unit): CfnDBClusterParameterGroup {
    val propsBuilder = CfnDBClusterParameterGroupProps.builder()
    propsBuilder.init()
    
    return CfnDBClusterParameterGroup(this, id, propsBuilder.build())
}

fun Construct.databaseSecret(id: String, init: DatabaseSecretProps.Builder.() -> Unit): DatabaseSecret {
    val propsBuilder = DatabaseSecretProps.builder()
    propsBuilder.init()
    
    return DatabaseSecret(this, id, propsBuilder.build())
}

fun Construct.cfnOptionGroup(id: String, init: CfnOptionGroupProps.Builder.() -> Unit): CfnOptionGroup {
    val propsBuilder = CfnOptionGroupProps.builder()
    propsBuilder.init()
    
    return CfnOptionGroup(this, id, propsBuilder.build())
}

fun Construct.databaseInstanceReadReplica(id: String, init: DatabaseInstanceReadReplicaProps.Builder.() -> Unit): DatabaseInstanceReadReplica {
    val propsBuilder = DatabaseInstanceReadReplicaProps.builder()
    propsBuilder.init()
    
    return DatabaseInstanceReadReplica(this, id, propsBuilder.build())
}

fun Construct.databaseCluster(id: String, init: DatabaseClusterProps.Builder.() -> Unit): DatabaseCluster {
    val propsBuilder = DatabaseClusterProps.builder()
    propsBuilder.init()
    
    return DatabaseCluster(this, id, propsBuilder.build())
}

fun Construct.parameterGroup(id: String, init: ParameterGroupProps.Builder.() -> Unit): ParameterGroup {
    val propsBuilder = ParameterGroupProps.builder()
    propsBuilder.init()
    
    return ParameterGroup(this, id, propsBuilder.build())
}

fun Construct.cfnDBInstance(id: String, init: CfnDBInstanceProps.Builder.() -> Unit): CfnDBInstance {
    val propsBuilder = CfnDBInstanceProps.builder()
    propsBuilder.init()
    
    return CfnDBInstance(this, id, propsBuilder.build())
}

fun Construct.cfnDBSecurityGroup(id: String, init: CfnDBSecurityGroupProps.Builder.() -> Unit): CfnDBSecurityGroup {
    val propsBuilder = CfnDBSecurityGroupProps.builder()
    propsBuilder.init()
    
    return CfnDBSecurityGroup(this, id, propsBuilder.build())
}

fun Construct.cfnDBCluster(id: String, init: CfnDBClusterProps.Builder.() -> Unit): CfnDBCluster {
    val propsBuilder = CfnDBClusterProps.builder()
    propsBuilder.init()
    
    return CfnDBCluster(this, id, propsBuilder.build())
}

fun Construct.cfnDBSecurityGroupIngress(id: String, init: CfnDBSecurityGroupIngressProps.Builder.() -> Unit): CfnDBSecurityGroupIngress {
    val propsBuilder = CfnDBSecurityGroupIngressProps.builder()
    propsBuilder.init()
    
    return CfnDBSecurityGroupIngress(this, id, propsBuilder.build())
}

fun Construct.optionGroup(id: String, init: OptionGroupProps.Builder.() -> Unit): OptionGroup {
    val propsBuilder = OptionGroupProps.builder()
    propsBuilder.init()
    
    return OptionGroup(this, id, propsBuilder.build())
}

fun Construct.cfnDBSubnetGroup(id: String, init: CfnDBSubnetGroupProps.Builder.() -> Unit): CfnDBSubnetGroup {
    val propsBuilder = CfnDBSubnetGroupProps.builder()
    propsBuilder.init()
    
    return CfnDBSubnetGroup(this, id, propsBuilder.build())
}

fun Construct.databaseInstanceFromSnapshot(id: String, init: DatabaseInstanceFromSnapshotProps.Builder.() -> Unit): DatabaseInstanceFromSnapshot {
    val propsBuilder = DatabaseInstanceFromSnapshotProps.builder()
    propsBuilder.init()
    
    return DatabaseInstanceFromSnapshot(this, id, propsBuilder.build())
}

fun Construct.clusterParameterGroup(id: String, init: ClusterParameterGroupProps.Builder.() -> Unit): ClusterParameterGroup {
    val propsBuilder = ClusterParameterGroupProps.builder()
    propsBuilder.init()
    
    return ClusterParameterGroup(this, id, propsBuilder.build())
}

