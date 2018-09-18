package com.diogopires.di_example.main

import com.diogopires.di_example.data.Repository
import com.diogopires.di_example.data.RepositoryImpl
import org.koin.dsl.module.module


val ModulesInit = module {
    module("Main") {
        factory { (view: Main.View, repository: Repository) -> MainPresenter(view, repository) }
        single { RepositoryImpl() }
    }

}