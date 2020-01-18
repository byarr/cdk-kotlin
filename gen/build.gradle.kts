import com.brianyarr.cdk.gen.addCdkDeps

addCdkDeps("software.amazon.awscdk", "1.19.0")

dependencies {
    implementation("com.beust:klaxon:5.0.1")
    implementation("org.reflections:reflections:0.9.11")
    implementation("software.amazon.awscdk:core")

}
