package com.cardapio.repository

import com.cardapio.model.VariantModel
import org.springframework.data.jpa.repository.JpaRepository

interface VariantRepository : JpaRepository<VariantModel, Int>