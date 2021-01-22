package com.e.aula35_listaprodutos.model

data class Produto(
    val id_prod: Int,
    val nome_prod: String,
    val url: String,
    val id_emp: Int,
    val nome_emp: String,
    val valor: String,
    val dt_exp: String,
    val logo_emp: String,
    val vol_prod: String
) {
}