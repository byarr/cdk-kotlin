
dependencies {
    implementation(project(":core"))
    implementation(project(":events"))
    implementation(project(":lambda"))
    implementation(project(":dynamodb"))
    implementation(project(":apigateway"))
    implementation("software.amazon.awscdk:events-targets")
}
