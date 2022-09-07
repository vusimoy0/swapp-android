package dev.vusi.android.swapp.datasource.cache.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "swapi_characters")
data class EntityStarWarsCharacter(
    @PrimaryKey
    val url: String = "",
    val name: String = "",
    val height: String = "",
    val mass: String = "",
    val hairColor: String = "",
    val skinColor: String = "",
    val eyeColor: String = "",
    val birthYear: String = "",
    val gender: String = "",
    val homeWorld: String = "",
    val films: List<String> = listOf(),
    val species: List<String> = listOf(),
    val vehicles: List<String> = listOf(),
    val starShips: List<String> = listOf(),
    val created: String = "",
    val edited: String = "",
)