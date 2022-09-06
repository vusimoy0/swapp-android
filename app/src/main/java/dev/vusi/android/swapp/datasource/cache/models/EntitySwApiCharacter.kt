package dev.vusi.android.swapp.datasource.cache.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "swapi_characters")
data class EntitySwApiCharacter(
    @PrimaryKey
    val name: String = "",
    val height: String? = null,
    val mass: String? = null,
    val hairColor: String? = null,
    val skinColor: String? = null,
    val eyeColor: String? = null,
    val birthYear: String? = null,
    val gender: String? = null,
    val homeWorld: String? = null,
    val films: List<String>? = null,
    val species: List<String>? = null,
    val vehicles: List<String>? = null,
    val starShips: List<String>? = null,
    val created: String? = null,
    val edited: String? = null,
    val url: String? = null
)