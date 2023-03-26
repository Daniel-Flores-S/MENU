package com.cardapio.model

import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany

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
)