package com.brianyarr.cdk.servicecatalog

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraint
import software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps
import software.amazon.awscdk.services.servicecatalog.CfnTagOption
import software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps
import software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraint
import software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps
import software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint
import software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps
import software.amazon.awscdk.services.servicecatalog.CfnPortfolio
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioProps
import software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociation
import software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps
import software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint
import software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps
import software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare
import software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShareProps
import software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint
import software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraintProps
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps

fun Construct.cfnLaunchTemplateConstraint(id: String, init: CfnLaunchTemplateConstraintProps.Builder.() -> Unit): CfnLaunchTemplateConstraint {
    val propsBuilder = CfnLaunchTemplateConstraintProps.builder()
    propsBuilder.init()
    
    return CfnLaunchTemplateConstraint(this, id, propsBuilder.build())
}

fun Construct.cfnTagOption(id: String, init: CfnTagOptionProps.Builder.() -> Unit): CfnTagOption {
    val propsBuilder = CfnTagOptionProps.builder()
    propsBuilder.init()
    
    return CfnTagOption(this, id, propsBuilder.build())
}

fun Construct.cfnStackSetConstraint(id: String, init: CfnStackSetConstraintProps.Builder.() -> Unit): CfnStackSetConstraint {
    val propsBuilder = CfnStackSetConstraintProps.builder()
    propsBuilder.init()
    
    return CfnStackSetConstraint(this, id, propsBuilder.build())
}

fun Construct.cfnPortfolioProductAssociation(id: String, init: CfnPortfolioProductAssociationProps.Builder.() -> Unit): CfnPortfolioProductAssociation {
    val propsBuilder = CfnPortfolioProductAssociationProps.builder()
    propsBuilder.init()
    
    return CfnPortfolioProductAssociation(this, id, propsBuilder.build())
}

fun Construct.cfnPortfolioPrincipalAssociation(id: String, init: CfnPortfolioPrincipalAssociationProps.Builder.() -> Unit): CfnPortfolioPrincipalAssociation {
    val propsBuilder = CfnPortfolioPrincipalAssociationProps.builder()
    propsBuilder.init()
    
    return CfnPortfolioPrincipalAssociation(this, id, propsBuilder.build())
}

fun Construct.cfnCloudFormationProduct(id: String, init: CfnCloudFormationProductProps.Builder.() -> Unit): CfnCloudFormationProduct {
    val propsBuilder = CfnCloudFormationProductProps.builder()
    propsBuilder.init()
    
    return CfnCloudFormationProduct(this, id, propsBuilder.build())
}

fun Construct.cfnCloudFormationProvisionedProduct(id: String, init: CfnCloudFormationProvisionedProductProps.Builder.() -> Unit): CfnCloudFormationProvisionedProduct {
    val propsBuilder = CfnCloudFormationProvisionedProductProps.builder()
    propsBuilder.init()
    
    return CfnCloudFormationProvisionedProduct(this, id, propsBuilder.build())
}

fun Construct.cfnResourceUpdateConstraint(id: String, init: CfnResourceUpdateConstraintProps.Builder.() -> Unit): CfnResourceUpdateConstraint {
    val propsBuilder = CfnResourceUpdateConstraintProps.builder()
    propsBuilder.init()
    
    return CfnResourceUpdateConstraint(this, id, propsBuilder.build())
}

fun Construct.cfnPortfolio(id: String, init: CfnPortfolioProps.Builder.() -> Unit): CfnPortfolio {
    val propsBuilder = CfnPortfolioProps.builder()
    propsBuilder.init()
    
    return CfnPortfolio(this, id, propsBuilder.build())
}

fun Construct.cfnTagOptionAssociation(id: String, init: CfnTagOptionAssociationProps.Builder.() -> Unit): CfnTagOptionAssociation {
    val propsBuilder = CfnTagOptionAssociationProps.builder()
    propsBuilder.init()
    
    return CfnTagOptionAssociation(this, id, propsBuilder.build())
}

fun Construct.cfnLaunchRoleConstraint(id: String, init: CfnLaunchRoleConstraintProps.Builder.() -> Unit): CfnLaunchRoleConstraint {
    val propsBuilder = CfnLaunchRoleConstraintProps.builder()
    propsBuilder.init()
    
    return CfnLaunchRoleConstraint(this, id, propsBuilder.build())
}

fun Construct.cfnAcceptedPortfolioShare(id: String, init: CfnAcceptedPortfolioShareProps.Builder.() -> Unit): CfnAcceptedPortfolioShare {
    val propsBuilder = CfnAcceptedPortfolioShareProps.builder()
    propsBuilder.init()
    
    return CfnAcceptedPortfolioShare(this, id, propsBuilder.build())
}

fun Construct.cfnLaunchNotificationConstraint(id: String, init: CfnLaunchNotificationConstraintProps.Builder.() -> Unit): CfnLaunchNotificationConstraint {
    val propsBuilder = CfnLaunchNotificationConstraintProps.builder()
    propsBuilder.init()
    
    return CfnLaunchNotificationConstraint(this, id, propsBuilder.build())
}

fun Construct.cfnPortfolioShare(id: String, init: CfnPortfolioShareProps.Builder.() -> Unit): CfnPortfolioShare {
    val propsBuilder = CfnPortfolioShareProps.builder()
    propsBuilder.init()
    
    return CfnPortfolioShare(this, id, propsBuilder.build())
}

