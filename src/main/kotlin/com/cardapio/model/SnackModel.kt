package com.cardapio.model

import jakarta.persistence.*

@Entity(name = "snack")
data class SnackModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column
    var name: String,

    @Column
    var description: String,

    @Column
    var price: Double,

    @Column
    var image_url: String,

    @ManyToOne
    @JoinColumn(name = "category_id ")
    var category: CategoryModel? = null,

//    @OneToMany(mappedBy = "snack")
//    var variants: List<VariantModel> = emptyList()
)