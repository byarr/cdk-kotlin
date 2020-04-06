package com.brianyarr.cdk.ssm

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.ssm.CfnParameter
import software.amazon.awscdk.services.ssm.CfnParameterProps
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps
import software.amazon.awscdk.services.ssm.StringListParameter
import software.amazon.awscdk.services.ssm.StringListParameterProps
import software.amazon.awscdk.services.ssm.CfnAssociation
import software.amazon.awscdk.services.ssm.CfnAssociationProps
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindow
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowProps
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps
import software.amazon.awscdk.services.ssm.StringParameter
import software.amazon.awscdk.services.ssm.StringParameterProps
import software.amazon.awscdk.services.ssm.CfnDocument
import software.amazon.awscdk.services.ssm.CfnDocumentProps
import software.amazon.awscdk.services.ssm.CfnResourceDataSync
import software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps
import software.amazon.awscdk.services.ssm.CfnPatchBaseline
import software.amazon.awscdk.services.ssm.CfnPatchBaselineProps

fun Construct.cfnParameter(id: String, init: CfnParameterProps.Builder.() -> Unit): CfnParameter {
    val propsBuilder = CfnParameterProps.builder()
    propsBuilder.init()
    
    return CfnParameter(this, id, propsBuilder.build())
}

fun Construct.cfnMaintenanceWindowTarget(id: String, init: CfnMaintenanceWindowTargetProps.Builder.() -> Unit): CfnMaintenanceWindowTarget {
    val propsBuilder = CfnMaintenanceWindowTargetProps.builder()
    propsBuilder.init()
    
    return CfnMaintenanceWindowTarget(this, id, propsBuilder.build())
}

fun Construct.stringListParameter(id: String, init: StringListParameterProps.Builder.() -> Unit): StringListParameter {
    val propsBuilder = StringListParameterProps.builder()
    propsBuilder.init()
    
    return StringListParameter(this, id, propsBuilder.build())
}

fun Construct.cfnAssociation(id: String, init: CfnAssociationProps.Builder.() -> Unit): CfnAssociation {
    val propsBuilder = CfnAssociationProps.builder()
    propsBuilder.init()
    
    return CfnAssociation(this, id, propsBuilder.build())
}

fun Construct.cfnMaintenanceWindow(id: String, init: CfnMaintenanceWindowProps.Builder.() -> Unit): CfnMaintenanceWindow {
    val propsBuilder = CfnMaintenanceWindowProps.builder()
    propsBuilder.init()
    
    return CfnMaintenanceWindow(this, id, propsBuilder.build())
}

fun Construct.cfnMaintenanceWindowTask(id: String, init: CfnMaintenanceWindowTaskProps.Builder.() -> Unit): CfnMaintenanceWindowTask {
    val propsBuilder = CfnMaintenanceWindowTaskProps.builder()
    propsBuilder.init()
    
    return CfnMaintenanceWindowTask(this, id, propsBuilder.build())
}

fun Construct.stringParameter(id: String, init: StringParameterProps.Builder.() -> Unit): StringParameter {
    val propsBuilder = StringParameterProps.builder()
    propsBuilder.init()
    
    return StringParameter(this, id, propsBuilder.build())
}

fun Construct.cfnDocument(id: String, init: CfnDocumentProps.Builder.() -> Unit): CfnDocument {
    val propsBuilder = CfnDocumentProps.builder()
    propsBuilder.init()
    
    return CfnDocument(this, id, propsBuilder.build())
}

fun Construct.cfnResourceDataSync(id: String, init: CfnResourceDataSyncProps.Builder.() -> Unit): CfnResourceDataSync {
    val propsBuilder = CfnResourceDataSyncProps.builder()
    propsBuilder.init()
    
    return CfnResourceDataSync(this, id, propsBuilder.build())
}

fun Construct.cfnPatchBaseline(id: String, init: CfnPatchBaselineProps.Builder.() -> Unit): CfnPatchBaseline {
    val propsBuilder = CfnPatchBaselineProps.builder()
    propsBuilder.init()
    
    return CfnPatchBaseline(this, id, propsBuilder.build())
}

