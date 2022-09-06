package dev.vusi.android.swapp.datasource.cache.models

import dev.vusi.android.swapp.domain.model.StarWarsCharacter

data class EntityStarWarsAppCharacterData(
    val characterCount: Int? = 0,
    val nextPageUrl: String? = "",
    val previousPageUrl: String? = "",
    val characterList: List<StarWarsCharacter>? = listOf()
)
