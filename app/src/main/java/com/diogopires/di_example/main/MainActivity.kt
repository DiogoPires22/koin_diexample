package com.diogopires.di_example.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.diogopires.di_example.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.core.parameter.parametersOf
import org.koin.java.standalone.KoinJavaComponent.inject

class MainActivity : AppCompatActivity(), Main.View {

    val presenter: Main.Presenter
            by inject(MainPresenter::class.java) { parametersOf(this) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.loadItems { items ->
            list_item.visibility = View.VISIBLE
        }
    }

    override fun onResume() {
        super.onResume()
    }

    override fun showLoading() {
        progressbar.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        progressbar.visibility = View.INVISIBLE
    }
}
