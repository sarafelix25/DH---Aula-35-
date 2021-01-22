package com.e.aula35_listaprodutos.repository

import com.e.aula35_listaprodutos.model.Produto
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

//class MsgChaveAPI (var produtosRetornadosAPI: ArrayList<Produto>)


class MsgChaveAPI (@SerializedName("produtos") @Expose var listaProdutos: ArrayList<Produto>)

