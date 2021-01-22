package com.e.aula35_listaprodutos.repository

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

//aqui vamos acessar a API através do get
// e retornar os dados que serão uma lista igual está na classe MsgChave API

interface Service {

    @GET("produtos")
    suspend fun getProdutosRepo(): MsgChaveAPI
}

// retrofit acessa a url, e dis que vai usar GSON
val retrofit = Retrofit.Builder()
    .baseUrl("https://promoios.com.br/api/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

//para todos terem acesso ao mesmo Service, criamos uma instâncai dele
val service: Service = retrofit.create(Service::class.java)
