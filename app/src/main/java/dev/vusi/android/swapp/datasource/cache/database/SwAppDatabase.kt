package dev.vusi.android.swapp.datasource.cache.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import dev.vusi.android.swapp.datasource.cache.dao.SwAppCharacterDao
import dev.vusi.android.swapp.datasource.cache.models.EntitySwApiCharacter

@Database(entities = [EntitySwApiCharacter::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class SwAppDatabase: RoomDatabase() {

    abstract val characterDao: SwAppCharacterDao
}