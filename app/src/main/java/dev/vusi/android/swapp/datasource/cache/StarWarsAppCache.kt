package dev.vusi.android.swapp.datasource.cache

import dev.vusi.android.swapp.datasource.cache.models.EntityStarWarsCharacter
import kotlinx.coroutines.flow.Flow

interface StarWarsAppCache {

    suspend fun insertData(data: List<EntityStarWarsCharacter>)
    suspend fun getAllCharacters(): List<EntityStarWarsCharacter>
}