package ru.chieffly.canamo.domain.entity

/**
 *Created by Bryantsev Anton on 01.06.2023.
 **/

data class Selection (
    val id: Int,
    val collection: List<Cap>,
    val title: String
)