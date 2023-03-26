package com.cardapio.model

import com.cardapio.model.CompanyModel
import com.mercadolivro.enums.Status
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity(name = "category")
data class CategoryModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column
    var title: String,

    @Column
    var pdv_route: String,

    @Column
    var button_svg: String,

    @ManyToOne
    @JoinColumn(name = "company_id ")
    var company: CompanyModel? = null,

    @Column(name = "created_at")
    var createdAt: LocalDateTime? = LocalDateTime.now(),

    @Column
    var type : String? = null,
) {
    @Column
    @Enumerated(EnumType.STRING)
    var status: Status? = null
        set(value) {
            if (field == Status.CANCELADO || field == Status.DELETADO)
                println("Não é possível alterar o status de um registro cancelado ou deletado")

            field = value
        }

    constructor(
        id: Int? = null,
        title: String,
        pdv_route: String,
        button_svg: String,
        company: CompanyModel? = null,
        createdAt: LocalDateTime? = LocalDateTime.now(),
        status: Status?
    ) :
            this(id, title, pdv_route, button_svg, company, createdAt) {
        this.status = status
    }
}