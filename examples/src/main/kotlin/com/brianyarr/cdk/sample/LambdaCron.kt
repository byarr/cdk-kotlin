package com.brianyarr.cdk.sample

import com.brianyarr.cdk.core.app
import com.brianyarr.cdk.core.stack
import com.brianyarr.cdk.events.rule
import com.brianyarr.cdk.lambda.function
import com.brianyarr.cdk.lambda.singletonFunction
import software.amazon.awscdk.core.Duration
import software.amazon.awscdk.services.events.Schedule
import software.amazon.awscdk.services.events.targets.LambdaFunction
import software.amazon.awscdk.services.lambda.Code
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.lambda.Runtime
import java.util.*

val app = app {
    stack("cdk-lambda-cron-example") {
        val lambdaFunction = singletonFunction("cdk-lambda-cron") {
            description("Lambda which prints \"I'm running\"")
            code(Code.fromInline("def main(event, context):\n" + "    print(\"I'm running!\")\n"))
            handler("index.main")
            timeout(Duration.seconds(300))
            runtime(Runtime.PYTHON_2_7)
            uuid(UUID.randomUUID().toString())
        }

        val rule = rule("cdk-lambda-cron-rule") {
            description("Run every day at 6PM UTC")
            schedule(Schedule.expression("cron(0 18 ? * MON-FRI *)"))
        }
        rule.addTarget(LambdaFunction(lambdaFunction))

    }
}