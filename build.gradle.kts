plugins {
    kotlin("js") version "1.6.10"
}

group = "me.valentinegb"
version = "0.2.0"

repositories {
    mavenCentral()
}



kotlin {
    js(IR) {
        moduleName = "index"
        binaries.executable()
        nodejs {

        }
    }
}