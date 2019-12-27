package com.brianyarr.cdk.lambda

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.core.Stack
import com.brianyarr.cdk.lambda.function
import software.amazon.awscdk.services.lambda.Code
import software.amazon.awscdk.services.lambda.Function
import software.amazon.awscdk.services.lambda.Runtime

private class DslKtTest(scpe: Construct, id: String): Construct(scpe, id) {

    val f1 = function("1") {
        runtime(Runtime.JAVA_11)
        memorySize(128)
        code(Code.fromInline("this wont work!"))
        environment(mapOf("a" to "b"))
    }





}