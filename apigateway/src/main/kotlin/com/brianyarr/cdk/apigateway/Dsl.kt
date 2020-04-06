package com.brianyarr.cdk.apigateway

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.apigateway.CfnDeploymentV2
import software.amazon.awscdk.services.apigateway.CfnDeploymentV2Props
import software.amazon.awscdk.services.apigateway.Model
import software.amazon.awscdk.services.apigateway.ModelProps
import software.amazon.awscdk.services.apigateway.TokenAuthorizer
import software.amazon.awscdk.services.apigateway.TokenAuthorizerProps
import software.amazon.awscdk.services.apigateway.CfnBasePathMapping
import software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps
import software.amazon.awscdk.services.apigateway.CfnUsagePlan
import software.amazon.awscdk.services.apigateway.CfnUsagePlanProps
import software.amazon.awscdk.services.apigateway.Stage
import software.amazon.awscdk.services.apigateway.StageProps
import software.amazon.awscdk.services.apigateway.CfnDocumentationVersion
import software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps
import software.amazon.awscdk.services.apigateway.CfnAccount
import software.amazon.awscdk.services.apigateway.CfnAccountProps
import software.amazon.awscdk.services.apigateway.CfnGatewayResponse
import software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps
import software.amazon.awscdk.services.apigateway.CfnDocumentationPart
import software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps
import software.amazon.awscdk.services.apigateway.Method
import software.amazon.awscdk.services.apigateway.MethodProps
import software.amazon.awscdk.services.apigateway.CfnModel
import software.amazon.awscdk.services.apigateway.CfnModelProps
import software.amazon.awscdk.services.apigateway.CfnRestApi
import software.amazon.awscdk.services.apigateway.CfnRestApiProps
import software.amazon.awscdk.services.apigateway.BasePathMapping
import software.amazon.awscdk.services.apigateway.BasePathMappingProps
import software.amazon.awscdk.services.apigateway.CfnUsagePlanKey
import software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps
import software.amazon.awscdk.services.apigateway.CfnDomainNameV2
import software.amazon.awscdk.services.apigateway.CfnDomainNameV2Props
import software.amazon.awscdk.services.apigateway.RateLimitedApiKey
import software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps
import software.amazon.awscdk.services.apigateway.CfnStage
import software.amazon.awscdk.services.apigateway.CfnStageProps
import software.amazon.awscdk.services.apigateway.CfnModelV2
import software.amazon.awscdk.services.apigateway.CfnModelV2Props
import software.amazon.awscdk.services.apigateway.CfnDeployment
import software.amazon.awscdk.services.apigateway.CfnDeploymentProps
import software.amazon.awscdk.services.apigateway.VpcLink
import software.amazon.awscdk.services.apigateway.VpcLinkProps
import software.amazon.awscdk.services.apigateway.DomainName
import software.amazon.awscdk.services.apigateway.DomainNameProps
import software.amazon.awscdk.services.apigateway.CfnResource
import software.amazon.awscdk.services.apigateway.CfnResourceProps
import software.amazon.awscdk.services.apigateway.CfnDomainName
import software.amazon.awscdk.services.apigateway.CfnDomainNameProps
import software.amazon.awscdk.services.apigateway.UsagePlan
import software.amazon.awscdk.services.apigateway.UsagePlanProps
import software.amazon.awscdk.services.apigateway.RequestAuthorizer
import software.amazon.awscdk.services.apigateway.RequestAuthorizerProps
import software.amazon.awscdk.services.apigateway.CfnClientCertificate
import software.amazon.awscdk.services.apigateway.CfnClientCertificateProps
import software.amazon.awscdk.services.apigateway.CfnIntegrationV2
import software.amazon.awscdk.services.apigateway.CfnIntegrationV2Props
import software.amazon.awscdk.services.apigateway.RequestValidator
import software.amazon.awscdk.services.apigateway.RequestValidatorProps
import software.amazon.awscdk.services.apigateway.ApiKey
import software.amazon.awscdk.services.apigateway.ApiKeyProps
import software.amazon.awscdk.services.apigateway.CfnVpcLink
import software.amazon.awscdk.services.apigateway.CfnVpcLinkProps
import software.amazon.awscdk.services.apigateway.CfnRouteResponseV2
import software.amazon.awscdk.services.apigateway.CfnRouteResponseV2Props
import software.amazon.awscdk.services.apigateway.CfnIntegrationResponseV2
import software.amazon.awscdk.services.apigateway.CfnIntegrationResponseV2Props
import software.amazon.awscdk.services.apigateway.CfnStageV2
import software.amazon.awscdk.services.apigateway.CfnStageV2Props
import software.amazon.awscdk.services.apigateway.CfnApiKey
import software.amazon.awscdk.services.apigateway.CfnApiKeyProps
import software.amazon.awscdk.services.apigateway.Deployment
import software.amazon.awscdk.services.apigateway.DeploymentProps
import software.amazon.awscdk.services.apigateway.LambdaRestApi
import software.amazon.awscdk.services.apigateway.LambdaRestApiProps
import software.amazon.awscdk.services.apigateway.CfnApiMappingV2
import software.amazon.awscdk.services.apigateway.CfnApiMappingV2Props
import software.amazon.awscdk.services.apigateway.CfnMethod
import software.amazon.awscdk.services.apigateway.CfnMethodProps
import software.amazon.awscdk.services.apigateway.CfnAuthorizerV2
import software.amazon.awscdk.services.apigateway.CfnAuthorizerV2Props
import software.amazon.awscdk.services.apigateway.RestApi
import software.amazon.awscdk.services.apigateway.RestApiProps
import software.amazon.awscdk.services.apigateway.CfnApiV2
import software.amazon.awscdk.services.apigateway.CfnApiV2Props
import software.amazon.awscdk.services.apigateway.CfnAuthorizer
import software.amazon.awscdk.services.apigateway.CfnAuthorizerProps
import software.amazon.awscdk.services.apigateway.CfnRouteV2
import software.amazon.awscdk.services.apigateway.CfnRouteV2Props
import software.amazon.awscdk.services.apigateway.Resource
import software.amazon.awscdk.services.apigateway.ResourceProps
import software.amazon.awscdk.services.apigateway.CfnRequestValidator
import software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps
import software.amazon.awscdk.services.apigateway.ProxyResource
import software.amazon.awscdk.services.apigateway.ProxyResourceProps

