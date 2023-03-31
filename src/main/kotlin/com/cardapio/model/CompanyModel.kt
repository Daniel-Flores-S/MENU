package com.cardapio.model

import jakarta.persistence.*

@Entity(name = "company")
data class CompanyModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column
    var name: String,

    @Column
    var currency: String,

    @Column
    var pdv_logo_svg: String,

    @Column
    var email: String,

    @Column
    var password_hashed: String,

    @Column
    var cellphone: String,

    @Column
    var telephone: String? = null,

    @Column
    var company_country: String,

    @Column
    var company_postal_code: String,

    @Column
    var company_name: String,

//    @OneToMany(mappedBy = "company")
//    var categories: List<CategoryModel> = emptyList(),
//
//    @OneToMany(mappedBy = "company")
//    var variants: List<VariantModel> = emptyList()
)