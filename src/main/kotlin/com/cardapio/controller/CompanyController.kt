package com.cardapio.controller

import com.cardapio.controller.request.PostCompanyRequest
import com.cardapio.controller.response.CompanyResponse
import com.cardapio.extension.toCompanyModel
import com.cardapio.extension.toResponse
import com.cardapio.model.CompanyModel
import com.cardapio.service.CompanyService
import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("company")
class CompanyController(
    private val companyService: CompanyService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody @Validated request: PostCompanyRequest) {
        companyService.create(request.toCompanyModel())
    }

    @GetMapping
    fun findAll(): List<CompanyResponse> {
        return companyService.findAll().map { it.toResponse() }
    }
}