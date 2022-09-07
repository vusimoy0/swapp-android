package dev.vusi.android.swapp.datasource.cache

import dev.vusi.android.swapp.datasource.cache.models.EntityStarWarsCharacter

interface StarWarsAppCache {

    suspend fun insertData(data: List<EntityStarWarsCharacter>)
    suspend fun insertSingleCharacter(data: EntityStarWarsCharacter)
    suspend fun getAllCharacters(): List<EntityStarWarsCharacter>
    suspend fun getCharacter(characterName: String): EntityStarWarsCharacter
}