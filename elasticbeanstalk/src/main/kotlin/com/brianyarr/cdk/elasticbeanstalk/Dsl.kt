package com.brianyarr.cdk.elasticbeanstalk

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplication
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps
import software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment
import software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps

fun Construct.cfnApplication(id: String, init: CfnApplicationProps.Builder.() -> Unit): CfnApplication {
    val propsBuilder = CfnApplicationProps.builder()
    propsBuilder.init()
    
    return CfnApplication(this, id, propsBuilder.build())
}

fun Construct.cfnConfigurationTemplate(id: String, init: CfnConfigurationTemplateProps.Builder.() -> Unit): CfnConfigurationTemplate {
    val propsBuilder = CfnConfigurationTemplateProps.builder()
    propsBuilder.init()
    
    return CfnConfigurationTemplate(this, id, propsBuilder.build())
}

fun Construct.cfnApplicationVersion(id: String, init: CfnApplicationVersionProps.Builder.() -> Unit): CfnApplicationVersion {
    val propsBuilder = CfnApplicationVersionProps.builder()
    propsBuilder.init()
    
    return CfnApplicationVersion(this, id, propsBuilder.build())
}

fun Construct.cfnEnvironment(id: String, init: CfnEnvironmentProps.Builder.() -> Unit): CfnEnvironment {
    val propsBuilder = CfnEnvironmentProps.builder()
    propsBuilder.init()
    
    return CfnEnvironment(this, id, propsBuilder.build())
}

