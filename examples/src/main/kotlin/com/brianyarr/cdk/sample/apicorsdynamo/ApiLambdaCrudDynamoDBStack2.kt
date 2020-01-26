package com.brianyarr.cdk.sample.apicorsdynamo

import software.amazon.awscdk.core.*
import software.amazon.awscdk.services.apigateway.*
import software.amazon.awscdk.services.apigateway.IResource
import software.amazon.awscdk.services.dynamodb.Attribute
import software.amazon.awscdk.services.dynamodb.AttributeType
import software.amazon.awscdk.services.dynamodb.Table
import software.amazon.awscdk.services.dynamodb.TableProps
import software.amazon.awscdk.services.lambda.AssetCode
import software.amazon.awscdk.services.lambda.Function
import software.amazon.awscdk.services.lambda.FunctionProps
import software.amazon.awscdk.services.lambda.Runtime

class ApiLambdaCrudDynamoDBStack2(scope: Construct, id: String) : Stack(scope, id) {

    private val dynamoTable: Table

    init {
        dynamoTable = Table(this, "items", TableProps.builder()
                .tableName("items")
                .partitionKey(Attribute.builder()
                        .name(ITEM_ID)
                        .type(AttributeType.STRING).build())
                .removalPolicy(RemovalPolicy.DESTROY).build())


        val getOneLambda = lambdaFunction("get-one.handler")
        val getAllLambda = lambdaFunction("get-all.handler")
        val createOne = lambdaFunction("create.handler")
        val updateOne = lambdaFunction("update-one.handler")
        val deleteOne = lambdaFunction("delete-one.handler")

        dynamoTable.grantReadWriteData(getAllLambda)
        dynamoTable.grantReadWriteData(getOneLambda)
        dynamoTable.grantReadWriteData(createOne)
        dynamoTable.grantReadWriteData(updateOne)
        dynamoTable.grantReadWriteData(deleteOne)


        val api = RestApi(this, "itemsApi", RestApiProps.builder().restApiName("Items Service").build())

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
        return Function(this, handler, FunctionProps.builder()
                .code(AssetCode("examples/src/main/kotlin"))
                .handler(handler)
                .runtime(Runtime.NODEJS_10_X)
                .environment(mapOf("TABLE_NAME" to dynamoTable.tableName, "PRIMARY_KEY" to ITEM_ID))
                .build())
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

    companion object {
        private const val ITEM_ID: String = "itemId"

        @JvmStatic
        fun main(args: Array<String>) {
            val app = App()
            ApiLambdaCrudDynamoDBStack2(app, "ApiLambdaCrudDynamoDBExample2")
            val synth = app.synth()
            println(synth.directory)
        }
    }

}
