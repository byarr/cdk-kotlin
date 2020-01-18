package com.brianyarr.cdk.accessanalyzer

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer
import software.amazon.awscdk.services.accessanalyzer.CfnAnalyzerProps

fun Construct.cfnAnalyzer(id: String, init: CfnAnalyzerProps.Builder.() -> Unit): CfnAnalyzer {
    val propsBuilder = CfnAnalyzerProps.builder()
    propsBuilder.init()
    
    return CfnAnalyzer(this, id, propsBuilder.build())
}

