plugins {
    id("com.android.application")
    kotlin("android")
    id("dagger.hilt.android.plugin")
    id(KotlinPlugins.kapt)
    kotlin(KotlinPlugins.serialization) version Kotlin.version
    id(KotlinPlugins.ksp) version KotlinPlugins.ksp_version
}

android {
    compileSdk = Android.compileSdk
    buildToolsVersion = Android.buildTools

    defaultConfig {
        applicationId = Android.appId
        minSdk = Android.minSdk
        targetSdk = Android.targetSdk
        versionCode = Android.versionCode
        versionName = Android.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Compose.compilerVersion
    }

    packagingOptions {
        resources.excludes.add("META-INF/AL2.0")
        resources.excludes.add("META-INF/LGPL2.1")
    }
}
dependencies {

    implementation(project(Modules.core))
    implementation(AndroidX.appCompat)
    implementation(AndroidX.coreKtx)
    implementation(AndroidX.lifecycleRuntimeKtx)
    implementation(AndroidX.composeMaterial3)

    //room
    implementation(AndroidX.room)
    implementation(AndroidX.roomKtx)
    ksp(AndroidX.roomCompiler)

    //hilt
    implementation(AndroidX.hiltAndroid)
    implementation(AndroidX.hiltNavigationCompose)
    kapt(AndroidX.hiltCompiler)

    implementation(Compose.activity)
    implementation(Compose.material)
    implementation(Compose.material3)
    implementation(Compose.viewModelCompose)
    implementation(Compose.navigation)

    implementation(Compose.ui)
    debugImplementation(Compose.tooling)
    implementation(Compose.toolingPreview)

    implementation(Google.material)
    implementation(Google.materialIcons)

    implementation(Coil.coil)

    implementation(platform(Square.okHttpBom))
    implementation(Square.retrofit)
    implementation(Square.okHttpClient)
    implementation(Square.okHttpLogging)
    implementation(Kotlinx.serializationJson)
    implementation(Kotlinx.serializationConverter)
    implementation(Meta.Stetho)
    implementation(Meta.StethoOkhttpInterceptor)

    implementation(Kotlinx.coroutinesCore)
    implementation(Kotlinx.coroutinesAndroid)

    //testing
    testImplementation(Testing.androidXCore)
    testImplementation(Testing.androidxJunit4)
    testImplementation(Testing.junit4)
    testImplementation(Testing.androidxTruth)
    testImplementation(AndroidX.roomTesting)
    testImplementation(Testing.robolectric)
    testImplementation(Testing.instantTaskExecutorRule)
    testImplementation(Kotlinx.coroutineTesting)
    testImplementation(Testing.mockK)
}