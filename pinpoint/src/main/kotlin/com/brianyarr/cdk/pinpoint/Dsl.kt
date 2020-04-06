package com.brianyarr.cdk.pinpoint

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.pinpoint.CfnPushTemplate
import software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps
import software.amazon.awscdk.services.pinpoint.CfnAPNSChannel
import software.amazon.awscdk.services.pinpoint.CfnAPNSChannelProps
import software.amazon.awscdk.services.pinpoint.CfnAPNSVoipSandboxChannel
import software.amazon.awscdk.services.pinpoint.CfnAPNSVoipSandboxChannelProps
import software.amazon.awscdk.services.pinpoint.CfnGCMChannel
import software.amazon.awscdk.services.pinpoint.CfnGCMChannelProps
import software.amazon.awscdk.services.pinpoint.CfnApp
import software.amazon.awscdk.services.pinpoint.CfnAppProps
import software.amazon.awscdk.services.pinpoint.CfnEmailTemplate
import software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps
import software.amazon.awscdk.services.pinpoint.CfnVoiceChannel
import software.amazon.awscdk.services.pinpoint.CfnVoiceChannelProps
import software.amazon.awscdk.services.pinpoint.CfnADMChannel
import software.amazon.awscdk.services.pinpoint.CfnADMChannelProps
import software.amazon.awscdk.services.pinpoint.CfnSegment
import software.amazon.awscdk.services.pinpoint.CfnSegmentProps
import software.amazon.awscdk.services.pinpoint.CfnCampaign
import software.amazon.awscdk.services.pinpoint.CfnCampaignProps
import software.amazon.awscdk.services.pinpoint.CfnSmsTemplate
import software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps
import software.amazon.awscdk.services.pinpoint.CfnSMSChannel
import software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps
import software.amazon.awscdk.services.pinpoint.CfnAPNSVoipChannel
import software.amazon.awscdk.services.pinpoint.CfnAPNSVoipChannelProps
import software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannel
import software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannelProps
import software.amazon.awscdk.services.pinpoint.CfnBaiduChannel
import software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps
import software.amazon.awscdk.services.pinpoint.CfnEventStream
import software.amazon.awscdk.services.pinpoint.CfnEventStreamProps
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettings
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps
import software.amazon.awscdk.services.pinpoint.CfnEmailChannel
import software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps

fun Construct.cfnPushTemplate(id: String, init: CfnPushTemplateProps.Builder.() -> Unit): CfnPushTemplate {
    val propsBuilder = CfnPushTemplateProps.builder()
    propsBuilder.init()
    
    return CfnPushTemplate(this, id, propsBuilder.build())
}

fun Construct.cfnAPNSChannel(id: String, init: CfnAPNSChannelProps.Builder.() -> Unit): CfnAPNSChannel {
    val propsBuilder = CfnAPNSChannelProps.builder()
    propsBuilder.init()
    
    return CfnAPNSChannel(this, id, propsBuilder.build())
}

fun Construct.cfnAPNSVoipSandboxChannel(id: String, init: CfnAPNSVoipSandboxChannelProps.Builder.() -> Unit): CfnAPNSVoipSandboxChannel {
    val propsBuilder = CfnAPNSVoipSandboxChannelProps.builder()
    propsBuilder.init()
    
    return CfnAPNSVoipSandboxChannel(this, id, propsBuilder.build())
}

fun Construct.cfnGCMChannel(id: String, init: CfnGCMChannelProps.Builder.() -> Unit): CfnGCMChannel {
    val propsBuilder = CfnGCMChannelProps.builder()
    propsBuilder.init()
    
    return CfnGCMChannel(this, id, propsBuilder.build())
}

fun Construct.cfnApp(id: String, init: CfnAppProps.Builder.() -> Unit): CfnApp {
    val propsBuilder = CfnAppProps.builder()
    propsBuilder.init()
    
    return CfnApp(this, id, propsBuilder.build())
}

