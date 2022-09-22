import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
    id("pl.allegro.tech.build.axion-release").version("1.14.0")
    id("com.coditory.integration-test").version("1.4.2")
    id("application")
}

application {
    mainClass.set("dev.proszowski.projectemplate.Main")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    testImplementation("io.kotest:kotest-runner-junit5:5.4.1")
}
