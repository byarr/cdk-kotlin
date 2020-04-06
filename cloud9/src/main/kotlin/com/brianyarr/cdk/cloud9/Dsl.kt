package com.brianyarr.cdk.cloud9

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2
import software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props
import software.amazon.awscdk.services.cloud9.Ec2Environment
import software.amazon.awscdk.services.cloud9.Ec2EnvironmentProps

fun Construct.cfnEnvironmentEC2(id: String, init: CfnEnvironmentEC2Props.Builder.() -> Unit): CfnEnvironmentEC2 {
    val propsBuilder = CfnEnvironmentEC2Props.builder()
    propsBuilder.init()
    
    return CfnEnvironmentEC2(this, id, propsBuilder.build())
}

fun Construct.ec2Environment(id: String, init: Ec2EnvironmentProps.Builder.() -> Unit): Ec2Environment {
    val propsBuilder = Ec2EnvironmentProps.builder()
    propsBuilder.init()
    
    return Ec2Environment(this, id, propsBuilder.build())
}

