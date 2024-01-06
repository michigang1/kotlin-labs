import org.jetbrains.kotlin.gradle.plugin.KotlinTargetHierarchy.SourceSetTree.Companion.main

plugins {
    id("kotlin")
    kotlin("jvm") version "1.9.0"
    java
}

group = "me.michigang1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.9.10")
}

sourceSets {
    main {
        java.srcDir("src/main/kotlin")
    }
}

tasks.test {
    useJUnitPlatform()
}

tasks.register<JavaExec>("runMain") {
    setMain("AppKt")
    classpath = sourceSets["main"].runtimeClasspath
}
