package com.e.aula35_listaprodutos.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.e.aula35_listaprodutos.model.Produto
import com.e.aula35_listaprodutos.repository.Service
import kotlinx.coroutines.launch

class MainViewModel (val service: Service) : ViewModel() {

    val produtos = MutableLiveData<List<Produto>>()

    fun getprodutos(){
        viewModelScope.launch {
            produtos.value = service.getProdutosRepo().listaProdutos
        }
    }



}