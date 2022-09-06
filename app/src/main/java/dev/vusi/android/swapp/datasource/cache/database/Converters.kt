package dev.vusi.android.swapp.datasource.cache.database

import androidx.room.TypeConverter
import dev.vusi.android.swapp.datasource.cache.models.EntityStarWarsAppCharacterData
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class Converters {

    @TypeConverter
    fun encodeToString(data: List<String>): String {
        return Json.encodeToString(data)
    }

    @TypeConverter
    fun decodeFromString(data: String): List<String> {
        return Json.decodeFromString(data)
    }

    @TypeConverter
    fun encodeCharacterDataToString(characterData: List<EntityStarWarsAppCharacterData>): String {
        return Json.encodeToString(characterData)
    }

    @TypeConverter
    fun decodeCharacterDataToString(characterData: String): List<EntityStarWarsAppCharacterData> {
        return Json.decodeFromString(characterData)
    }
}