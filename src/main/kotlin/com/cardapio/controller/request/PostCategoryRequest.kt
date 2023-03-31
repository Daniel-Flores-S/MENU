package com.cardapio.controller.request

import com.cardapio.enums.Status
import com.fasterxml.jackson.annotation.JsonAlias
import jakarta.validation.constraints.NotEmpty
import java.time.LocalDateTime

data class PostCategoryRequest (
    @field:NotEmpty(message = "Nome deve ser informado")
    var title: String,

    @field:NotEmpty(message = "Rota deve ser informado")
    var pdv_route: String,

    @field:NotEmpty(message = "Icone deve ser informado")
    var button_svg: String,

    @JsonAlias("company_id")
    var company_id: Int,

    var createdAt: LocalDateTime? = LocalDateTime.now(),

    var status: Status?,

    @field:NotEmpty(message = "Tipo deve ser informado")
    var type: String? = null,
)