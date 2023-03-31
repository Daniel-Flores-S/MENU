package com.cardapio.repository

import com.cardapio.model.CompanyModel
import com.cardapio.model.SnackModel
import org.springframework.data.jpa.repository.JpaRepository

interface SnackRepository :JpaRepository<SnackModel, Int> {

}