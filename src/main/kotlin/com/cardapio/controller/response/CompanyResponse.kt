package com.cardapio.controller.response

import com.cardapio.model.CategoryModel
import com.cardapio.model.VariantModel
import jakarta.persistence.*

data class CompanyResponse(
    var id: Int? = null,
    var name: String,
    var currency: String,
    var pdv_logo_svg: String,
    var email: String,
    var password_hashed: String,
    var cellphone: String,
    var telephone: String? = null,
    var company_country: String,
    var company_postal_code: String,
    var company_name: String,
//    var categories: List<CategoryModel>? = emptyList(),
//    var variants: List<VariantModel>? = emptyList()
)