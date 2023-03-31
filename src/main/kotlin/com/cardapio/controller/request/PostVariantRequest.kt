package com.cardapio.controller.request

import com.fasterxml.jackson.annotation.JsonAlias
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull

data class PostVariantRequest(
    @field:NotEmpty(message = "Nome deve ser informado")
    var name: String,

    @field:NotEmpty(message = "Code deve ser informado")
    var code: String,

    @field:NotEmpty(message = "Description deve ser informado")
    var description: String,

    @field:NotNull(message = "Price deve ser informado")
    var price: Double,

    @field:NotEmpty(message = "Image_url deve ser informado")
    var image_url: String,

    @JsonAlias("snack_id")
    var snack_id: Int
)