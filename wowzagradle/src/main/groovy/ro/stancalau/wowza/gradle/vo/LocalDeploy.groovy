package ro.stancalau.wowza.gradle.vo

class LocalDeploy {
    String name
    String applicationName
    String configurationFile

    LocalDeploy(String name) {
        this.name = name
    }
}