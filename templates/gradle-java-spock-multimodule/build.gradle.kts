import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
}

group = "dev.proszowski"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_19

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    tasks {
        withType<KotlinCompile> {
            kotlinOptions {
                freeCompilerArgs = listOf("-Xjsr305=strict")
                jvmTarget = "19"
            }
        }

        withType<Test> {
            useJUnitPlatform()
        }
    }
}

