package com.cardapio

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CardapioApplication

fun main(args: Array<String>) {
	runApplication<CardapioApplication>(*args)
}
