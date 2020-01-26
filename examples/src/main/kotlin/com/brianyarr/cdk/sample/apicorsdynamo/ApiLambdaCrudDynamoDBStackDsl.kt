package com.brianyarr.cdk.sample.apicorsdynamo

import com.brianyarr.cdk.apigateway.restApi
import com.brianyarr.cdk.dynamodb.attribute
import com.brianyarr.cdk.dynamodb.table
import com.brianyarr.cdk.lambda.function
import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.core.RemovalPolicy
import software.amazon.awscdk.core.Stack
import software.amazon.awscdk.services.apigateway.*
import software.amazon.awscdk.services.dynamodb.AttributeType
import software.amazon.awscdk.services.dynamodb.Table
import software.amazon.awscdk.services.lambda.AssetCode
import software.amazon.awscdk.services.lambda.Function
import software.amazon.awscdk.services.lambda.Runtime


class ApiLambdaCrudDynamoDBStackDsl(scope: Construct): Stack(scope, "ApiLambdaCrudDynamoDBExample") {

    val dynamoTable: Table

    init {

        dynamoTable = table("items") {
                tableName("items")
                partitionKey(attribute("itemId", AttributeType.STRING))
                removalPolicy(RemovalPolicy.DESTROY)
            }

            val getOneLambda = lambdaFunction("getOneItemFunction")
            val getAllLambda = lambdaFunction("getAllItemsFunction")
            val createOne = lambdaFunction("createItemFunction")
            val updateOne = lambdaFunction("updateItemFunction")
            val deleteOne = lambdaFunction("deleteItemFunction")

            val api = restApi("itemsApi") {
                restApiName("Items Service")
            }
            val items = api.root.addResource("items")
            items.addMethod("GET", LambdaIntegration(getAllLambda))
            items.addMethod("POST", LambdaIntegration(createOne))
            addCorsOptions(items)

            val singleItem = items.addResource("{id}")
            singleItem.addMethod("GET", LambdaIntegration(getOneLambda))
            singleItem.addMethod("PATCH", LambdaIntegration(updateOne))
            singleItem.addMethod("DELETE", LambdaIntegration(deleteOne))
            addCorsOptions(singleItem)
    }

    private fun lambdaFunction(handler: String): Function {
        val function = function(handler) {
            code(AssetCode("examples/src/main/kotlin"))
            handler(handler)
            runtime(Runtime.NODEJS_10_X)
            environment(mapOf("TABLE_NAME" to dynamoTable.tableName, "PRIMARY_KEY" to "itemId"))
        }
        dynamoTable.grantReadWriteData(function)
        return function
    }

    private fun addCorsOptions(apiResource: IResource) {
        val responseParams = mapOf(
                "method.response.header.Access-Control-Allow-Headers" to "'Content-Type,X-Amz-Date,Authorization,X-Api-Key,X-Amz-Security-Token,X-Amz-User-Agent'",
                "method.response.header.Access-Control-Allow-Origin" to "'*'",
                "method.response.header.Access-Control-Allow-Credentials" to "'false'",
                "method.response.header.Access-Control-Allow-Methods" to "'OPTIONS,GET,PUT,POST,DELETE'"
        )
        apiResource.addMethod("OPTIONS", MockIntegration(IntegrationOptions.builder()
                .integrationResponses(listOf(
                        IntegrationResponse.builder()
                                .statusCode("200")
                                .responseParameters(responseParams)
                                .build()

                ))
                .passthroughBehavior(PassthroughBehavior.NEVER)
                .requestTemplates(mapOf("application/json" to """{"statusCode": 200}"""))
                .build()), MethodOptions.builder()

                .methodResponses(listOf(MethodResponse.builder()
                        .statusCode("200")
                        .responseParameters(responseParams.mapValues { true })
                        .build()))
                .build())
    }
}