fun Construct.cfnDeploymentV2(id: String, init: CfnDeploymentV2Props.Builder.() -> Unit): CfnDeploymentV2 {
    val propsBuilder = CfnDeploymentV2Props.builder()
    propsBuilder.init()
    
    return CfnDeploymentV2(this, id, propsBuilder.build())
}

fun Construct.model(id: String, init: ModelProps.Builder.() -> Unit): Model {
    val propsBuilder = ModelProps.builder()
    propsBuilder.init()
    
    return Model(this, id, propsBuilder.build())
}

fun Construct.tokenAuthorizer(id: String, init: TokenAuthorizerProps.Builder.() -> Unit): TokenAuthorizer {
    val propsBuilder = TokenAuthorizerProps.builder()
    propsBuilder.init()
    
    return TokenAuthorizer(this, id, propsBuilder.build())
}

fun Construct.cfnBasePathMapping(id: String, init: CfnBasePathMappingProps.Builder.() -> Unit): CfnBasePathMapping {
    val propsBuilder = CfnBasePathMappingProps.builder()
    propsBuilder.init()
    
    return CfnBasePathMapping(this, id, propsBuilder.build())
}

fun Construct.cfnUsagePlan(id: String, init: CfnUsagePlanProps.Builder.() -> Unit): CfnUsagePlan {
    val propsBuilder = CfnUsagePlanProps.builder()
    propsBuilder.init()
    
    return CfnUsagePlan(this, id, propsBuilder.build())
}

