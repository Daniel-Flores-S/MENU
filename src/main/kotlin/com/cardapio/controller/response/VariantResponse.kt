package com.cardapio.controller.response

import com.cardapio.model.SnackModel

data class VariantResponse(
    val id: Int? = null,
    val name: String,
    val code: String,
    val description: String,
    val price: Double? = null,
    val image_url: String,
    val snack: SnackModel? = null,
)