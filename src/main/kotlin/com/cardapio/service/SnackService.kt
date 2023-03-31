package com.cardapio.service

import com.cardapio.model.SnackModel
import com.cardapio.repository.SnackRepository
import org.springframework.stereotype.Service

@Service
class SnackService(
    private val snackRepository: SnackRepository
) {
    fun create(companyModel: SnackModel) {
        snackRepository.save(companyModel)
    }

    fun findAll(): List<SnackModel> {
        return  snackRepository.findAll()
    }

    fun findById(id: Int): SnackModel {
        return snackRepository.findById(id).get()
    }
}