fun Construct.stage(id: String, init: StageProps.Builder.() -> Unit): Stage {
    val propsBuilder = StageProps.builder()
    propsBuilder.init()
    
    return Stage(this, id, propsBuilder.build())
}

fun Construct.cfnDocumentationVersion(id: String, init: CfnDocumentationVersionProps.Builder.() -> Unit): CfnDocumentationVersion {
    val propsBuilder = CfnDocumentationVersionProps.builder()
    propsBuilder.init()
    
    return CfnDocumentationVersion(this, id, propsBuilder.build())
}

fun Construct.cfnAccount(id: String, init: CfnAccountProps.Builder.() -> Unit): CfnAccount {
    val propsBuilder = CfnAccountProps.builder()
    propsBuilder.init()
    
    return CfnAccount(this, id, propsBuilder.build())
}

fun Construct.cfnGatewayResponse(id: String, init: CfnGatewayResponseProps.Builder.() -> Unit): CfnGatewayResponse {
    val propsBuilder = CfnGatewayResponseProps.builder()
    propsBuilder.init()
    
    return CfnGatewayResponse(this, id, propsBuilder.build())
}

fun Construct.cfnDocumentationPart(id: String, init: CfnDocumentationPartProps.Builder.() -> Unit): CfnDocumentationPart {
    val propsBuilder = CfnDocumentationPartProps.builder()
    propsBuilder.init()
    
    return CfnDocumentationPart(this, id, propsBuilder.build())
}

fun Construct.method(id: String, init: MethodProps.Builder.() -> Unit): Method {
    val propsBuilder = MethodProps.builder()
    propsBuilder.init()
    
    return Method(this, id, propsBuilder.build())
}

fun Construct.cfnModel(id: String, init: CfnModelProps.Builder.() -> Unit): CfnModel {
    val propsBuilder = CfnModelProps.builder()
    propsBuilder.init()
    
    return CfnModel(this, id, propsBuilder.build())
}

fun Construct.cfnRestApi(id: String, init: CfnRestApiProps.Builder.() -> Unit): CfnRestApi {
    val propsBuilder = CfnRestApiProps.builder()
    propsBuilder.init()
    
    return CfnRestApi(this, id, propsBuilder.build())
}

fun Construct.basePathMapping(id: String, init: BasePathMappingProps.Builder.() -> Unit): BasePathMapping {
    val propsBuilder = BasePathMappingProps.builder()
    propsBuilder.init()
    
    return BasePathMapping(this, id, propsBuilder.build())
}

fun Construct.cfnUsagePlanKey(id: String, init: CfnUsagePlanKeyProps.Builder.() -> Unit): CfnUsagePlanKey {
    val propsBuilder = CfnUsagePlanKeyProps.builder()
    propsBuilder.init()
    
    return CfnUsagePlanKey(this, id, propsBuilder.build())
}

fun Construct.cfnDomainNameV2(id: String, init: CfnDomainNameV2Props.Builder.() -> Unit): CfnDomainNameV2 {
    val propsBuilder = CfnDomainNameV2Props.builder()
    propsBuilder.init()
    
    return CfnDomainNameV2(this, id, propsBuilder.build())
}

fun Construct.rateLimitedApiKey(id: String, init: RateLimitedApiKeyProps.Builder.() -> Unit): RateLimitedApiKey {
    val propsBuilder = RateLimitedApiKeyProps.builder()
    propsBuilder.init()
    
    return RateLimitedApiKey(this, id, propsBuilder.build())
}

fun Construct.cfnStage(id: String, init: CfnStageProps.Builder.() -> Unit): CfnStage {
    val propsBuilder = CfnStageProps.builder()
    propsBuilder.init()
    
    return CfnStage(this, id, propsBuilder.build())
}

fun Construct.cfnModelV2(id: String, init: CfnModelV2Props.Builder.() -> Unit): CfnModelV2 {
    val propsBuilder = CfnModelV2Props.builder()
    propsBuilder.init()
    
    return CfnModelV2(this, id, propsBuilder.build())
}

