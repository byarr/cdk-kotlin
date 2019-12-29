package com.brianyarr.cdk.secretsmanager

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.secretsmanager.Secret
import software.amazon.awscdk.services.secretsmanager.SecretProps
import software.amazon.awscdk.services.secretsmanager.RotationSchedule
import software.amazon.awscdk.services.secretsmanager.RotationScheduleProps
import software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment
import software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps

fun Construct.secret(id: String, init: SecretProps.Builder.() -> Unit): Secret {
    val propsBuilder = SecretProps.builder()
    propsBuilder.init()
    
    return Secret(this, id, propsBuilder.build())
}


fun Construct.rotationSchedule(id: String, init: RotationScheduleProps.Builder.() -> Unit): RotationSchedule {
    val propsBuilder = RotationScheduleProps.builder()
    propsBuilder.init()
    
    return RotationSchedule(this, id, propsBuilder.build())
}


fun Construct.secretTargetAttachment(id: String, init: SecretTargetAttachmentProps.Builder.() -> Unit): SecretTargetAttachment {
    val propsBuilder = SecretTargetAttachmentProps.builder()
    propsBuilder.init()
    
    return SecretTargetAttachment(this, id, propsBuilder.build())
}


