package com.cardapio.controller.request

import com.cardapio.model.CategoryModel
import com.cardapio.model.VariantModel
import jakarta.validation.constraints.NotEmpty


data class PostCompanyRequest (
    @field:NotEmpty(message = "Nome deve ser informado")
    var name: String,

    @field:NotEmpty(message = "Moeda deve ser informado")
    var currency: String,

    @field:NotEmpty(message = "Logo deve ser informado")
    var pdv_logo_svg: String,

    @field:NotEmpty(message = "Email deve ser informado")
    var email: String,

    @field:NotEmpty(message = "Senha deve ser informado")
    var password_hashed: String,

     var cellphone: String = "",

    var telephone: String? = null,

    @field:NotEmpty(message = "País deve ser informado")
    var company_country: String,

    @field:NotEmpty(message = "CEP deve ser informado")
    var company_postal_code: String,

    @field:NotEmpty(message = "Nome da empresa deve ser informado")
    var company_name: String,

    var categories: List<CategoryModel> = emptyList(),

    var variants: List<VariantModel> = emptyList()
)
