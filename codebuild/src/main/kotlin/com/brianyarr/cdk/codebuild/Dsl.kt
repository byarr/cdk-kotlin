package com.brianyarr.cdk.codebuild

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.codebuild.CfnProject
import software.amazon.awscdk.services.codebuild.CfnProjectProps
import software.amazon.awscdk.services.codebuild.PipelineProject
import software.amazon.awscdk.services.codebuild.PipelineProjectProps
import software.amazon.awscdk.services.codebuild.CfnSourceCredential
import software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps
import software.amazon.awscdk.services.codebuild.Project
import software.amazon.awscdk.services.codebuild.ProjectProps

fun Construct.cfnProject(id: String, init: CfnProjectProps.Builder.() -> Unit): CfnProject {
    val propsBuilder = CfnProjectProps.builder()
    propsBuilder.init()
    
    return CfnProject(this, id, propsBuilder.build())
}

fun Construct.pipelineProject(id: String, init: PipelineProjectProps.Builder.() -> Unit): PipelineProject {
    val propsBuilder = PipelineProjectProps.builder()
    propsBuilder.init()
    
    return PipelineProject(this, id, propsBuilder.build())
}

fun Construct.cfnSourceCredential(id: String, init: CfnSourceCredentialProps.Builder.() -> Unit): CfnSourceCredential {
    val propsBuilder = CfnSourceCredentialProps.builder()
    propsBuilder.init()
    
    return CfnSourceCredential(this, id, propsBuilder.build())
}

fun Construct.project(id: String, init: ProjectProps.Builder.() -> Unit): Project {
    val propsBuilder = ProjectProps.builder()
    propsBuilder.init()
    
    return Project(this, id, propsBuilder.build())
}

