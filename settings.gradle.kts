import de.fayard.refreshVersions.bootstrapRefreshVersions

rootProject.buildFileName = "build.gradle.kts"
rootProject.name = "Showcase"

include(":app", ":common")

include(
    ":features",
    ":features:rank_board",
    ":features:home_list",
    ":features:chat"
)

include(
    ":data_source",
    ":data_source:bad_char_data_source",
    ":data_source:rank_data_source",
    ":data_source:message_data_source"
)

buildscript {
    repositories { gradlePluginPortal() }
    dependencies.classpath("de.fayard.refreshVersions:refreshVersions:0.9.7")
}

bootstrapRefreshVersions()