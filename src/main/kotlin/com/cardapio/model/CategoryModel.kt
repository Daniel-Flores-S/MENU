package com.cardapio.model

import com.cardapio.enums.Status
import com.mercadolivro.enums.Errors
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

    @Column(name = "created_at")
    var createdAt: LocalDateTime? = LocalDateTime.now(),

    @Column
    var type: String? = null,

    @ManyToOne
    @JoinColumn(name = "company_id ")
    var company: CompanyModel? = null,
) {
    @Column
    @Enumerated(EnumType.STRING)
    var status: Status? = null
        set(value) {
            if (field == Status.CANCELADO || field == Status.DELETADO)
                println(Errors.ML102.message.format(field) + ' ' + Errors.ML102.code)

            field = value
        }

    constructor(
        id: Int? = null,
        title: String,
        pdv_route: String,
        button_svg: String,
        createdAt: LocalDateTime? = LocalDateTime.now(),
        type: String? = null,
        company: CompanyModel? = null,
        status: Status?
    ) :
            this(id, title, pdv_route, button_svg, createdAt, type, company) {
        this.status = status
    }
}
