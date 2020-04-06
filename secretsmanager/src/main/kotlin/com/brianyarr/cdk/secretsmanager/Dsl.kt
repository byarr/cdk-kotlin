package com.brianyarr.cdk.secretsmanager

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.secretsmanager.CfnSecret
import software.amazon.awscdk.services.secretsmanager.CfnSecretProps
import software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment
import software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps
import software.amazon.awscdk.services.secretsmanager.RotationSchedule
import software.amazon.awscdk.services.secretsmanager.RotationScheduleProps
import software.amazon.awscdk.services.secretsmanager.Secret
import software.amazon.awscdk.services.secretsmanager.SecretProps
import software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule
import software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps
import software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment
import software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps
import software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy
import software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps

fun Construct.cfnSecret(id: String, init: CfnSecretProps.Builder.() -> Unit): CfnSecret {
    val propsBuilder = CfnSecretProps.builder()
    propsBuilder.init()
    
    return CfnSecret(this, id, propsBuilder.build())
}

fun Construct.secretTargetAttachment(id: String, init: SecretTargetAttachmentProps.Builder.() -> Unit): SecretTargetAttachment {
    val propsBuilder = SecretTargetAttachmentProps.builder()
    propsBuilder.init()
    
    return SecretTargetAttachment(this, id, propsBuilder.build())
}

fun Construct.rotationSchedule(id: String, init: RotationScheduleProps.Builder.() -> Unit): RotationSchedule {
    val propsBuilder = RotationScheduleProps.builder()
    propsBuilder.init()
    
    return RotationSchedule(this, id, propsBuilder.build())
}

fun Construct.secret(id: String, init: SecretProps.Builder.() -> Unit): Secret {
    val propsBuilder = SecretProps.builder()
    propsBuilder.init()
    
    return Secret(this, id, propsBuilder.build())
}

fun Construct.cfnRotationSchedule(id: String, init: CfnRotationScheduleProps.Builder.() -> Unit): CfnRotationSchedule {
    val propsBuilder = CfnRotationScheduleProps.builder()
    propsBuilder.init()
    
    return CfnRotationSchedule(this, id, propsBuilder.build())
}

fun Construct.cfnSecretTargetAttachment(id: String, init: CfnSecretTargetAttachmentProps.Builder.() -> Unit): CfnSecretTargetAttachment {
    val propsBuilder = CfnSecretTargetAttachmentProps.builder()
    propsBuilder.init()
    
    return CfnSecretTargetAttachment(this, id, propsBuilder.build())
}

fun Construct.cfnResourcePolicy(id: String, init: CfnResourcePolicyProps.Builder.() -> Unit): CfnResourcePolicy {
    val propsBuilder = CfnResourcePolicyProps.builder()
    propsBuilder.init()
    
    return CfnResourcePolicy(this, id, propsBuilder.build())
}

