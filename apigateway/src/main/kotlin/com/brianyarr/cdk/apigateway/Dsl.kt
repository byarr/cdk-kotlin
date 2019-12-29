package com.brianyarr.cdk.apigateway

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.apigateway.Deployment
import software.amazon.awscdk.services.apigateway.DeploymentProps
import software.amazon.awscdk.services.apigateway.UsagePlan
import software.amazon.awscdk.services.apigateway.UsagePlanProps
import software.amazon.awscdk.services.apigateway.VpcLink
import software.amazon.awscdk.services.apigateway.VpcLinkProps
import software.amazon.awscdk.services.apigateway.BasePathMapping
import software.amazon.awscdk.services.apigateway.BasePathMappingProps
import software.amazon.awscdk.services.apigateway.RestApi
import software.amazon.awscdk.services.apigateway.RestApiProps
import software.amazon.awscdk.services.apigateway.ProxyResource
import software.amazon.awscdk.services.apigateway.ProxyResourceProps
import software.amazon.awscdk.services.apigateway.DomainName
import software.amazon.awscdk.services.apigateway.DomainNameProps
import software.amazon.awscdk.services.apigateway.Method
import software.amazon.awscdk.services.apigateway.MethodProps
import software.amazon.awscdk.services.apigateway.LambdaRestApi
import software.amazon.awscdk.services.apigateway.LambdaRestApiProps
import software.amazon.awscdk.services.apigateway.ApiKey
import software.amazon.awscdk.services.apigateway.ApiKeyProps
import software.amazon.awscdk.services.apigateway.RequestValidator
import software.amazon.awscdk.services.apigateway.RequestValidatorProps
import software.amazon.awscdk.services.apigateway.Model
import software.amazon.awscdk.services.apigateway.ModelProps
import software.amazon.awscdk.services.apigateway.Stage
import software.amazon.awscdk.services.apigateway.StageProps
import software.amazon.awscdk.services.apigateway.Resource
import software.amazon.awscdk.services.apigateway.ResourceProps

fun Construct.deployment(id: String, init: DeploymentProps.Builder.() -> Unit): Deployment {
    val propsBuilder = DeploymentProps.builder()
    propsBuilder.init()
    
    return Deployment(this, id, propsBuilder.build())
}


fun Construct.usagePlan(id: String, init: UsagePlanProps.Builder.() -> Unit): UsagePlan {
    val propsBuilder = UsagePlanProps.builder()
    propsBuilder.init()
    
    return UsagePlan(this, id, propsBuilder.build())
}


fun Construct.vpcLink(id: String, init: VpcLinkProps.Builder.() -> Unit): VpcLink {
    val propsBuilder = VpcLinkProps.builder()
    propsBuilder.init()
    
    return VpcLink(this, id, propsBuilder.build())
}


fun Construct.basePathMapping(id: String, init: BasePathMappingProps.Builder.() -> Unit): BasePathMapping {
    val propsBuilder = BasePathMappingProps.builder()
    propsBuilder.init()
    
    return BasePathMapping(this, id, propsBuilder.build())
}


fun Construct.restApi(id: String, init: RestApiProps.Builder.() -> Unit): RestApi {
    val propsBuilder = RestApiProps.builder()
    propsBuilder.init()
    
    return RestApi(this, id, propsBuilder.build())
}


fun Construct.proxyResource(id: String, init: ProxyResourceProps.Builder.() -> Unit): ProxyResource {
    val propsBuilder = ProxyResourceProps.builder()
    propsBuilder.init()
    
    return ProxyResource(this, id, propsBuilder.build())
}


fun Construct.domainName(id: String, init: DomainNameProps.Builder.() -> Unit): DomainName {
    val propsBuilder = DomainNameProps.builder()
    propsBuilder.init()
    
    return DomainName(this, id, propsBuilder.build())
}


fun Construct.method(id: String, init: MethodProps.Builder.() -> Unit): Method {
    val propsBuilder = MethodProps.builder()
    propsBuilder.init()
    
    return Method(this, id, propsBuilder.build())
}


fun Construct.lambdaRestApi(id: String, init: LambdaRestApiProps.Builder.() -> Unit): LambdaRestApi {
    val propsBuilder = LambdaRestApiProps.builder()
    propsBuilder.init()
    
    return LambdaRestApi(this, id, propsBuilder.build())
}


fun Construct.apiKey(id: String, init: ApiKeyProps.Builder.() -> Unit): ApiKey {
    val propsBuilder = ApiKeyProps.builder()
    propsBuilder.init()
    
    return ApiKey(this, id, propsBuilder.build())
}


fun Construct.requestValidator(id: String, init: RequestValidatorProps.Builder.() -> Unit): RequestValidator {
    val propsBuilder = RequestValidatorProps.builder()
    propsBuilder.init()
    
    return RequestValidator(this, id, propsBuilder.build())
}


fun Construct.model(id: String, init: ModelProps.Builder.() -> Unit): Model {
    val propsBuilder = ModelProps.builder()
    propsBuilder.init()
    
    return Model(this, id, propsBuilder.build())
}


fun Construct.stage(id: String, init: StageProps.Builder.() -> Unit): Stage {
    val propsBuilder = StageProps.builder()
    propsBuilder.init()
    
    return Stage(this, id, propsBuilder.build())
}


fun Construct.resource(id: String, init: ResourceProps.Builder.() -> Unit): Resource {
    val propsBuilder = ResourceProps.builder()
    propsBuilder.init()
    
    return Resource(this, id, propsBuilder.build())
}


