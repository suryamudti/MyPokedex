package com.smile.testpokedex

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

/**
 * Created by suryamudtisalmat on 31,October,2021
 */

@HiltAndroidApp
class MyPokedexApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}