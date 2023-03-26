package com.mercadolivro.enums

enum class Errors(val code: String, val message: String) {

    ML000("ML-000", "Email or password incorrect!"),
    ML001("ML-001", "Invalid Request"),
    ML101("ML-101", "Publication [%s] not exists"),
    ML102("ML-102", "Cannot update publication with status [%s]"),
    ML201("ML-201", "User [%s] not exists"),
    ML301("ML-301", "Category [%s] not exists")

}