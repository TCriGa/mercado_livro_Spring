package com.mercadoLivro.mercadolivro.extension

import com.mercadoLivro.mercadolivro.controler.request.PostCustomerRequest
import com.mercadoLivro.mercadolivro.controler.request.PutCustomerRequest
import com.mercadoLivro.mercadolivro.model.CustomerModel

fun PostCustomerRequest.toCustomerModel(): CustomerModel{
    return CustomerModel(name = this.name, email = this.email)
}
fun PutCustomerRequest.toCustomerModel(id:String): CustomerModel{
    return CustomerModel(name = this.name, email = this.email, id = id)
}