package com.diogopires.di_example.data

import com.mooveit.library.Fakeit

class RepositoryImpl : Repository {
    init {
        Fakeit.init()
    }

    override fun getData(callback: (items: List<String>) -> Unit) {
        val list = mutableListOf<String>()
        listOf((1..10).forEach {
            list.add(Fakeit.rockBand().name())
        })
        callback(list)
    }
}