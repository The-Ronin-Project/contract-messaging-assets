rootProject.name = "contract-messaging-document-data"

pluginManagement {
    plugins {
        id("com.projectronin.event.contract") version "2.0.0-SNAPSHOT"
    }

    repositories {
        maven {
            url = uri("https://repo.devops.projectronin.io/repository/maven-public/")
        }
        mavenLocal()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        maven {
            url = uri("https://repo.devops.projectronin.io/repository/maven-public/")
        }
        mavenLocal()
        gradlePluginPortal()
    }
}
