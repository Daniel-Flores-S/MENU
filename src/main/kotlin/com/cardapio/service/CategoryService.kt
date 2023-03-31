package com.cardapio.service

import com.cardapio.model.CategoryModel
import com.cardapio.repository.CategoryRepository
import org.springframework.stereotype.Service

@Service
class CategoryService
    (
    private val categoryRepository: CategoryRepository
) {
    fun findAll(): List<CategoryModel> {
        return categoryRepository.findAll()
    }

    fun  create(categoryModel: CategoryModel) {
        categoryRepository.save(categoryModel)
    }

    fun findById(id: Int): CategoryModel {
        return categoryRepository.findById(id).get()
    }
}