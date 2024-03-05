package com.mercadoLivro.mercadolivro.controler.request

import com.mercadoLivro.mercadolivro.model.CustomerModel

data class PostCustomerRequest(
    var name: String,
    var email: String
)
