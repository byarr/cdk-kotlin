package com.brianyarr.cdk.gamelift

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet
import software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps
import software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration
import software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps
import software.amazon.awscdk.services.gamelift.CfnAlias
import software.amazon.awscdk.services.gamelift.CfnAliasProps
import software.amazon.awscdk.services.gamelift.CfnScript
import software.amazon.awscdk.services.gamelift.CfnScriptProps
import software.amazon.awscdk.services.gamelift.CfnFleet
import software.amazon.awscdk.services.gamelift.CfnFleetProps
import software.amazon.awscdk.services.gamelift.CfnBuild
import software.amazon.awscdk.services.gamelift.CfnBuildProps

fun Construct.cfnMatchmakingRuleSet(id: String, init: CfnMatchmakingRuleSetProps.Builder.() -> Unit): CfnMatchmakingRuleSet {
    val propsBuilder = CfnMatchmakingRuleSetProps.builder()
    propsBuilder.init()
    
    return CfnMatchmakingRuleSet(this, id, propsBuilder.build())
}

fun Construct.cfnGameSessionQueue(id: String, init: CfnGameSessionQueueProps.Builder.() -> Unit): CfnGameSessionQueue {
    val propsBuilder = CfnGameSessionQueueProps.builder()
    propsBuilder.init()
    
    return CfnGameSessionQueue(this, id, propsBuilder.build())
}

fun Construct.cfnMatchmakingConfiguration(id: String, init: CfnMatchmakingConfigurationProps.Builder.() -> Unit): CfnMatchmakingConfiguration {
    val propsBuilder = CfnMatchmakingConfigurationProps.builder()
    propsBuilder.init()
    
    return CfnMatchmakingConfiguration(this, id, propsBuilder.build())
}

fun Construct.cfnAlias(id: String, init: CfnAliasProps.Builder.() -> Unit): CfnAlias {
    val propsBuilder = CfnAliasProps.builder()
    propsBuilder.init()
    
    return CfnAlias(this, id, propsBuilder.build())
}

fun Construct.cfnScript(id: String, init: CfnScriptProps.Builder.() -> Unit): CfnScript {
    val propsBuilder = CfnScriptProps.builder()
    propsBuilder.init()
    
    return CfnScript(this, id, propsBuilder.build())
}

fun Construct.cfnFleet(id: String, init: CfnFleetProps.Builder.() -> Unit): CfnFleet {
    val propsBuilder = CfnFleetProps.builder()
    propsBuilder.init()
    
    return CfnFleet(this, id, propsBuilder.build())
}

fun Construct.cfnBuild(id: String, init: CfnBuildProps.Builder.() -> Unit): CfnBuild {
    val propsBuilder = CfnBuildProps.builder()
    propsBuilder.init()
    
    return CfnBuild(this, id, propsBuilder.build())
}

