object ApplicationId {
    val application_id = "com.zistus.basicx"
}

object Releases {
    val version_code = 7
    val version_name = " alpha 1.4.1"
}

object Modules {
    val domain = ":domain"
}

object SDKVersions {
    val min_sdk = 21
    val target_sdk = 28
    var compile_sdk = 28
}


object Versions {
    val kotlin = "1.3.30"
    val gradle = "3.2.1"
    val realm = "5.3.0"
    val retrofit = "2.4.0"
    val retrofit_logger = "3.10.0"
    val android_arch = "1.1.1"
    val lifecycle_version = "2.1.0"
    val navigation_architecture = "2.0.0"

    val koin_version = "2.0.1"
    val nav_verison = "2.1.0"

    val support = "1.1.0"
    val lagacy = "1.0.0"
    val core = "1.1.0"
    val design = "1.0.0-rc01"
    val constrainst_layout = "1.1.3"
    val appcompat = "1.1.0"

    val lottie = "2.5.1"
    val glide = "4.6.1"
    val rx_android = "2.1.1"
    val rx_java = "2.2.15"
    val rx_kotlin = "2.3.0"

    val calligraphy = "2.3.0"
    val pager_indicator = "1.0.3"
    val biometric_version = "1.0.0"
    val espresso = "3.1.0"
    val espresso_contrib = "3.1.0"
    val junit = "4.12"
    val mockito = "2.13.0"
    val mockito_core = "2.28.2"
    val support_test = "1.0.2"
    val robo_electric = "1.0.0"

}

object ClassPaths {
    val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val kotlin_ext = "org.jetbrains.kotlin:kotlin-android-extensions:${Versions.kotlin}"
    val gradle_build = "com.android.tools.build:gradle:${Versions.gradle}"
    val realm = "io.realm:realm-gradle-plugin:${Versions.realm}"
}

object Deps {
    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
    val kotlin_jdk = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofit_gson_converter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    val retrofix_rxjava2 = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    val retrofit_http_logger = "com.squareup.okhttp3:logging-interceptor:${Versions.retrofit_logger}"

    val room = "android.arch.persistence.room:runtime:${Versions.android_arch}"
    val lifecycle_runtime = "android.arch.lifecycle:runtime:${Versions.lifecycle_version}"
    val lifecycle_ext = "android.arch.lifecycle:extensions:${Versions.lifecycle_version}"
    val lifecycle_compiler = "android.arch.lifecycle:compiler:${Versions.lifecycle_version}"


    val lottie = "com.airbnb.android:lottie:${Versions.lottie}"
    var glide = "com.github.bumptech.glide:glide:${Versions.glide}"

    val rx_android = "io.reactivex.rxjava2:rxandroid:${Versions.rx_android}"
    val rx_java = "io.reactivex.rxjava2:rxjava:${Versions.rx_java}"
    val rx_bind = "com.jakewharton.rxbinding:rxbinding:0.4.0"
    val rx_kotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rx_kotlin}"

    val calligraphy = "uk.co.chrisjenx:calligraphy:${Versions.calligraphy}"
    val pager_indicator = "com.romandanylyk:pageindicatorview:${Versions.pager_indicator}"
    val biometric = "androidx.biometric:biometric:${Versions.biometric_version}"

    val koin = "org.koin:koin-android:${Versions.koin_version}"
    val koin_scope = "org.koin:koin-android-scope:${Versions.koin_version}"
    val koin_view_model = "org.koin:koin-android-viewmodel:${Versions.koin_version}"

    val nav_fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.nav_verison}"
    val navigation = "androidx.navigation:navigation-ui-ktx:${Versions.nav_verison}"
}


object SupportLibraries {
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    val supportLagacy = "androidx.legacy:legacy-support-v4:${Versions.lagacy}"
    val core = "androidx.core:core-ktx:${Versions.core}"
    val design = "com.google.android.material:material:${Versions.design}"
    val cardview= "androidx.cardview:cardview:${Versions.support}"
    val recyclerview = "androidx.recyclerview:recyclerview:${Versions.support}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constrainst_layout}"
}

object TestDeps {
    val junit = "junit:junit:${Versions.junit}"
    val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    val espresso_intents = "androidx.test.espresso:espresso-intents:${Versions.espresso}"
    val espresso_contrib = "androidx.test.espresso:espresso-contrib:${Versions.espresso_contrib}"
    val mocito_core = "org.mockito:mockito-core:${Versions.mockito_core}"
    val mockito = "org.mockito:mockito-inline:${Versions.mockito}"
    val arch_testing = "android.arch.core:core-testing:${Versions.android_arch}"
    val support_test = "androidx.test:runner:${Versions.support_test}"
    val robo_electric = "androidx.test:core:${Versions.robo_electric}"
}