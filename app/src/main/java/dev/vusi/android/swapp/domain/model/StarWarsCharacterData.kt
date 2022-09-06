package dev.vusi.android.swapp.domain.model

data class StarWarsCharacterData(
    val characterCount: Int = 0,
    val nextPageUrl: String = "",
    val previousPageUrl: String = "",
    val characterList: List<StarWarsCharacter> = listOf()
)