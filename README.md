# CDK-Kotlin

Using the nice DSL ability of Kotlin with AWS CDK to do IaC with some actual code and not YAML.

## Motivation

CDK is pretty cool. Generates loads of cloudformation using small bits of actual read honest to goodness code. 
Taking an example provided by AWS (https://github.com/aws-samples/aws-cdk-examples/blob/master/typescript/api-cors-lambda-crud-dynamodb/index.ts) 134 little lines of typescript 
(about the same in kotlin com/brianyarr/cdk/sample/apicorsdynamo/ApiLambdaCrudDynamoDBStack.kt) generates 1500 lines of cloudformation. 
Now a lot of cloudformation lines are a bit pointless, some more compact formatting (e.g. of the JOINs) would take that down a fair bit.
Nether the less it does contain some 40 resources!

## Organisation

- `gen` contains the code that autogenerates a module per CDK service
- `examples` has some examples
- `serverless` has my homage to the serverless framework
- the rest of the modules are generated automagically and 

## Building

The auto-generation of code is essentially a manual stage at the moment. TODO look into how to do this at build time with gradle.

## Usage

By using Kotlin extension functions we can create CDK apps with a minimum of boiler plate, e.g.:
```kotlin
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
```

One of the nice things about this is that we aren't defining a lot of new types and functionality. Just using the existing AWS CDK in a more fluent way.

## TODO

Not all `Builder` things are resources. Can we generate code for those classes.
Dynamodb Attributes have two fields, doesnt need a builder.
`LambdaIntegration` (other integrations are available) has options which have a builder, do they need DSL