fun Construct.cfnEmailTemplate(id: String, init: CfnEmailTemplateProps.Builder.() -> Unit): CfnEmailTemplate {
    val propsBuilder = CfnEmailTemplateProps.builder()
    propsBuilder.init()
    
    return CfnEmailTemplate(this, id, propsBuilder.build())
}

fun Construct.cfnVoiceChannel(id: String, init: CfnVoiceChannelProps.Builder.() -> Unit): CfnVoiceChannel {
    val propsBuilder = CfnVoiceChannelProps.builder()
    propsBuilder.init()
    
    return CfnVoiceChannel(this, id, propsBuilder.build())
}

fun Construct.cfnADMChannel(id: String, init: CfnADMChannelProps.Builder.() -> Unit): CfnADMChannel {
    val propsBuilder = CfnADMChannelProps.builder()
    propsBuilder.init()
    
    return CfnADMChannel(this, id, propsBuilder.build())
}

fun Construct.cfnSegment(id: String, init: CfnSegmentProps.Builder.() -> Unit): CfnSegment {
    val propsBuilder = CfnSegmentProps.builder()
    propsBuilder.init()
    
    return CfnSegment(this, id, propsBuilder.build())
}

fun Construct.cfnCampaign(id: String, init: CfnCampaignProps.Builder.() -> Unit): CfnCampaign {
    val propsBuilder = CfnCampaignProps.builder()
    propsBuilder.init()
    
    return CfnCampaign(this, id, propsBuilder.build())
}

fun Construct.cfnSmsTemplate(id: String, init: CfnSmsTemplateProps.Builder.() -> Unit): CfnSmsTemplate {
    val propsBuilder = CfnSmsTemplateProps.builder()
    propsBuilder.init()
    
    return CfnSmsTemplate(this, id, propsBuilder.build())
}

fun Construct.cfnSMSChannel(id: String, init: CfnSMSChannelProps.Builder.() -> Unit): CfnSMSChannel {
    val propsBuilder = CfnSMSChannelProps.builder()
    propsBuilder.init()
    
    return CfnSMSChannel(this, id, propsBuilder.build())
}

fun Construct.cfnAPNSVoipChannel(id: String, init: CfnAPNSVoipChannelProps.Builder.() -> Unit): CfnAPNSVoipChannel {
    val propsBuilder = CfnAPNSVoipChannelProps.builder()
    propsBuilder.init()
    
    return CfnAPNSVoipChannel(this, id, propsBuilder.build())
}

fun Construct.cfnAPNSSandboxChannel(id: String, init: CfnAPNSSandboxChannelProps.Builder.() -> Unit): CfnAPNSSandboxChannel {
    val propsBuilder = CfnAPNSSandboxChannelProps.builder()
    propsBuilder.init()
    
    return CfnAPNSSandboxChannel(this, id, propsBuilder.build())
}

fun Construct.cfnBaiduChannel(id: String, init: CfnBaiduChannelProps.Builder.() -> Unit): CfnBaiduChannel {
    val propsBuilder = CfnBaiduChannelProps.builder()
    propsBuilder.init()
    
    return CfnBaiduChannel(this, id, propsBuilder.build())
}

fun Construct.cfnEventStream(id: String, init: CfnEventStreamProps.Builder.() -> Unit): CfnEventStream {
    val propsBuilder = CfnEventStreamProps.builder()
    propsBuilder.init()
    
    return CfnEventStream(this, id, propsBuilder.build())
}

fun Construct.cfnApplicationSettings(id: String, init: CfnApplicationSettingsProps.Builder.() -> Unit): CfnApplicationSettings {
    val propsBuilder = CfnApplicationSettingsProps.builder()
    propsBuilder.init()
    
    return CfnApplicationSettings(this, id, propsBuilder.build())
}

fun Construct.cfnEmailChannel(id: String, init: CfnEmailChannelProps.Builder.() -> Unit): CfnEmailChannel {
    val propsBuilder = CfnEmailChannelProps.builder()
    propsBuilder.init()
    
    return CfnEmailChannel(this, id, propsBuilder.build())
}

