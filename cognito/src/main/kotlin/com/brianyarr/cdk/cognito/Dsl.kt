package com.brianyarr.cdk.cognito

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment
import software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps
import software.amazon.awscdk.services.cognito.UserPoolClient
import software.amazon.awscdk.services.cognito.UserPoolClientProps
import software.amazon.awscdk.services.cognito.CfnUserPoolClient
import software.amazon.awscdk.services.cognito.CfnUserPoolClientProps
import software.amazon.awscdk.services.cognito.CfnIdentityPool
import software.amazon.awscdk.services.cognito.CfnIdentityPoolProps
import software.amazon.awscdk.services.cognito.UserPool
import software.amazon.awscdk.services.cognito.UserPoolProps
import software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider
import software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps
import software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment
import software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps
import software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer
import software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps
import software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment
import software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps
import software.amazon.awscdk.services.cognito.CfnUserPoolDomain
import software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps
import software.amazon.awscdk.services.cognito.CfnUserPoolGroup
import software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps
import software.amazon.awscdk.services.cognito.CfnUserPoolUser
import software.amazon.awscdk.services.cognito.CfnUserPoolUserProps
import software.amazon.awscdk.services.cognito.CfnUserPool
import software.amazon.awscdk.services.cognito.CfnUserPoolProps

fun Construct.cfnUserPoolUICustomizationAttachment(id: String, init: CfnUserPoolUICustomizationAttachmentProps.Builder.() -> Unit): CfnUserPoolUICustomizationAttachment {
    val propsBuilder = CfnUserPoolUICustomizationAttachmentProps.builder()
    propsBuilder.init()
    
    return CfnUserPoolUICustomizationAttachment(this, id, propsBuilder.build())
}

fun Construct.userPoolClient(id: String, init: UserPoolClientProps.Builder.() -> Unit): UserPoolClient {
    val propsBuilder = UserPoolClientProps.builder()
    propsBuilder.init()
    
    return UserPoolClient(this, id, propsBuilder.build())
}

fun Construct.cfnUserPoolClient(id: String, init: CfnUserPoolClientProps.Builder.() -> Unit): CfnUserPoolClient {
    val propsBuilder = CfnUserPoolClientProps.builder()
    propsBuilder.init()
    
    return CfnUserPoolClient(this, id, propsBuilder.build())
}

fun Construct.cfnIdentityPool(id: String, init: CfnIdentityPoolProps.Builder.() -> Unit): CfnIdentityPool {
    val propsBuilder = CfnIdentityPoolProps.builder()
    propsBuilder.init()
    
    return CfnIdentityPool(this, id, propsBuilder.build())
}

fun Construct.userPool(id: String, init: UserPoolProps.Builder.() -> Unit): UserPool {
    val propsBuilder = UserPoolProps.builder()
    propsBuilder.init()
    
    return UserPool(this, id, propsBuilder.build())
}

fun Construct.cfnUserPoolIdentityProvider(id: String, init: CfnUserPoolIdentityProviderProps.Builder.() -> Unit): CfnUserPoolIdentityProvider {
    val propsBuilder = CfnUserPoolIdentityProviderProps.builder()
    propsBuilder.init()
    
    return CfnUserPoolIdentityProvider(this, id, propsBuilder.build())
}

fun Construct.cfnIdentityPoolRoleAttachment(id: String, init: CfnIdentityPoolRoleAttachmentProps.Builder.() -> Unit): CfnIdentityPoolRoleAttachment {
    val propsBuilder = CfnIdentityPoolRoleAttachmentProps.builder()
    propsBuilder.init()
    
    return CfnIdentityPoolRoleAttachment(this, id, propsBuilder.build())
}

fun Construct.cfnUserPoolResourceServer(id: String, init: CfnUserPoolResourceServerProps.Builder.() -> Unit): CfnUserPoolResourceServer {
    val propsBuilder = CfnUserPoolResourceServerProps.builder()
    propsBuilder.init()
    
    return CfnUserPoolResourceServer(this, id, propsBuilder.build())
}

fun Construct.cfnUserPoolUserToGroupAttachment(id: String, init: CfnUserPoolUserToGroupAttachmentProps.Builder.() -> Unit): CfnUserPoolUserToGroupAttachment {
    val propsBuilder = CfnUserPoolUserToGroupAttachmentProps.builder()
    propsBuilder.init()
    
    return CfnUserPoolUserToGroupAttachment(this, id, propsBuilder.build())
}

fun Construct.cfnUserPoolRiskConfigurationAttachment(id: String, init: CfnUserPoolRiskConfigurationAttachmentProps.Builder.() -> Unit): CfnUserPoolRiskConfigurationAttachment {
    val propsBuilder = CfnUserPoolRiskConfigurationAttachmentProps.builder()
    propsBuilder.init()
    
    return CfnUserPoolRiskConfigurationAttachment(this, id, propsBuilder.build())
}

fun Construct.cfnUserPoolDomain(id: String, init: CfnUserPoolDomainProps.Builder.() -> Unit): CfnUserPoolDomain {
    val propsBuilder = CfnUserPoolDomainProps.builder()
    propsBuilder.init()
    
    return CfnUserPoolDomain(this, id, propsBuilder.build())
}

fun Construct.cfnUserPoolGroup(id: String, init: CfnUserPoolGroupProps.Builder.() -> Unit): CfnUserPoolGroup {
    val propsBuilder = CfnUserPoolGroupProps.builder()
    propsBuilder.init()
    
    return CfnUserPoolGroup(this, id, propsBuilder.build())
}

fun Construct.cfnUserPoolUser(id: String, init: CfnUserPoolUserProps.Builder.() -> Unit): CfnUserPoolUser {
    val propsBuilder = CfnUserPoolUserProps.builder()
    propsBuilder.init()
    
    return CfnUserPoolUser(this, id, propsBuilder.build())
}

fun Construct.cfnUserPool(id: String, init: CfnUserPoolProps.Builder.() -> Unit): CfnUserPool {
    val propsBuilder = CfnUserPoolProps.builder()
    propsBuilder.init()
    
    return CfnUserPool(this, id, propsBuilder.build())
}

