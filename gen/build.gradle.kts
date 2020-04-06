import com.brianyarr.cdk.gen.addCdkDeps

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.41"
    application
}

repositories {
    jcenter()
}

val version = File(rootDir.parentFile, "cdk.version").readText().trim()
addCdkDeps("software.amazon.awscdk", version)

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.beust:klaxon:5.0.1")
    implementation("org.reflections:reflections:0.9.11")
    implementation("software.amazon.awscdk:core")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

application {
    mainClassName = "com.brianyarr.cdk.gen.GenCodeKt"
}