package com.diogopires.di_example.data

interface Repository {
    fun getData(callback: (items: List<String>) -> Unit)
}