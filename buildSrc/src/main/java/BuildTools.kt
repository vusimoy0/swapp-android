object BuildTools {

    private const val androidBuildToolsVersion = "7.2.2"
    private const val gradleVersionsPluginVersion = "0.42.0"

    const val androidBuildTools = "com.android.tools.build:gradle:$androidBuildToolsVersion"

    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"

    const val gradleVersionsPlugin = "com.github.ben-manes:gradle-versions-plugin:${gradleVersionsPluginVersion}"

    const val hiltAndroid = "com.google.dagger:hilt-android-gradle-plugin:${AndroidX.hilt_version}"
}