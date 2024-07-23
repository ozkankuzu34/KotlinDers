// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript{
    dependencies {
        classpath(libs.androidx.navigation.safe.args.gradle.plugin)
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.51")
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    id("com.google.dagger.hilt.android") version "2.51" apply false
}