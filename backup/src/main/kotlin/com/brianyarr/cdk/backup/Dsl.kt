package com.brianyarr.cdk.backup

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.backup.CfnBackupSelection
import software.amazon.awscdk.services.backup.CfnBackupSelectionProps
import software.amazon.awscdk.services.backup.CfnBackupVault
import software.amazon.awscdk.services.backup.CfnBackupVaultProps
import software.amazon.awscdk.services.backup.CfnBackupPlan
import software.amazon.awscdk.services.backup.CfnBackupPlanProps

fun Construct.cfnBackupSelection(id: String, init: CfnBackupSelectionProps.Builder.() -> Unit): CfnBackupSelection {
    val propsBuilder = CfnBackupSelectionProps.builder()
    propsBuilder.init()
    
    return CfnBackupSelection(this, id, propsBuilder.build())
}

fun Construct.cfnBackupVault(id: String, init: CfnBackupVaultProps.Builder.() -> Unit): CfnBackupVault {
    val propsBuilder = CfnBackupVaultProps.builder()
    propsBuilder.init()
    
    return CfnBackupVault(this, id, propsBuilder.build())
}

fun Construct.cfnBackupPlan(id: String, init: CfnBackupPlanProps.Builder.() -> Unit): CfnBackupPlan {
    val propsBuilder = CfnBackupPlanProps.builder()
    propsBuilder.init()
    
    return CfnBackupPlan(this, id, propsBuilder.build())
}

