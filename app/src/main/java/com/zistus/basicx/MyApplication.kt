package com.zistus.basicx

import android.app.Application
import com.zistus.basicx.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication: Application(){
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@MyApplication)
            modules(listOf(repositoryModule, viewModelModule, retrofitModule, apiModule, roomModule))
        }
    }
}