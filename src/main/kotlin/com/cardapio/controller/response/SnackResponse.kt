package com.cardapio.controller.response

import com.cardapio.enums.Status
import com.cardapio.model.CategoryModel
import com.cardapio.model.SnackModel
import java.time.LocalDateTime


data class SnackResponse(
    val id: Int? = null,
    val name: String,
    val description: String,
    val price: Double,
    val image_url: String,
    val category: CategoryModel?,
    //val variants: List<VariantResponse>
)
//{
//    companion object {
//        fun fromModel(snack: SnackModel): SnackResponse {
//            return SnackResponse(
//                id = snack.id ?: 0,
//                name = snack.name,
//                description = snack.description,
//                price = snack.price,
//                image_url = snack.image_url,
//                category = snack.category?.let { CategoryResponse.fromModel(it) },
//               // variants = snack.variants.map { VariantResponse.fromModel(it) }
//            )
//        }
//    }
//}