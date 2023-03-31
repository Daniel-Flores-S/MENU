package com.cardapio.controller

import com.cardapio.controller.request.PostCategoryRequest
import com.cardapio.controller.response.CategoryResponse
import com.cardapio.extension.toCategoryModel
import com.cardapio.extension.toResponse
import com.cardapio.service.CategoryService
import com.cardapio.service.CompanyService
import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("category")
class CategoryController(
    private val categoryService: CategoryService,
    private val companyService: CompanyService
) {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun findAll(): List<CategoryResponse> {
        return categoryService.findAll().map { it.toResponse() }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody @Validated request: PostCategoryRequest) {
        println(request)
        val company = companyService.findById(request.company_id)
        categoryService.create(request.toCategoryModel(company))
    }

}