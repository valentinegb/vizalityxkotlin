plugins {
    kotlin("js") version "1.6.10"
}

group = "me.valentinegb"
version = "0.3.0-alpha"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:17.0.2-pre.240-kotlin-1.5.30")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:17.0.2-pre.240-kotlin-1.5.30")
}

kotlin {
    js(IR) {
        moduleName = "index"
        binaries.executable()
        nodejs {

        }
    }
}