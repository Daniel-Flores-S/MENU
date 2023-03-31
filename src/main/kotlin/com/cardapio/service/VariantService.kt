package com.cardapio.service

import com.cardapio.model.VariantModel
import com.cardapio.repository.VariantRepository
import org.springframework.stereotype.Service

@Service
class VariantService(
    private val variantRepository: VariantRepository
) {
    fun create(variantModel: VariantModel) {
        variantRepository.save(variantModel)
    }

    fun findAll(): List<VariantModel> {
        return variantRepository.findAll()
    }
}