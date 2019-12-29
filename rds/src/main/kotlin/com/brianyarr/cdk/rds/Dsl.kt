package com.brianyarr.cdk.rds

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.rds.DatabaseInstance
import software.amazon.awscdk.services.rds.DatabaseInstanceProps
import software.amazon.awscdk.services.rds.OptionGroup
import software.amazon.awscdk.services.rds.OptionGroupProps
import software.amazon.awscdk.services.rds.ParameterGroup
import software.amazon.awscdk.services.rds.ParameterGroupProps
import software.amazon.awscdk.services.rds.DatabaseInstanceFromSnapshot
import software.amazon.awscdk.services.rds.DatabaseInstanceFromSnapshotProps
import software.amazon.awscdk.services.rds.DatabaseInstanceReadReplica
import software.amazon.awscdk.services.rds.DatabaseInstanceReadReplicaProps
import software.amazon.awscdk.services.rds.DatabaseSecret
import software.amazon.awscdk.services.rds.DatabaseSecretProps
import software.amazon.awscdk.services.rds.ClusterParameterGroup
import software.amazon.awscdk.services.rds.ClusterParameterGroupProps
import software.amazon.awscdk.services.rds.DatabaseCluster
import software.amazon.awscdk.services.rds.DatabaseClusterProps

fun Construct.databaseInstance(id: String, init: DatabaseInstanceProps.Builder.() -> Unit): DatabaseInstance {
    val propsBuilder = DatabaseInstanceProps.builder()
    propsBuilder.init()
    
    return DatabaseInstance(this, id, propsBuilder.build())
}


fun Construct.optionGroup(id: String, init: OptionGroupProps.Builder.() -> Unit): OptionGroup {
    val propsBuilder = OptionGroupProps.builder()
    propsBuilder.init()
    
    return OptionGroup(this, id, propsBuilder.build())
}


fun Construct.parameterGroup(id: String, init: ParameterGroupProps.Builder.() -> Unit): ParameterGroup {
    val propsBuilder = ParameterGroupProps.builder()
    propsBuilder.init()
    
    return ParameterGroup(this, id, propsBuilder.build())
}


fun Construct.databaseInstanceFromSnapshot(id: String, init: DatabaseInstanceFromSnapshotProps.Builder.() -> Unit): DatabaseInstanceFromSnapshot {
    val propsBuilder = DatabaseInstanceFromSnapshotProps.builder()
    propsBuilder.init()
    
    return DatabaseInstanceFromSnapshot(this, id, propsBuilder.build())
}


fun Construct.databaseInstanceReadReplica(id: String, init: DatabaseInstanceReadReplicaProps.Builder.() -> Unit): DatabaseInstanceReadReplica {
    val propsBuilder = DatabaseInstanceReadReplicaProps.builder()
    propsBuilder.init()
    
    return DatabaseInstanceReadReplica(this, id, propsBuilder.build())
}


fun Construct.databaseSecret(id: String, init: DatabaseSecretProps.Builder.() -> Unit): DatabaseSecret {
    val propsBuilder = DatabaseSecretProps.builder()
    propsBuilder.init()
    
    return DatabaseSecret(this, id, propsBuilder.build())
}


fun Construct.clusterParameterGroup(id: String, init: ClusterParameterGroupProps.Builder.() -> Unit): ClusterParameterGroup {
    val propsBuilder = ClusterParameterGroupProps.builder()
    propsBuilder.init()
    
    return ClusterParameterGroup(this, id, propsBuilder.build())
}


fun Construct.databaseCluster(id: String, init: DatabaseClusterProps.Builder.() -> Unit): DatabaseCluster {
    val propsBuilder = DatabaseClusterProps.builder()
    propsBuilder.init()
    
    return DatabaseCluster(this, id, propsBuilder.build())
}


