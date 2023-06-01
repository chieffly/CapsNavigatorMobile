package ru.chieffly.canamo.domain.usecases

import ru.chieffly.canamo.domain.entity.Cap
import ru.chieffly.canamo.domain.repository.CapsRepository

/**
 *Created by Bryantsev Anton on 01.06.2023.
 **/

class GetCapsSearch(val repository: CapsRepository) {

    operator fun invoke(searchString: String): List<Cap> {
        return repository.searchCapsByString(searchString)
    }
}