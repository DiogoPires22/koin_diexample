package com.diogopires.di_example.main

import com.diogopires.di_example.data.Repository

class MainPresenter(view:Main.View,val repository: Repository) : Main.Presenter {

    private lateinit var view: Main.View


    override fun loadItems(complete: (items: List<String>) -> Unit) {
        view.showLoading()
        repository.getData {
            view.hideLoading()
            complete(it)
        }
    }

    override fun attachView(view: Main.View) {
        this.view = view
    }
}