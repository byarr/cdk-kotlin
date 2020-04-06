package com.brianyarr.cdk.appsync

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.appsync.CfnApiCache
import software.amazon.awscdk.services.appsync.CfnApiCacheProps
import software.amazon.awscdk.services.appsync.CfnGraphQLApi
import software.amazon.awscdk.services.appsync.CfnGraphQLApiProps
import software.amazon.awscdk.services.appsync.LambdaDataSource
import software.amazon.awscdk.services.appsync.LambdaDataSourceProps
import software.amazon.awscdk.services.appsync.CfnApiKey
import software.amazon.awscdk.services.appsync.CfnApiKeyProps
import software.amazon.awscdk.services.appsync.Resolver
import software.amazon.awscdk.services.appsync.ResolverProps
import software.amazon.awscdk.services.appsync.DynamoDbDataSource
import software.amazon.awscdk.services.appsync.DynamoDbDataSourceProps
import software.amazon.awscdk.services.appsync.GraphQLApi
import software.amazon.awscdk.services.appsync.GraphQLApiProps
import software.amazon.awscdk.services.appsync.CfnFunctionConfiguration
import software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps
import software.amazon.awscdk.services.appsync.CfnGraphQLSchema
import software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps
import software.amazon.awscdk.services.appsync.CfnResolver
import software.amazon.awscdk.services.appsync.CfnResolverProps
import software.amazon.awscdk.services.appsync.CfnDataSource
import software.amazon.awscdk.services.appsync.CfnDataSourceProps

fun Construct.cfnApiCache(id: String, init: CfnApiCacheProps.Builder.() -> Unit): CfnApiCache {
    val propsBuilder = CfnApiCacheProps.builder()
    propsBuilder.init()
    
    return CfnApiCache(this, id, propsBuilder.build())
}

fun Construct.cfnGraphQLApi(id: String, init: CfnGraphQLApiProps.Builder.() -> Unit): CfnGraphQLApi {
    val propsBuilder = CfnGraphQLApiProps.builder()
    propsBuilder.init()
    
    return CfnGraphQLApi(this, id, propsBuilder.build())
}

fun Construct.lambdaDataSource(id: String, init: LambdaDataSourceProps.Builder.() -> Unit): LambdaDataSource {
    val propsBuilder = LambdaDataSourceProps.builder()
    propsBuilder.init()
    
    return LambdaDataSource(this, id, propsBuilder.build())
}

fun Construct.cfnApiKey(id: String, init: CfnApiKeyProps.Builder.() -> Unit): CfnApiKey {
    val propsBuilder = CfnApiKeyProps.builder()
    propsBuilder.init()
    
    return CfnApiKey(this, id, propsBuilder.build())
}

fun Construct.resolver(id: String, init: ResolverProps.Builder.() -> Unit): Resolver {
    val propsBuilder = ResolverProps.builder()
    propsBuilder.init()
    
    return Resolver(this, id, propsBuilder.build())
}

fun Construct.dynamoDbDataSource(id: String, init: DynamoDbDataSourceProps.Builder.() -> Unit): DynamoDbDataSource {
    val propsBuilder = DynamoDbDataSourceProps.builder()
    propsBuilder.init()
    
    return DynamoDbDataSource(this, id, propsBuilder.build())
}

fun Construct.graphQLApi(id: String, init: GraphQLApiProps.Builder.() -> Unit): GraphQLApi {
    val propsBuilder = GraphQLApiProps.builder()
    propsBuilder.init()
    
    return GraphQLApi(this, id, propsBuilder.build())
}

fun Construct.cfnFunctionConfiguration(id: String, init: CfnFunctionConfigurationProps.Builder.() -> Unit): CfnFunctionConfiguration {
    val propsBuilder = CfnFunctionConfigurationProps.builder()
    propsBuilder.init()
    
    return CfnFunctionConfiguration(this, id, propsBuilder.build())
}

fun Construct.cfnGraphQLSchema(id: String, init: CfnGraphQLSchemaProps.Builder.() -> Unit): CfnGraphQLSchema {
    val propsBuilder = CfnGraphQLSchemaProps.builder()
    propsBuilder.init()
    
    return CfnGraphQLSchema(this, id, propsBuilder.build())
}

fun Construct.cfnResolver(id: String, init: CfnResolverProps.Builder.() -> Unit): CfnResolver {
    val propsBuilder = CfnResolverProps.builder()
    propsBuilder.init()
    
    return CfnResolver(this, id, propsBuilder.build())
}

fun Construct.cfnDataSource(id: String, init: CfnDataSourceProps.Builder.() -> Unit): CfnDataSource {
    val propsBuilder = CfnDataSourceProps.builder()
    propsBuilder.init()
    
    return CfnDataSource(this, id, propsBuilder.build())
}

