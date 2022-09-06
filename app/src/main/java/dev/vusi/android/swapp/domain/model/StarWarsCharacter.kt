package dev.vusi.android.swapp.domain.model

data class StarWarsCharacter(
    val name: String = "",
    val height: String = "",
    val mass: String = "",
    val hairColor: String = "",
    val skinColor: String = "",
    val eyeColor: String = "",
    val birthYear: String = "",
    val gender: String = "",
    val homeWorld: String = "",
    val movies: List<String> = listOf(),
    val species: List<String> = listOf(),
    val vehicles: List<String> = listOf(),
    val starShips: List<String> = listOf(),
    val created: String = "",
    val edited: String = "",
    val url: String = ""
)