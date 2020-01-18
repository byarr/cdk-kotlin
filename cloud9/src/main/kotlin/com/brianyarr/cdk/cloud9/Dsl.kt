package com.brianyarr.cdk.cloud9

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2
import software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props

fun Construct.cfnEnvironmentEC2(id: String, init: CfnEnvironmentEC2Props.Builder.() -> Unit): CfnEnvironmentEC2 {
    val propsBuilder = CfnEnvironmentEC2Props.builder()
    propsBuilder.init()
    
    return CfnEnvironmentEC2(this, id, propsBuilder.build())
}

