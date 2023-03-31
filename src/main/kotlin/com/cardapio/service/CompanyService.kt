package com.cardapio.service

import com.cardapio.model.CompanyModel
import com.cardapio.repository.CompanyRepository
import org.springframework.stereotype.Service

@Service
class CompanyService(
    private val companyRepository: CompanyRepository
) {
    fun create(companyModel: CompanyModel) {
        companyRepository.save(companyModel)
    }

    fun findAll(): List<CompanyModel> {
        return companyRepository.findAll()
    }

    fun findById(id: Int): CompanyModel {
        return companyRepository.findById(id).get()
    }
}