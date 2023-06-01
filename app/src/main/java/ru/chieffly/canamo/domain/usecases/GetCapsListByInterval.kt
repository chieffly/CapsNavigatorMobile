package ru.chieffly.canamo.domain.usecases

import ru.chieffly.canamo.domain.entity.Cap
import ru.chieffly.canamo.domain.repository.CapsRepository

/**
 *Created by Bryantsev Anton on 01.06.2023.
 **/

class GetCapsListByInterval(private val capsRepository: CapsRepository) {

    operator fun invoke(): List<Cap> {
        return capsRepository.getCapListByInterval()
    }
}