package com.brianyarr.cdk.codestar

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.codestar.CfnGitHubRepository
import software.amazon.awscdk.services.codestar.CfnGitHubRepositoryProps

fun Construct.cfnGitHubRepository(id: String, init: CfnGitHubRepositoryProps.Builder.() -> Unit): CfnGitHubRepository {
    val propsBuilder = CfnGitHubRepositoryProps.builder()
    propsBuilder.init()
    
    return CfnGitHubRepository(this, id, propsBuilder.build())
}

