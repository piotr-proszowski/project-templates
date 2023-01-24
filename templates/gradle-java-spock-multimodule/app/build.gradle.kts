plugins {
    kotlin("jvm") version "1.6.21"
    id("pl.allegro.tech.build.axion-release").version("1.14.0")
    id("com.coditory.integration-test").version("1.4.2")
    id("application")
    id("groovy")
}

application {
    mainClass.set("dev.proszowski.projectemplate.Main")
}

dependencies {
    implementation("org.slf4j:slf4j-api:2.0.6")
    implementation("ch.qos.logback:logback-classic:1.4.5")
    annotationProcessor("org.projectlombok:lombok:1.18.24")

    implementation("org.projectlombok:lombok:1.18.24")

    testImplementation("org.apache.groovy:groovy:4.0.7")
    testImplementation("net.bytebuddy:byte-buddy:1.12.22")
    testImplementation("org.objenesis:objenesis:3.3")
    testImplementation("org.spockframework:spock-core:2.3-groovy-4.0")
}

tasks {
    withType<Test> {
        useJUnitPlatform()
        testLogging {
            exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
            events("passed", "skipped", "failed")
        }
    }
}