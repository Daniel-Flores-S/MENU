package com.cardapio.controller

import com.cardapio.controller.request.PostVariantRequest
import com.cardapio.controller.response.VariantResponse
import com.cardapio.extension.toResponse
import com.cardapio.extension.toVariantModel
import com.cardapio.service.SnackService
import com.cardapio.service.VariantService
import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("variant")
class VariantController(
    private val variantService: VariantService,
    private val snackService: SnackService,
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody @Validated request: PostVariantRequest) {
        val snack = snackService.findById(request.snack_id)
        variantService.create(request.toVariantModel(snack))
    }

    @GetMapping
    fun findAll(): List<VariantResponse> {
        return variantService.findAll().map { it.toResponse() }
    }

}