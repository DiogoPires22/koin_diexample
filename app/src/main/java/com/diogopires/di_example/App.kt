package com.diogopires.di_example

import android.app.Application
import com.diogopires.di_example.main.ModulesInit
import org.koin.standalone.StandAloneContext.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(listOf(ModulesInit))
    }
}