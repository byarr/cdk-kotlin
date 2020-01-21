
dependencies {
    api(project(":core"))
    api(project(":lambda"))
    api(project(":sqs"))
    api(project(":sns"))
    api(project(":dynamodb"))
    api("software.amazon.awscdk:lambda-event-sources")
}
