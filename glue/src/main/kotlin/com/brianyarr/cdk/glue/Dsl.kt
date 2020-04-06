package com.brianyarr.cdk.glue

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.glue.CfnDatabase
import software.amazon.awscdk.services.glue.CfnDatabaseProps
import software.amazon.awscdk.services.glue.Database
import software.amazon.awscdk.services.glue.DatabaseProps
import software.amazon.awscdk.services.glue.CfnMLTransform
import software.amazon.awscdk.services.glue.CfnMLTransformProps
import software.amazon.awscdk.services.glue.CfnCrawler
import software.amazon.awscdk.services.glue.CfnCrawlerProps
import software.amazon.awscdk.services.glue.Table
import software.amazon.awscdk.services.glue.TableProps
import software.amazon.awscdk.services.glue.CfnClassifier
import software.amazon.awscdk.services.glue.CfnClassifierProps
import software.amazon.awscdk.services.glue.CfnPartition
import software.amazon.awscdk.services.glue.CfnPartitionProps
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps
import software.amazon.awscdk.services.glue.CfnTrigger
import software.amazon.awscdk.services.glue.CfnTriggerProps
import software.amazon.awscdk.services.glue.CfnTable
import software.amazon.awscdk.services.glue.CfnTableProps
import software.amazon.awscdk.services.glue.CfnJob
import software.amazon.awscdk.services.glue.CfnJobProps
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration
import software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps
import software.amazon.awscdk.services.glue.CfnDevEndpoint
import software.amazon.awscdk.services.glue.CfnDevEndpointProps
import software.amazon.awscdk.services.glue.CfnConnection
import software.amazon.awscdk.services.glue.CfnConnectionProps
import software.amazon.awscdk.services.glue.CfnWorkflow
import software.amazon.awscdk.services.glue.CfnWorkflowProps

fun Construct.cfnDatabase(id: String, init: CfnDatabaseProps.Builder.() -> Unit): CfnDatabase {
    val propsBuilder = CfnDatabaseProps.builder()
    propsBuilder.init()
    
    return CfnDatabase(this, id, propsBuilder.build())
}

fun Construct.database(id: String, init: DatabaseProps.Builder.() -> Unit): Database {
    val propsBuilder = DatabaseProps.builder()
    propsBuilder.init()
    
    return Database(this, id, propsBuilder.build())
}

fun Construct.cfnMLTransform(id: String, init: CfnMLTransformProps.Builder.() -> Unit): CfnMLTransform {
    val propsBuilder = CfnMLTransformProps.builder()
    propsBuilder.init()
    
    return CfnMLTransform(this, id, propsBuilder.build())
}

fun Construct.cfnCrawler(id: String, init: CfnCrawlerProps.Builder.() -> Unit): CfnCrawler {
    val propsBuilder = CfnCrawlerProps.builder()
    propsBuilder.init()
    
    return CfnCrawler(this, id, propsBuilder.build())
}

fun Construct.table(id: String, init: TableProps.Builder.() -> Unit): Table {
    val propsBuilder = TableProps.builder()
    propsBuilder.init()
    
    return Table(this, id, propsBuilder.build())
}

fun Construct.cfnClassifier(id: String, init: CfnClassifierProps.Builder.() -> Unit): CfnClassifier {
    val propsBuilder = CfnClassifierProps.builder()
    propsBuilder.init()
    
    return CfnClassifier(this, id, propsBuilder.build())
}

fun Construct.cfnPartition(id: String, init: CfnPartitionProps.Builder.() -> Unit): CfnPartition {
    val propsBuilder = CfnPartitionProps.builder()
    propsBuilder.init()
    
    return CfnPartition(this, id, propsBuilder.build())
}

fun Construct.cfnDataCatalogEncryptionSettings(id: String, init: CfnDataCatalogEncryptionSettingsProps.Builder.() -> Unit): CfnDataCatalogEncryptionSettings {
    val propsBuilder = CfnDataCatalogEncryptionSettingsProps.builder()
    propsBuilder.init()
    
    return CfnDataCatalogEncryptionSettings(this, id, propsBuilder.build())
}

fun Construct.cfnTrigger(id: String, init: CfnTriggerProps.Builder.() -> Unit): CfnTrigger {
    val propsBuilder = CfnTriggerProps.builder()
    propsBuilder.init()
    
    return CfnTrigger(this, id, propsBuilder.build())
}

fun Construct.cfnTable(id: String, init: CfnTableProps.Builder.() -> Unit): CfnTable {
    val propsBuilder = CfnTableProps.builder()
    propsBuilder.init()
    
    return CfnTable(this, id, propsBuilder.build())
}

fun Construct.cfnJob(id: String, init: CfnJobProps.Builder.() -> Unit): CfnJob {
    val propsBuilder = CfnJobProps.builder()
    propsBuilder.init()
    
    return CfnJob(this, id, propsBuilder.build())
}

fun Construct.cfnSecurityConfiguration(id: String, init: CfnSecurityConfigurationProps.Builder.() -> Unit): CfnSecurityConfiguration {
    val propsBuilder = CfnSecurityConfigurationProps.builder()
    propsBuilder.init()
    
    return CfnSecurityConfiguration(this, id, propsBuilder.build())
}

fun Construct.cfnDevEndpoint(id: String, init: CfnDevEndpointProps.Builder.() -> Unit): CfnDevEndpoint {
    val propsBuilder = CfnDevEndpointProps.builder()
    propsBuilder.init()
    
    return CfnDevEndpoint(this, id, propsBuilder.build())
}

fun Construct.cfnConnection(id: String, init: CfnConnectionProps.Builder.() -> Unit): CfnConnection {
    val propsBuilder = CfnConnectionProps.builder()
    propsBuilder.init()
    
    return CfnConnection(this, id, propsBuilder.build())
}

fun Construct.cfnWorkflow(id: String, init: CfnWorkflowProps.Builder.() -> Unit): CfnWorkflow {
    val propsBuilder = CfnWorkflowProps.builder()
    propsBuilder.init()
    
    return CfnWorkflow(this, id, propsBuilder.build())
}

