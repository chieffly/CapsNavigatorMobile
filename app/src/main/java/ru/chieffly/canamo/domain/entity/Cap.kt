package ru.chieffly.canamo.domain.entity

/**
 *Created by Bryantsev Anton on 01.06.2023.
 **/

data class Cap (
    val id: Int,
    val company: Company,
    val sort: String,
    val place: Place,
    val factorySignId: Int,
    val factorySignPosition: Int,
    val yearOfProduction: Int,
    val comment: String,
    val liquor: Liquor,
    val frontImage: String,
    val backImage: String,
    val lettering: String
)