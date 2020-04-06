package com.brianyarr.cdk.inspector

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.inspector.CfnAssessmentTemplate
import software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps
import software.amazon.awscdk.services.inspector.CfnResourceGroup
import software.amazon.awscdk.services.inspector.CfnResourceGroupProps
import software.amazon.awscdk.services.inspector.CfnAssessmentTarget
import software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps

fun Construct.cfnAssessmentTemplate(id: String, init: CfnAssessmentTemplateProps.Builder.() -> Unit): CfnAssessmentTemplate {
    val propsBuilder = CfnAssessmentTemplateProps.builder()
    propsBuilder.init()
    
    return CfnAssessmentTemplate(this, id, propsBuilder.build())
}

fun Construct.cfnResourceGroup(id: String, init: CfnResourceGroupProps.Builder.() -> Unit): CfnResourceGroup {
    val propsBuilder = CfnResourceGroupProps.builder()
    propsBuilder.init()
    
    return CfnResourceGroup(this, id, propsBuilder.build())
}

fun Construct.cfnAssessmentTarget(id: String, init: CfnAssessmentTargetProps.Builder.() -> Unit): CfnAssessmentTarget {
    val propsBuilder = CfnAssessmentTargetProps.builder()
    propsBuilder.init()
    
    return CfnAssessmentTarget(this, id, propsBuilder.build())
}

