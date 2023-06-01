package ru.chieffly.canamo.domain.entity

/**
 *Created by Bryantsev Anton on 01.06.2023.
 **/

data class FactorySign (
    val id: Int,
    val image: String,
    val color: String,
    val position: Int //1-12 like watch
)