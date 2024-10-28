plugins {
    kotlin("jvm") version "1.9.25"
    kotlin("plugin.spring") version "1.9.25"
    id("org.springframework.boot") version "3.3.5"
    id("io.spring.dependency-management") version "1.1.6"
    kotlin("plugin.jpa") version "1.9.25"
}

group = "io.rendez"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    //implementation
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.3.5")
    implementation("org.springframework.boot:spring-boot-starter-security:3.3.5")
    implementation("org.springframework.boot:spring-boot-starter-web:3.3.5")
    implementation("org.springframework.boot:spring-boot-starter:3.3.5")
    implementation("org.jetbrains.kotlin:kotlin-reflect:2.0.21")
    implementation("ch.qos.logback.contrib:logback-jackson:0.1.5")
    implementation("net.logstash.logback:logstash-logback-encoder:8.0")

    //runtimeOnly
    runtimeOnly("com.h2database:h2:2.3.232")
    runtimeOnly("org.postgresql:postgresql:42.7.4")

    //compileOnly
    compileOnly("org.projectlombok:lombok:1.18.34")

    //developmentOnly
    developmentOnly("org.springframework.boot:spring-boot-devtools:3.3.5")

    //testImplementation
    testImplementation("org.springframework.boot:spring-boot-starter-test:3.3.5")
    testImplementation("org.xmlunit:xmlunit-core:2.10.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:2.0.21")
    testImplementation("org.springframework.security:spring-security-test:6.3.4")

    //testRuntimeOnly
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.11.3")

    //annotationProcessor
    annotationProcessor("org.projectlombok:lombok:1.18.34")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

allOpen {
    annotation("jakarta.persistence.Entity")
    annotation("jakarta.persistence.MappedSuperclass")
    annotation("jakarta.persistence.Embeddable")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
