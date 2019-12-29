package com.brianyarr.cdk.ecr

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.ecr.Repository
import software.amazon.awscdk.services.ecr.RepositoryProps

fun Construct.repository(id: String, init: RepositoryProps.Builder.() -> Unit): Repository {
    val propsBuilder = RepositoryProps.builder()
    propsBuilder.init()
    
    return Repository(this, id, propsBuilder.build())
}


