plugins {
    kotlin("jvm")
}

group = "me.michigang1"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

sourceSets {
    main {
        java.srcDir("src/main/kotlin")
    }
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

tasks.register<JavaExec>("runMain") {
    setMain("AppKt")
    classpath = sourceSets["main"].runtimeClasspath
}
