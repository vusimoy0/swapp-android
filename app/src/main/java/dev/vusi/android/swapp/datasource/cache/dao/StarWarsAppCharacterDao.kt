package dev.vusi.android.swapp.datasource.cache.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import dev.vusi.android.swapp.datasource.cache.models.EntityStarWarsCharacter
import kotlinx.coroutines.flow.Flow

@Dao
interface StarWarsAppCharacterDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllCharacters(characters: List<EntityStarWarsCharacter>)

    @Query("SELECT * from swapi_characters")
    fun getAllCharacters(): Flow<List<EntityStarWarsCharacter>>

    @Query("DELETE from swapi_characters")
    suspend fun clearAllCharacters()
}