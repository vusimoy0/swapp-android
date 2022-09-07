package dev.vusi.android.swapp.datasource.cache.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import dev.vusi.android.swapp.datasource.cache.models.EntityStarWarsCharacter

@Dao
interface StarWarsAppCharacterDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllCharacters(characters: List<EntityStarWarsCharacter>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSingleCharacter(character: EntityStarWarsCharacter)

    @Query("SELECT * from swapi_characters")
    suspend fun getAllCharacters(): List<EntityStarWarsCharacter>

    @Query("SELECT * from swapi_characters WHERE name = :name")
    suspend fun getCharacterByName(name: String): EntityStarWarsCharacter?

    @Query("DELETE from swapi_characters")
    suspend fun clearAllCharacters()
}