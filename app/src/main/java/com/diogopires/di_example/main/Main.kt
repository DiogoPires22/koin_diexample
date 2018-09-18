package com.diogopires.di_example.main

interface Main {
    interface View {
        fun showLoading()
        fun hideLoading()
    }

    interface Presenter {
        fun loadItems(complete: (items: List<String>) -> Unit)
    }
}