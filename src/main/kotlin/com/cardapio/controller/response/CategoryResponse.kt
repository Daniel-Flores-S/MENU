package com.cardapio.controller.response

import com.cardapio.enums.Status
import java.time.LocalDateTime


data class CategoryResponse(
    val id: Int? = null,
    val title: String,
    val pdv_route: String,
    val button_svg: String,
    val createdAt: LocalDateTime? = null,
    val type: String? = null,
    val status: Status,


)