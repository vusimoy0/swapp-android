package dev.vusi.android.swapp.datasource.cache.database

import androidx.room.TypeConverter
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
}