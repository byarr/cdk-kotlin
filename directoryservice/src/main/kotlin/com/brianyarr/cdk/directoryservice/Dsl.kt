package com.brianyarr.cdk.directoryservice

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.directoryservice.CfnSimpleAD
import software.amazon.awscdk.services.directoryservice.CfnSimpleADProps
import software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD
import software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps

fun Construct.cfnSimpleAD(id: String, init: CfnSimpleADProps.Builder.() -> Unit): CfnSimpleAD {
    val propsBuilder = CfnSimpleADProps.builder()
    propsBuilder.init()
    
    return CfnSimpleAD(this, id, propsBuilder.build())
}

fun Construct.cfnMicrosoftAD(id: String, init: CfnMicrosoftADProps.Builder.() -> Unit): CfnMicrosoftAD {
    val propsBuilder = CfnMicrosoftADProps.builder()
    propsBuilder.init()
    
    return CfnMicrosoftAD(this, id, propsBuilder.build())
}

