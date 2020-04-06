package com.brianyarr.cdk.apigatewayv2

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.apigatewayv2.CfnStage
import software.amazon.awscdk.services.apigatewayv2.CfnStageProps
import software.amazon.awscdk.services.apigatewayv2.CfnDomainName
import software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps
import software.amazon.awscdk.services.apigatewayv2.CfnRoute
import software.amazon.awscdk.services.apigatewayv2.CfnRouteProps
import software.amazon.awscdk.services.apigatewayv2.CfnApi
import software.amazon.awscdk.services.apigatewayv2.CfnApiProps
import software.amazon.awscdk.services.apigatewayv2.CfnDeployment
import software.amazon.awscdk.services.apigatewayv2.CfnDeploymentProps
import software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse
import software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps
import software.amazon.awscdk.services.apigatewayv2.CfnIntegration
import software.amazon.awscdk.services.apigatewayv2.CfnIntegrationProps
import software.amazon.awscdk.services.apigatewayv2.CfnModel
import software.amazon.awscdk.services.apigatewayv2.CfnModelProps
import software.amazon.awscdk.services.apigatewayv2.CfnApiMapping
import software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps
import software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer
import software.amazon.awscdk.services.apigatewayv2.CfnAuthorizerProps
import software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse
import software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps

fun Construct.cfnStage(id: String, init: CfnStageProps.Builder.() -> Unit): CfnStage {
    val propsBuilder = CfnStageProps.builder()
    propsBuilder.init()
    
    return CfnStage(this, id, propsBuilder.build())
}

fun Construct.cfnDomainName(id: String, init: CfnDomainNameProps.Builder.() -> Unit): CfnDomainName {
    val propsBuilder = CfnDomainNameProps.builder()
    propsBuilder.init()
    
    return CfnDomainName(this, id, propsBuilder.build())
}

fun Construct.cfnRoute(id: String, init: CfnRouteProps.Builder.() -> Unit): CfnRoute {
    val propsBuilder = CfnRouteProps.builder()
    propsBuilder.init()
    
    return CfnRoute(this, id, propsBuilder.build())
}

fun Construct.cfnApi(id: String, init: CfnApiProps.Builder.() -> Unit): CfnApi {
    val propsBuilder = CfnApiProps.builder()
    propsBuilder.init()
    
    return CfnApi(this, id, propsBuilder.build())
}

fun Construct.cfnDeployment(id: String, init: CfnDeploymentProps.Builder.() -> Unit): CfnDeployment {
    val propsBuilder = CfnDeploymentProps.builder()
    propsBuilder.init()
    
    return CfnDeployment(this, id, propsBuilder.build())
}

fun Construct.cfnIntegrationResponse(id: String, init: CfnIntegrationResponseProps.Builder.() -> Unit): CfnIntegrationResponse {
    val propsBuilder = CfnIntegrationResponseProps.builder()
    propsBuilder.init()
    
    return CfnIntegrationResponse(this, id, propsBuilder.build())
}

fun Construct.cfnIntegration(id: String, init: CfnIntegrationProps.Builder.() -> Unit): CfnIntegration {
    val propsBuilder = CfnIntegrationProps.builder()
    propsBuilder.init()
    
    return CfnIntegration(this, id, propsBuilder.build())
}

fun Construct.cfnModel(id: String, init: CfnModelProps.Builder.() -> Unit): CfnModel {
    val propsBuilder = CfnModelProps.builder()
    propsBuilder.init()
    
    return CfnModel(this, id, propsBuilder.build())
}

fun Construct.cfnApiMapping(id: String, init: CfnApiMappingProps.Builder.() -> Unit): CfnApiMapping {
    val propsBuilder = CfnApiMappingProps.builder()
    propsBuilder.init()
    
    return CfnApiMapping(this, id, propsBuilder.build())
}

fun Construct.cfnAuthorizer(id: String, init: CfnAuthorizerProps.Builder.() -> Unit): CfnAuthorizer {
    val propsBuilder = CfnAuthorizerProps.builder()
    propsBuilder.init()
    
    return CfnAuthorizer(this, id, propsBuilder.build())
}

fun Construct.cfnRouteResponse(id: String, init: CfnRouteResponseProps.Builder.() -> Unit): CfnRouteResponse {
    val propsBuilder = CfnRouteResponseProps.builder()
    propsBuilder.init()
    
    return CfnRouteResponse(this, id, propsBuilder.build())
}

