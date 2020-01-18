package com.brianyarr.cdk.codepipeline.actions

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider
import software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps

fun Construct.jenkinsProvider(id: String, init: JenkinsProviderProps.Builder.() -> Unit): JenkinsProvider {
    val propsBuilder = JenkinsProviderProps.builder()
    propsBuilder.init()
    
    return JenkinsProvider(this, id, propsBuilder.build())
}

