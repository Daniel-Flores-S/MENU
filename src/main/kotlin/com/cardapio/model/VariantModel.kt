package com.cardapio.model

import jakarta.persistence.*

@Entity(name = "variant")
data class VariantModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column
    var name: String,

    @Column
    var code: String,

    @Column
    var description: String,

    @Column
    var price: Double? = null,

    @Column
    var image_url: String,

    @ManyToOne
    @JoinColumn(name = "snack_id")
    var snack: SnackModel? = null

)
{
    constructor() : this(null, "", "", "", null, "", null)
}