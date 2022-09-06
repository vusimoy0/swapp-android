package dev.vusi.android.swapp.datasource.cache

import dev.vusi.android.swapp.datasource.cache.dao.StarWarsAppCharacterDao
import dev.vusi.android.swapp.datasource.cache.models.EntityStarWarsCharacter
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class StarWarsAppCacheImpl @Inject constructor(private val dao: StarWarsAppCharacterDao): StarWarsAppCache {

    override fun getAllCharacters(): Flow<List<EntityStarWarsCharacter>> {
        return dao.getAllCharacters()
    }

    override suspend fun insertData(data: List<EntityStarWarsCharacter>) {
        dao.insertAllCharacters(data)
    }
}