package com.brianyarr.cdk.codebuild

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.codebuild.CfnSourceCredential
import software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps
import software.amazon.awscdk.services.codebuild.CfnReportGroup
import software.amazon.awscdk.services.codebuild.CfnReportGroupProps
import software.amazon.awscdk.services.codebuild.CfnProject
import software.amazon.awscdk.services.codebuild.CfnProjectProps
import software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials
import software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps
import software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials
import software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps
import software.amazon.awscdk.services.codebuild.GitHubSourceCredentials
import software.amazon.awscdk.services.codebuild.GitHubSourceCredentialsProps
import software.amazon.awscdk.services.codebuild.Project
import software.amazon.awscdk.services.codebuild.ProjectProps
import software.amazon.awscdk.services.codebuild.PipelineProject
import software.amazon.awscdk.services.codebuild.PipelineProjectProps

fun Construct.cfnSourceCredential(id: String, init: CfnSourceCredentialProps.Builder.() -> Unit): CfnSourceCredential {
    val propsBuilder = CfnSourceCredentialProps.builder()
    propsBuilder.init()
    
    return CfnSourceCredential(this, id, propsBuilder.build())
}

fun Construct.cfnReportGroup(id: String, init: CfnReportGroupProps.Builder.() -> Unit): CfnReportGroup {
    val propsBuilder = CfnReportGroupProps.builder()
    propsBuilder.init()
    
    return CfnReportGroup(this, id, propsBuilder.build())
}

fun Construct.cfnProject(id: String, init: CfnProjectProps.Builder.() -> Unit): CfnProject {
    val propsBuilder = CfnProjectProps.builder()
    propsBuilder.init()
    
    return CfnProject(this, id, propsBuilder.build())
}

fun Construct.bitBucketSourceCredentials(id: String, init: BitBucketSourceCredentialsProps.Builder.() -> Unit): BitBucketSourceCredentials {
    val propsBuilder = BitBucketSourceCredentialsProps.builder()
    propsBuilder.init()
    
    return BitBucketSourceCredentials(this, id, propsBuilder.build())
}

fun Construct.gitHubEnterpriseSourceCredentials(id: String, init: GitHubEnterpriseSourceCredentialsProps.Builder.() -> Unit): GitHubEnterpriseSourceCredentials {
    val propsBuilder = GitHubEnterpriseSourceCredentialsProps.builder()
    propsBuilder.init()
    
    return GitHubEnterpriseSourceCredentials(this, id, propsBuilder.build())
}

fun Construct.gitHubSourceCredentials(id: String, init: GitHubSourceCredentialsProps.Builder.() -> Unit): GitHubSourceCredentials {
    val propsBuilder = GitHubSourceCredentialsProps.builder()
    propsBuilder.init()
    
    return GitHubSourceCredentials(this, id, propsBuilder.build())
}

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

