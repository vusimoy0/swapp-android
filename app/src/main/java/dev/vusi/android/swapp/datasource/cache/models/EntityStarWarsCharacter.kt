package dev.vusi.android.swapp.datasource.cache.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "swapi_characters")
data class EntityStarWarsCharacter(
    @PrimaryKey
    val name: String = "",
    val height: String,
    val mass: String,
    val hairColor: String,
    val skinColor: String,
    val eyeColor: String,
    val birthYear: String,
    val gender: String,
    val homeWorld: String,
    val films: List<String>,
    val species: List<String>,
    val vehicles: List<String>,
    val starShips: List<String>,
    val created: String,
    val edited: String,
    val url: String
)