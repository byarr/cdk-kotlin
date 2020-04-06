package com.brianyarr.cdk.kinesisanalytics

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props
import software.amazon.awscdk.services.kinesisanalytics.CfnApplication
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps

fun Construct.cfnApplicationV2(id: String, init: CfnApplicationV2Props.Builder.() -> Unit): CfnApplicationV2 {
    val propsBuilder = CfnApplicationV2Props.builder()
    propsBuilder.init()
    
    return CfnApplicationV2(this, id, propsBuilder.build())
}

fun Construct.cfnApplicationReferenceDataSource(id: String, init: CfnApplicationReferenceDataSourceProps.Builder.() -> Unit): CfnApplicationReferenceDataSource {
    val propsBuilder = CfnApplicationReferenceDataSourceProps.builder()
    propsBuilder.init()
    
    return CfnApplicationReferenceDataSource(this, id, propsBuilder.build())
}

fun Construct.cfnApplicationReferenceDataSourceV2(id: String, init: CfnApplicationReferenceDataSourceV2Props.Builder.() -> Unit): CfnApplicationReferenceDataSourceV2 {
    val propsBuilder = CfnApplicationReferenceDataSourceV2Props.builder()
    propsBuilder.init()
    
    return CfnApplicationReferenceDataSourceV2(this, id, propsBuilder.build())
}

fun Construct.cfnApplicationCloudWatchLoggingOptionV2(id: String, init: CfnApplicationCloudWatchLoggingOptionV2Props.Builder.() -> Unit): CfnApplicationCloudWatchLoggingOptionV2 {
    val propsBuilder = CfnApplicationCloudWatchLoggingOptionV2Props.builder()
    propsBuilder.init()
    
    return CfnApplicationCloudWatchLoggingOptionV2(this, id, propsBuilder.build())
}

fun Construct.cfnApplication(id: String, init: CfnApplicationProps.Builder.() -> Unit): CfnApplication {
    val propsBuilder = CfnApplicationProps.builder()
    propsBuilder.init()
    
    return CfnApplication(this, id, propsBuilder.build())
}

fun Construct.cfnApplicationOutputV2(id: String, init: CfnApplicationOutputV2Props.Builder.() -> Unit): CfnApplicationOutputV2 {
    val propsBuilder = CfnApplicationOutputV2Props.builder()
    propsBuilder.init()
    
    return CfnApplicationOutputV2(this, id, propsBuilder.build())
}

fun Construct.cfnApplicationOutput(id: String, init: CfnApplicationOutputProps.Builder.() -> Unit): CfnApplicationOutput {
    val propsBuilder = CfnApplicationOutputProps.builder()
    propsBuilder.init()
    
    return CfnApplicationOutput(this, id, propsBuilder.build())
}

