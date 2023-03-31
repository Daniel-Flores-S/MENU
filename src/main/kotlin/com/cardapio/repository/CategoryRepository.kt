package com.cardapio.repository

import com.cardapio.model.CategoryModel
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository :JpaRepository<CategoryModel, Int> {

}