plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.parcelize)
    kotlin("kapt")
//    id("kotlin-kapt")
//    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.tejamohite.newspaper"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.tejamohite.newspaper"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}


dependencies {


    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3.android)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    implementation(libs.androidx.runtime.livedata)
    implementation("androidx.core:core-ktx:1.9.0")
            implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")
            implementation("androidx.activity:activity-compose:1.6.1")
            implementation("androidx.compose.ui:ui:1.4.3")
            implementation("androidx.compose.material:material:1.4.3")
            implementation("androidx.navigation:navigation-compose:2.5.3")
            implementation("com.squareup.retrofit2:retrofit:2.9.0")
            implementation("com.squareup.retrofit2:converter-gson:2.9.0")
            implementation("com.squareup.okhttp3:logging-interceptor:4.10.0")
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")


}