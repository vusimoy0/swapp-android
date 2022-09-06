package dev.vusi.android.swapp.datasource.cache.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import dev.vusi.android.swapp.datasource.cache.models.EntitySwApiCharacter
import kotlinx.coroutines.flow.Flow

@Dao
interface SwAppCharacterDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllCharacters(characters: List<EntitySwApiCharacter>)

    @Query("SELECT * from swapi_characters")
    fun getAllCharacters(): Flow<List<EntitySwApiCharacter>>

    @Query("DELETE from swapi_characters")
    suspend fun clearAllCharacters()
}