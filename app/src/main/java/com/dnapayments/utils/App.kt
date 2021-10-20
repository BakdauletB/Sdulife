package com.dnapayments.utils

import android.app.Application
import com.dnapayments.di.appModule
import networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import repoModule
import storageModule

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, networkModule, repoModule, storageModule))
        }
    }
}
