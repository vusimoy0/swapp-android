package dev.vusi.android.swapp.datasource.cache.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import dev.vusi.android.swapp.datasource.cache.dao.StarWarsAppCharacterDao
import dev.vusi.android.swapp.datasource.cache.models.EntityStarWarsCharacter

@Database(entities = [EntityStarWarsCharacter::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class StarWarsAppDatabase: RoomDatabase() {

    abstract val characterDao: StarWarsAppCharacterDao
}