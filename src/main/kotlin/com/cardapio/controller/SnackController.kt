package com.cardapio.controller

import com.cardapio.controller.request.PostCompanyRequest
import com.cardapio.controller.request.PostSnackRequest
import com.cardapio.controller.response.CompanyResponse
import com.cardapio.controller.response.SnackResponse
import com.cardapio.extension.toCompanyModel
import com.cardapio.extension.toResponse
import com.cardapio.extension.toSnackModel
import com.cardapio.model.CompanyModel
import com.cardapio.service.CategoryService
import com.cardapio.service.CompanyService
import com.cardapio.service.SnackService
import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("snack")
class SnackController(
    private val snackService: SnackService,
    private val categoryService: CategoryService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody @Validated request: PostSnackRequest) {
        val category = categoryService.findById(request.category_id)
        snackService.create(request.toSnackModel(category))
    }

    @GetMapping
    fun findAll(): List<SnackResponse> {
        return snackService.findAll().map { it.toResponse() }
    }
}