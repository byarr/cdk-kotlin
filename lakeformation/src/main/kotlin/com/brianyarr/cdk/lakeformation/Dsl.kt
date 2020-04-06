package com.brianyarr.cdk.lakeformation

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.lakeformation.CfnPermissions
import software.amazon.awscdk.services.lakeformation.CfnPermissionsProps
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps
import software.amazon.awscdk.services.lakeformation.CfnResource
import software.amazon.awscdk.services.lakeformation.CfnResourceProps

fun Construct.cfnPermissions(id: String, init: CfnPermissionsProps.Builder.() -> Unit): CfnPermissions {
    val propsBuilder = CfnPermissionsProps.builder()
    propsBuilder.init()
    
    return CfnPermissions(this, id, propsBuilder.build())
}

fun Construct.cfnDataLakeSettings(id: String, init: CfnDataLakeSettingsProps.Builder.() -> Unit): CfnDataLakeSettings {
    val propsBuilder = CfnDataLakeSettingsProps.builder()
    propsBuilder.init()
    
    return CfnDataLakeSettings(this, id, propsBuilder.build())
}

fun Construct.cfnResource(id: String, init: CfnResourceProps.Builder.() -> Unit): CfnResource {
    val propsBuilder = CfnResourceProps.builder()
    propsBuilder.init()
    
    return CfnResource(this, id, propsBuilder.build())
}

