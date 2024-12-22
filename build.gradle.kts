plugins {
    kotlin("jvm") version "2.0.10"
}

group = "org.akirepko"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.google.code.gson:gson:2.10.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7")
}

tasks.test {
    useJUnitPlatform()
}