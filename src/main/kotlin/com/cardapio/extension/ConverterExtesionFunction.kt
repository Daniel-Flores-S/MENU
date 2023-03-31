package com.cardapio.extension

import com.cardapio.controller.request.PostCategoryRequest
import com.cardapio.controller.request.PostCompanyRequest
import com.cardapio.controller.request.PostSnackRequest
import com.cardapio.controller.request.PostVariantRequest
import com.cardapio.controller.response.CategoryResponse
import com.cardapio.controller.response.CompanyResponse
import com.cardapio.controller.response.SnackResponse
import com.cardapio.controller.response.VariantResponse
import com.cardapio.enums.Status
import com.cardapio.model.CategoryModel
import com.cardapio.model.CompanyModel
import com.cardapio.model.SnackModel
import com.cardapio.model.VariantModel


fun PostCompanyRequest.toCompanyModel(): CompanyModel {
    return CompanyModel(
        name = this.name,
        currency = this.currency,
        pdv_logo_svg = this.pdv_logo_svg,
        email = this.email,
        password_hashed = this.password_hashed,
        cellphone = this.cellphone,
        telephone = this.telephone,
        company_country = this.company_country,
        company_postal_code = this.company_postal_code,
        company_name = this.company_name,
//        categories = this.categories,
//        variants = this.variants
    )
}

fun PostCategoryRequest.toCategoryModel(company: CompanyModel): CategoryModel {
    return CategoryModel(
        title = this.title,
        pdv_route = this.pdv_route,
        button_svg = this.button_svg,
        company = company,
        createdAt = this.createdAt,
        type = this.type,
        status = Status.ATIVO
    )
}

fun PostSnackRequest.toSnackModel(category: CategoryModel): SnackModel {
    return SnackModel(
        name = this.name,
        description = this.description,
        price = this.price,
        image_url = this.image_url,
        category = category
    )
}

fun SnackModel.toResponse(): SnackResponse {
    return SnackResponse(
        name = this.name,
        description = this.description,
        price = this.price,
        image_url = this.image_url,
        category = this.category
    )
}

fun PostVariantRequest.toVariantModel(snack: SnackModel): VariantModel {
    return VariantModel(
        name = this.name,
        code = this.code,
        description = this.description,
        price = this.price,
        image_url = this.image_url,
        snack = snack
    )
}

fun VariantModel.toResponse(): VariantResponse {
    return VariantResponse(
        id = this.id,
        name = this.name,
        code = this.code,
        description = this.description,
        price = this.price,
        image_url = this.image_url,
        snack = this.snack
    )
}

fun CompanyModel.toResponse(): CompanyResponse {
    return CompanyResponse(
        id = this.id,
        name = this.name,
        currency = this.currency,
        pdv_logo_svg = this.pdv_logo_svg,
        email = this.email,
        password_hashed = this.password_hashed,
        cellphone = this.cellphone,
        telephone = this.telephone,
        company_country = this.company_country,
        company_postal_code = this.company_postal_code,
        company_name = this.company_name,
    )
}

fun CategoryModel.toResponse(): CategoryResponse {
    return CategoryResponse(
        id = this.id,
        title = this.title,
        pdv_route = this.pdv_route,
        button_svg = this.button_svg,
        createdAt = this.createdAt!!,
        type = this.type,
        status = this.status!!
    )
}