fun Construct.cfnDeployment(id: String, init: CfnDeploymentProps.Builder.() -> Unit): CfnDeployment {
    val propsBuilder = CfnDeploymentProps.builder()
    propsBuilder.init()
    
    return CfnDeployment(this, id, propsBuilder.build())
}

fun Construct.vpcLink(id: String, init: VpcLinkProps.Builder.() -> Unit): VpcLink {
    val propsBuilder = VpcLinkProps.builder()
    propsBuilder.init()
    
    return VpcLink(this, id, propsBuilder.build())
}

fun Construct.domainName(id: String, init: DomainNameProps.Builder.() -> Unit): DomainName {
    val propsBuilder = DomainNameProps.builder()
    propsBuilder.init()
    
    return DomainName(this, id, propsBuilder.build())
}

fun Construct.cfnResource(id: String, init: CfnResourceProps.Builder.() -> Unit): CfnResource {
    val propsBuilder = CfnResourceProps.builder()
    propsBuilder.init()
    
    return CfnResource(this, id, propsBuilder.build())
}

fun Construct.cfnDomainName(id: String, init: CfnDomainNameProps.Builder.() -> Unit): CfnDomainName {
    val propsBuilder = CfnDomainNameProps.builder()
    propsBuilder.init()
    
    return CfnDomainName(this, id, propsBuilder.build())
}

fun Construct.usagePlan(id: String, init: UsagePlanProps.Builder.() -> Unit): UsagePlan {
    val propsBuilder = UsagePlanProps.builder()
    propsBuilder.init()
    
    return UsagePlan(this, id, propsBuilder.build())
}

fun Construct.requestAuthorizer(id: String, init: RequestAuthorizerProps.Builder.() -> Unit): RequestAuthorizer {
    val propsBuilder = RequestAuthorizerProps.builder()
    propsBuilder.init()
    
    return RequestAuthorizer(this, id, propsBuilder.build())
}

fun Construct.cfnClientCertificate(id: String, init: CfnClientCertificateProps.Builder.() -> Unit): CfnClientCertificate {
    val propsBuilder = CfnClientCertificateProps.builder()
    propsBuilder.init()
    
    return CfnClientCertificate(this, id, propsBuilder.build())
}

fun Construct.cfnIntegrationV2(id: String, init: CfnIntegrationV2Props.Builder.() -> Unit): CfnIntegrationV2 {
    val propsBuilder = CfnIntegrationV2Props.builder()
    propsBuilder.init()
    
    return CfnIntegrationV2(this, id, propsBuilder.build())
}

fun Construct.requestValidator(id: String, init: RequestValidatorProps.Builder.() -> Unit): RequestValidator {
    val propsBuilder = RequestValidatorProps.builder()
    propsBuilder.init()
    
    return RequestValidator(this, id, propsBuilder.build())
}

fun Construct.apiKey(id: String, init: ApiKeyProps.Builder.() -> Unit): ApiKey {
    val propsBuilder = ApiKeyProps.builder()
    propsBuilder.init()
    
    return ApiKey(this, id, propsBuilder.build())
}

fun Construct.cfnVpcLink(id: String, init: CfnVpcLinkProps.Builder.() -> Unit): CfnVpcLink {
    val propsBuilder = CfnVpcLinkProps.builder()
    propsBuilder.init()
    
    return CfnVpcLink(this, id, propsBuilder.build())
}

fun Construct.cfnRouteResponseV2(id: String, init: CfnRouteResponseV2Props.Builder.() -> Unit): CfnRouteResponseV2 {
    val propsBuilder = CfnRouteResponseV2Props.builder()
    propsBuilder.init()
    
    return CfnRouteResponseV2(this, id, propsBuilder.build())
}

fun Construct.cfnIntegrationResponseV2(id: String, init: CfnIntegrationResponseV2Props.Builder.() -> Unit): CfnIntegrationResponseV2 {
    val propsBuilder = CfnIntegrationResponseV2Props.builder()
    propsBuilder.init()
    
    return CfnIntegrationResponseV2(this, id, propsBuilder.build())
}

