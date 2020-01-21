package com.brianyarr.cdk.serverless

import com.brianyarr.cdk.core.app
import com.brianyarr.cdk.core.stack
import com.brianyarr.cdk.dynamodb.table
import software.amazon.awscdk.services.dynamodb.Attribute
import software.amazon.awscdk.services.dynamodb.AttributeType
import software.amazon.awscdk.services.lambda.Code
import software.amazon.awscdk.services.lambda.Runtime

object Example {


    val application = app {
        stack("ID") {
            serverless("ID") {
                lambdaSettings {
                    code(Code.fromInline("some code"))
                    runtime(Runtime.NODEJS_10_X)
                    memorySize(1024)
                }

                val myTable = table("myTable") {
                    tableName("MyTable")
                    partitionKey(Attribute.builder().name("k").type(AttributeType.NUMBER).build())
                }

                val doStuff = function("doStuff") {
                    handler("com.brianyarr.Blah")
                }

                myTable.grantReadData(doStuff)
            }
        }
    }


    @JvmStatic
    fun main(args: Array<String>) {
        val synth = application.synth()
        println(synth.getStackByName("ID").template)
        println(synth.directory)
    }
}