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

class ApiLambdaCrudDynamoDBStack(scope: Construct, id: String): Stack(scope, id) {

    init {

        val dynamoTable = Table(this, "items", TableProps.builder()
                .tableName("items")
                .partitionKey(Attribute.builder()
                        .name("itemId")
                        .type(AttributeType.STRING).build())
                .removalPolicy(RemovalPolicy.DESTROY).build())

       val getOneLambda = Function(this, "getOneItemFunction", FunctionProps.builder()
               .code(AssetCode("examples/src/main/kotlin"))
               .handler("get-one.handler")
               .runtime(Runtime.NODEJS_10_X)
               .environment(mapOf("TABLE_NAME" to dynamoTable.tableName, "PRIMARY_KEY" to "itemId"))
               .build())

       val getAllLambda = Function(this, "getAllItemsFunction", FunctionProps.builder()
               .code(AssetCode("examples/src/main/kotlin"))
               .handler("get-all.handler")
               .runtime(Runtime.NODEJS_10_X)
               .environment(mapOf("TABLE_NAME" to dynamoTable.tableName, "PRIMARY_KEY" to "itemId"))
               .build())

       val createOne = Function(this, "createItemFunction", FunctionProps.builder()
               .code(AssetCode("examples/src/main/kotlin"))
               .handler("create.handler")
               .runtime(Runtime.NODEJS_10_X)
               .environment(mapOf("TABLE_NAME" to dynamoTable.tableName, "PRIMARY_KEY" to "itemId"))
               .build())

       val updateOne = Function(this, "updateItemFunction", FunctionProps.builder()
               .code(AssetCode("examples/src/main/kotlin"))
               .handler("update-one.handler")
               .runtime(Runtime.NODEJS_10_X)
               .environment(mapOf("TABLE_NAME" to dynamoTable.tableName, "PRIMARY_KEY" to "itemId"))
               .build())

       val deleteOne = Function(this, "deleteItemFunction", FunctionProps.builder()
               .code(AssetCode("examples/src/main/kotlin"))
               .handler("delete-one.handler")
               .runtime(Runtime.NODEJS_10_X)
               .environment(mapOf("TABLE_NAME" to dynamoTable.tableName, "PRIMARY_KEY" to "itemId"))
               .build())

        dynamoTable.grantReadWriteData(getAllLambda)
        dynamoTable.grantReadWriteData(getOneLambda)
        dynamoTable.grantReadWriteData(createOne)
        dynamoTable.grantReadWriteData(updateOne)
        dynamoTable.grantReadWriteData(deleteOne)


        val api = RestApi(this, "itemsApi", RestApiProps.builder().restApiName("Items Service").build())

        val items = api.root.addResource("items")
        val getAllIntegration = LambdaIntegration(getAllLambda)
        items.addMethod("GET", getAllIntegration)

        val createOneIntegration = LambdaIntegration(createOne)
        items.addMethod("POST", createOneIntegration)
        addCorsOptions(items)

        val singleItem = items.addResource("{id}")
        val getOneIntegration = LambdaIntegration(getOneLambda)
        singleItem.addMethod("GET", getOneIntegration)

        val updateOneIntegration = LambdaIntegration(updateOne)
        singleItem.addMethod("PATCH", updateOneIntegration)

        val deleteOneIntegration = LambdaIntegration(deleteOne)
        singleItem.addMethod("DELETE", deleteOneIntegration)
        addCorsOptions(singleItem)
    }

    fun addCorsOptions(apiResource: IResource) {
        apiResource.addMethod("OPTIONS", MockIntegration(IntegrationOptions.builder()
                .integrationResponses(listOf(
                        IntegrationResponse.builder()
                                .statusCode("200")
                                .responseParameters(mapOf(
                                        "method.response.header.Access-Control-Allow-Headers" to "'Content-Type,X-Amz-Date,Authorization,X-Api-Key,X-Amz-Security-Token,X-Amz-User-Agent'",
                                        "method.response.header.Access-Control-Allow-Origin" to "'*'",
                                        "method.response.header.Access-Control-Allow-Credentials" to "'false'",
                                        "method.response.header.Access-Control-Allow-Methods" to "'OPTIONS,GET,PUT,POST,DELETE'"
                                ))
                                .build()

                ))
                .passthroughBehavior(PassthroughBehavior.NEVER)
                .requestTemplates(mapOf("application/json" to """{"statusCode": 200}"""))
                .build()), MethodOptions.builder()

                .methodResponses(listOf(MethodResponse.builder()
                        .statusCode("200")
                        .responseParameters(mapOf(
                                "method.response.header.Access-Control-Allow-Headers" to true,
                                "method.response.header.Access-Control-Allow-Methods" to true,
                                "method.response.header.Access-Control-Allow-Credentials" to true,
                                "method.response.header.Access-Control-Allow-Origin" to true
                        ))
                        .build()))
                .build())
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val app = App(AppProps.builder()
                    .runtimeInfo(true)
                    .treeMetadata(true)
                    .stackTraces(true)
                    .outdir("out").build())
            ApiLambdaCrudDynamoDBStack(app, "ApiLambdaCrudDynamoDBExample")
            app.synth();
        }
    }
}
