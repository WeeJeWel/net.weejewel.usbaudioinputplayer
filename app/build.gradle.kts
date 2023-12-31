plugins {
    id("com.android.application")
}

android {
    namespace = "net.weejewel.usbaudioinputplayer"
    compileSdk = 33

    defaultConfig {
        applicationId = "net.weejewel.usbaudioinputplayer"
        minSdk = 28
        targetSdk = 33
        versionCode = 2
        versionName = "1.1"

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.leanback:leanback:1.0.0")
    implementation("com.github.bumptech.glide:glide:4.11.0")
}