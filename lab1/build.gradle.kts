plugins {
    id("kotlin")
    kotlin("jvm") version "1.9.0"
}

group = "me.michigang1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.9.10")
}

tasks.test {
    useJUnitPlatform()
}
