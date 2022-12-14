// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    dependencies {
        classpath(BuildTools.androidBuildTools)
        classpath(BuildTools.kotlinGradlePlugin)
        classpath(BuildTools.hiltAndroid)
        classpath(BuildTools.gradleVersionsPlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}