fun Construct.cfnStageV2(id: String, init: CfnStageV2Props.Builder.() -> Unit): CfnStageV2 {
    val propsBuilder = CfnStageV2Props.builder()
    propsBuilder.init()
    
    return CfnStageV2(this, id, propsBuilder.build())
}

fun Construct.cfnApiKey(id: String, init: CfnApiKeyProps.Builder.() -> Unit): CfnApiKey {
    val propsBuilder = CfnApiKeyProps.builder()
    propsBuilder.init()
    
    return CfnApiKey(this, id, propsBuilder.build())
}

fun Construct.deployment(id: String, init: DeploymentProps.Builder.() -> Unit): Deployment {
    val propsBuilder = DeploymentProps.builder()
    propsBuilder.init()
    
    return Deployment(this, id, propsBuilder.build())
}

fun Construct.lambdaRestApi(id: String, init: LambdaRestApiProps.Builder.() -> Unit): LambdaRestApi {
    val propsBuilder = LambdaRestApiProps.builder()
    propsBuilder.init()
    
    return LambdaRestApi(this, id, propsBuilder.build())
}

fun Construct.cfnApiMappingV2(id: String, init: CfnApiMappingV2Props.Builder.() -> Unit): CfnApiMappingV2 {
    val propsBuilder = CfnApiMappingV2Props.builder()
    propsBuilder.init()
    
    return CfnApiMappingV2(this, id, propsBuilder.build())
}

fun Construct.cfnMethod(id: String, init: CfnMethodProps.Builder.() -> Unit): CfnMethod {
    val propsBuilder = CfnMethodProps.builder()
    propsBuilder.init()
    
    return CfnMethod(this, id, propsBuilder.build())
}

fun Construct.cfnAuthorizerV2(id: String, init: CfnAuthorizerV2Props.Builder.() -> Unit): CfnAuthorizerV2 {
    val propsBuilder = CfnAuthorizerV2Props.builder()
    propsBuilder.init()
    
    return CfnAuthorizerV2(this, id, propsBuilder.build())
}

fun Construct.restApi(id: String, init: RestApiProps.Builder.() -> Unit): RestApi {
    val propsBuilder = RestApiProps.builder()
    propsBuilder.init()
    
    return RestApi(this, id, propsBuilder.build())
}

fun Construct.cfnApiV2(id: String, init: CfnApiV2Props.Builder.() -> Unit): CfnApiV2 {
    val propsBuilder = CfnApiV2Props.builder()
    propsBuilder.init()
    
    return CfnApiV2(this, id, propsBuilder.build())
}

fun Construct.cfnAuthorizer(id: String, init: CfnAuthorizerProps.Builder.() -> Unit): CfnAuthorizer {
    val propsBuilder = CfnAuthorizerProps.builder()
    propsBuilder.init()
    
    return CfnAuthorizer(this, id, propsBuilder.build())
}

fun Construct.cfnRouteV2(id: String, init: CfnRouteV2Props.Builder.() -> Unit): CfnRouteV2 {
    val propsBuilder = CfnRouteV2Props.builder()
    propsBuilder.init()
    
    return CfnRouteV2(this, id, propsBuilder.build())
}

fun Construct.resource(id: String, init: ResourceProps.Builder.() -> Unit): Resource {
    val propsBuilder = ResourceProps.builder()
    propsBuilder.init()
    
    return Resource(this, id, propsBuilder.build())
}

fun Construct.cfnRequestValidator(id: String, init: CfnRequestValidatorProps.Builder.() -> Unit): CfnRequestValidator {
    val propsBuilder = CfnRequestValidatorProps.builder()
    propsBuilder.init()
    
    return CfnRequestValidator(this, id, propsBuilder.build())
}

fun Construct.proxyResource(id: String, init: ProxyResourceProps.Builder.() -> Unit): ProxyResource {
    val propsBuilder = ProxyResourceProps.builder()
    propsBuilder.init()
    
    return ProxyResource(this, id, propsBuilder.build())
}

