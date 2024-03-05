package com.mercadoLivro.mercadolivro.service

import com.mercadoLivro.mercadolivro.model.CustomerModel
import org.springframework.stereotype.Service

@Service
class CustomerService {
    val customers = mutableListOf<CustomerModel>()

    fun getAll(name: String?): List<CustomerModel> {
        name?.let {
            return customers.filter { it.name.contains(name,true) }
        }
        return customers
    }

    fun createCustomer(customer: CustomerModel){
        val id = if ( customers.isEmpty()){
            1
        } else{
            customers.last().id?.toInt()?.plus(1)
        }.toString()
        customers.add(customer)
        customer.id = id

    }

    fun getCustomer(id: String): CustomerModel {
        return customers.filter { it.id == id }.first()
    }

    fun update(id: String,  customer: CustomerModel){
        customers.first { it.id == customer.id }.let {
            it.name = customer.name
            it.email = customer.email
        }
    }

    fun delete(id: String){
        customers.removeIf{
            it.id == id
        }
    }
}