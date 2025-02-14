// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        maven { url = uri("https://plugins.gradle.org/m2/") }
        google()
        jcenter()
    }
    dependencies {
        classpath(Libs.android.gradle)
        classpath(Libs.kotlin.gradle)
        classpath(Libs.thirdParty.ktlint)
        classpath(Libs.navigation.safeArgs)
        classpath(Libs.google.ossLicenses)
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

subprojects {
    apply(plugin = "org.jlleitschuh.gradle.ktlint")
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
}