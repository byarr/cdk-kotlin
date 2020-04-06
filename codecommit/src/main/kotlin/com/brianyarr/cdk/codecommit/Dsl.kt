package com.brianyarr.cdk.codecommit

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.codecommit.CfnRepository
import software.amazon.awscdk.services.codecommit.CfnRepositoryProps
import software.amazon.awscdk.services.codecommit.Repository
import software.amazon.awscdk.services.codecommit.RepositoryProps

fun Construct.cfnRepository(id: String, init: CfnRepositoryProps.Builder.() -> Unit): CfnRepository {
    val propsBuilder = CfnRepositoryProps.builder()
    propsBuilder.init()
    
    return CfnRepository(this, id, propsBuilder.build())
}

fun Construct.repository(id: String, init: RepositoryProps.Builder.() -> Unit): Repository {
    val propsBuilder = RepositoryProps.builder()
    propsBuilder.init()
    
    return Repository(this, id, propsBuilder.build())
}

