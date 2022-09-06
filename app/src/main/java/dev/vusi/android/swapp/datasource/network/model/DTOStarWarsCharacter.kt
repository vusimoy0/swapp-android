package dev.vusi.android.swapp.datasource.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DTOStarWarsCharacter(
    @SerialName("name")
    val name: String? = null,
    @SerialName("height")
    val height: String? = null,
    @SerialName("mass")
    val mass: String? = null,
    @SerialName("hair_color")
    val hairColor: String? = null,
    @SerialName("skin_color")
    val skinColor: String? = null,
    @SerialName("eye_color")
    val eyeColor: String? = null,
    @SerialName("birth_year")
    val birthYear: String? = null,
    @SerialName("gender")
    val gender: String? = null,
    @SerialName("homeworld")
    val homeWorld: String? = null,
    @SerialName("films")
    val films: List<String>? = null,
    @SerialName("species")
    val species: List<String>? = null,
    @SerialName("vehicles")
    val vehicles: List<String>? = null,
    @SerialName("starships")
    val starShips: List<String>? = null,
    @SerialName("created")
    val created: String? = null,
    @SerialName("edited")
    val edited: String? = null,
    @SerialName("url")
    val url: String? = null
)