plugins {
    kotlin("jvm") version "1.9.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

application {
    mainClass = "ExecuteKt"
}
