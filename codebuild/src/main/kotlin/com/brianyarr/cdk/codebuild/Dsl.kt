package com.brianyarr.cdk.codebuild

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.codebuild.Project
import software.amazon.awscdk.services.codebuild.ProjectProps
import software.amazon.awscdk.services.codebuild.PipelineProject
import software.amazon.awscdk.services.codebuild.PipelineProjectProps

fun Construct.project(id: String, init: ProjectProps.Builder.() -> Unit): Project {
    val propsBuilder = ProjectProps.builder()
    propsBuilder.init()
    
    return Project(this, id, propsBuilder.build())
}


fun Construct.pipelineProject(id: String, init: PipelineProjectProps.Builder.() -> Unit): PipelineProject {
    val propsBuilder = PipelineProjectProps.builder()
    propsBuilder.init()
    
    return PipelineProject(this, id, propsBuilder.build())
}


