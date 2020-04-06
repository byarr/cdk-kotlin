package com.brianyarr.cdk.guardduty

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.guardduty.CfnFilter
import software.amazon.awscdk.services.guardduty.CfnFilterProps
import software.amazon.awscdk.services.guardduty.CfnIPSet
import software.amazon.awscdk.services.guardduty.CfnIPSetProps
import software.amazon.awscdk.services.guardduty.CfnDetector
import software.amazon.awscdk.services.guardduty.CfnDetectorProps
import software.amazon.awscdk.services.guardduty.CfnThreatIntelSet
import software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps
import software.amazon.awscdk.services.guardduty.CfnMember
import software.amazon.awscdk.services.guardduty.CfnMemberProps
import software.amazon.awscdk.services.guardduty.CfnMaster
import software.amazon.awscdk.services.guardduty.CfnMasterProps

fun Construct.cfnFilter(id: String, init: CfnFilterProps.Builder.() -> Unit): CfnFilter {
    val propsBuilder = CfnFilterProps.builder()
    propsBuilder.init()
    
    return CfnFilter(this, id, propsBuilder.build())
}

fun Construct.cfnIPSet(id: String, init: CfnIPSetProps.Builder.() -> Unit): CfnIPSet {
    val propsBuilder = CfnIPSetProps.builder()
    propsBuilder.init()
    
    return CfnIPSet(this, id, propsBuilder.build())
}

fun Construct.cfnDetector(id: String, init: CfnDetectorProps.Builder.() -> Unit): CfnDetector {
    val propsBuilder = CfnDetectorProps.builder()
    propsBuilder.init()
    
    return CfnDetector(this, id, propsBuilder.build())
}

fun Construct.cfnThreatIntelSet(id: String, init: CfnThreatIntelSetProps.Builder.() -> Unit): CfnThreatIntelSet {
    val propsBuilder = CfnThreatIntelSetProps.builder()
    propsBuilder.init()
    
    return CfnThreatIntelSet(this, id, propsBuilder.build())
}

fun Construct.cfnMember(id: String, init: CfnMemberProps.Builder.() -> Unit): CfnMember {
    val propsBuilder = CfnMemberProps.builder()
    propsBuilder.init()
    
    return CfnMember(this, id, propsBuilder.build())
}

fun Construct.cfnMaster(id: String, init: CfnMasterProps.Builder.() -> Unit): CfnMaster {
    val propsBuilder = CfnMasterProps.builder()
    propsBuilder.init()
    
    return CfnMaster(this, id, propsBuilder.build())
}

