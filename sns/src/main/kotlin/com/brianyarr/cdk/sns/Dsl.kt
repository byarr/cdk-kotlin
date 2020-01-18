package com.brianyarr.cdk.sns

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.sns.CfnSubscription
import software.amazon.awscdk.services.sns.CfnSubscriptionProps
import software.amazon.awscdk.services.sns.Topic
import software.amazon.awscdk.services.sns.TopicProps
import software.amazon.awscdk.services.sns.TopicPolicy
import software.amazon.awscdk.services.sns.TopicPolicyProps
import software.amazon.awscdk.services.sns.CfnTopicPolicy
import software.amazon.awscdk.services.sns.CfnTopicPolicyProps
import software.amazon.awscdk.services.sns.Subscription
import software.amazon.awscdk.services.sns.SubscriptionProps
import software.amazon.awscdk.services.sns.CfnTopic
import software.amazon.awscdk.services.sns.CfnTopicProps

fun Construct.cfnSubscription(id: String, init: CfnSubscriptionProps.Builder.() -> Unit): CfnSubscription {
    val propsBuilder = CfnSubscriptionProps.builder()
    propsBuilder.init()
    
    return CfnSubscription(this, id, propsBuilder.build())
}

fun Construct.topic(id: String, init: TopicProps.Builder.() -> Unit): Topic {
    val propsBuilder = TopicProps.builder()
    propsBuilder.init()
    
    return Topic(this, id, propsBuilder.build())
}

fun Construct.topicPolicy(id: String, init: TopicPolicyProps.Builder.() -> Unit): TopicPolicy {
    val propsBuilder = TopicPolicyProps.builder()
    propsBuilder.init()
    
    return TopicPolicy(this, id, propsBuilder.build())
}

fun Construct.cfnTopicPolicy(id: String, init: CfnTopicPolicyProps.Builder.() -> Unit): CfnTopicPolicy {
    val propsBuilder = CfnTopicPolicyProps.builder()
    propsBuilder.init()
    
    return CfnTopicPolicy(this, id, propsBuilder.build())
}

fun Construct.subscription(id: String, init: SubscriptionProps.Builder.() -> Unit): Subscription {
    val propsBuilder = SubscriptionProps.builder()
    propsBuilder.init()
    
    return Subscription(this, id, propsBuilder.build())
}

fun Construct.cfnTopic(id: String, init: CfnTopicProps.Builder.() -> Unit): CfnTopic {
    val propsBuilder = CfnTopicProps.builder()
    propsBuilder.init()
    
    return CfnTopic(this, id, propsBuilder.build())
}

