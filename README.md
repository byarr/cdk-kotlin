# CDK-Kotlin

Using the nice DSL ability of Kotlin with AWS CDK to do IaC with some actual code and not YAML.

## Organisation

- `gen` contains the code that autogenerates a module per CDK service
- `examples` has some examples
- `serverless` has my homage to the serverless framework
- the rest of the modules are generated automagically and 

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