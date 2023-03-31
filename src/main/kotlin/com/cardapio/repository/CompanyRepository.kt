package com.cardapio.repository

import com.cardapio.model.CompanyModel
import org.springframework.data.jpa.repository.JpaRepository

interface CompanyRepository :JpaRepository<CompanyModel, Int> {

}