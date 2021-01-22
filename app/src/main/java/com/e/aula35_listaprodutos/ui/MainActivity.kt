package com.e.aula35_listaprodutos.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.e.aula35_listaprodutos.R
import com.e.aula35_listaprodutos.repository.service

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<MainViewModel> {
        object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return MainViewModel(service) as T
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        viewModel.getprodutos()

        viewModel.produtos.observe(this, {
            Log.i("MAINACTIVITY", it.forEach {
                Log.i("MAINACTIVITY", it.toString())
            }.toString())

        })
    }
}