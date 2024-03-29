pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "YEGithubUserCompose"
include(":app")
include(":data")
include(":data:network")
include(":data:database")
include(":feature")
include(":feature:search")
include(":core")
include(":core:model")
include(":core:designsystem")
include(":data:search")
