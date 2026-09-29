plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.plugin.compose")
}
androidComponents {
    onVariants { variant ->
        variant.outputs.forEach { output ->
            if (output is com.android.build.api.variant.impl.VariantOutputImpl) {
                output.outputFileName =
                    "ForceAppSettings_" + android.defaultConfig.versionName + "_" + variant.name + ".apk"
            }
        }
    }
}
android {
    namespace = "com.ownapp.forceAppSettings"
    compileSdk = 37 // 可以根据需要修改

    defaultConfig {
        applicationId = "com.ownapp.forceAppSettings"
        minSdk { version = release(31) }
        targetSdk { version = release(37) }
        versionCode = 2
        versionName = "1.1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_25
        targetCompatibility = JavaVersion.VERSION_25
    }

    lint {
        checkReleaseBuilds = false
    }

    dependenciesInfo.includeInApk = false
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(platform("androidx.compose:compose-bom:2026.02.01"))
    implementation("androidx.activity:activity-compose:1.13.0")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.core:core-ktx:1.19.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.9.4")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    compileOnly("androidx.annotation:annotation:1.10.0")
    compileOnly("io.github.libxposed:api:102.0.0")// 请参考 libxposed 文档查看最新版本
    debugImplementation("androidx.compose.ui:ui-test-manifest")
    debugImplementation("androidx.compose.ui:ui-tooling")
    implementation("io.coil-kt.coil3:coil-compose:3.6.3")
    implementation("io.coil-kt.coil3:coil-core:3.6.3")
    implementation("androidx.compose.material:material-icons-core:1.7.8")
    implementation("androidx.compose.material:material-icons-extended-android:1.7.8")
    implementation("io.github.libxposed:service:102.0.0")
//    compileOnly project(":libxposed-compat")
}
