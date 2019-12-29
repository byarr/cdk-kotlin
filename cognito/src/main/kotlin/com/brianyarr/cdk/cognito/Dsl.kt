package com.brianyarr.cdk.cognito

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.cognito.UserPool
import software.amazon.awscdk.services.cognito.UserPoolProps
import software.amazon.awscdk.services.cognito.UserPoolClient
import software.amazon.awscdk.services.cognito.UserPoolClientProps

fun Construct.userPool(id: String, init: UserPoolProps.Builder.() -> Unit): UserPool {
    val propsBuilder = UserPoolProps.builder()
    propsBuilder.init()
    
    return UserPool(this, id, propsBuilder.build())
}


fun Construct.userPoolClient(id: String, init: UserPoolClientProps.Builder.() -> Unit): UserPoolClient {
    val propsBuilder = UserPoolClientProps.builder()
    propsBuilder.init()
    
    return UserPoolClient(this, id, propsBuilder.build())
}


