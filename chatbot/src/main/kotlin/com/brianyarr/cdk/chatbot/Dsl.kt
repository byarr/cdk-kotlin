package com.brianyarr.cdk.chatbot

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.chatbot.CfnSlackChannelConfiguration
import software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps

fun Construct.cfnSlackChannelConfiguration(id: String, init: CfnSlackChannelConfigurationProps.Builder.() -> Unit): CfnSlackChannelConfiguration {
    val propsBuilder = CfnSlackChannelConfigurationProps.builder()
    propsBuilder.init()
    
    return CfnSlackChannelConfiguration(this, id, propsBuilder.build())
}

