package com.brianyarr.cdk.sns

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.sns.TopicPolicy
import software.amazon.awscdk.services.sns.TopicPolicyProps
import software.amazon.awscdk.services.sns.Subscription
import software.amazon.awscdk.services.sns.SubscriptionProps
import software.amazon.awscdk.services.sns.Topic
import software.amazon.awscdk.services.sns.TopicProps

fun Construct.topicPolicy(id: String, init: TopicPolicyProps.Builder.() -> Unit): TopicPolicy {
    val propsBuilder = TopicPolicyProps.builder()
    propsBuilder.init()
    
    return TopicPolicy(this, id, propsBuilder.build())
}


fun Construct.subscription(id: String, init: SubscriptionProps.Builder.() -> Unit): Subscription {
    val propsBuilder = SubscriptionProps.builder()
    propsBuilder.init()
    
    return Subscription(this, id, propsBuilder.build())
}


fun Construct.topic(id: String, init: TopicProps.Builder.() -> Unit): Topic {
    val propsBuilder = TopicProps.builder()
    propsBuilder.init()
    
    return Topic(this, id, propsBuilder.build())
}


