package com.brianyarr.cdk.robomaker

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.robomaker.CfnFleet
import software.amazon.awscdk.services.robomaker.CfnFleetProps
import software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion
import software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps
import software.amazon.awscdk.services.robomaker.CfnSimulationApplication
import software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps
import software.amazon.awscdk.services.robomaker.CfnRobot
import software.amazon.awscdk.services.robomaker.CfnRobotProps
import software.amazon.awscdk.services.robomaker.CfnRobotApplication
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps

fun Construct.cfnFleet(id: String, init: CfnFleetProps.Builder.() -> Unit): CfnFleet {
    val propsBuilder = CfnFleetProps.builder()
    propsBuilder.init()
    
    return CfnFleet(this, id, propsBuilder.build())
}

fun Construct.cfnSimulationApplicationVersion(id: String, init: CfnSimulationApplicationVersionProps.Builder.() -> Unit): CfnSimulationApplicationVersion {
    val propsBuilder = CfnSimulationApplicationVersionProps.builder()
    propsBuilder.init()
    
    return CfnSimulationApplicationVersion(this, id, propsBuilder.build())
}

fun Construct.cfnSimulationApplication(id: String, init: CfnSimulationApplicationProps.Builder.() -> Unit): CfnSimulationApplication {
    val propsBuilder = CfnSimulationApplicationProps.builder()
    propsBuilder.init()
    
    return CfnSimulationApplication(this, id, propsBuilder.build())
}

fun Construct.cfnRobot(id: String, init: CfnRobotProps.Builder.() -> Unit): CfnRobot {
    val propsBuilder = CfnRobotProps.builder()
    propsBuilder.init()
    
    return CfnRobot(this, id, propsBuilder.build())
}

fun Construct.cfnRobotApplication(id: String, init: CfnRobotApplicationProps.Builder.() -> Unit): CfnRobotApplication {
    val propsBuilder = CfnRobotApplicationProps.builder()
    propsBuilder.init()
    
    return CfnRobotApplication(this, id, propsBuilder.build())
}

fun Construct.cfnRobotApplicationVersion(id: String, init: CfnRobotApplicationVersionProps.Builder.() -> Unit): CfnRobotApplicationVersion {
    val propsBuilder = CfnRobotApplicationVersionProps.builder()
    propsBuilder.init()
    
    return CfnRobotApplicationVersion(this, id, propsBuilder.build())
}

