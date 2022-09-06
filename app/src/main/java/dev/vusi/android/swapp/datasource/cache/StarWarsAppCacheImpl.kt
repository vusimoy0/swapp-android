package dev.vusi.android.swapp.datasource.cache

import dev.vusi.android.swapp.datasource.cache.dao.StarWarsAppCharacterDao
import dev.vusi.android.swapp.datasource.cache.models.EntityStarWarsCharacter
import javax.inject.Inject

class StarWarsAppCacheImpl @Inject constructor(private val dao: StarWarsAppCharacterDao): StarWarsAppCache {

    override suspend fun getAllCharacters(): List<EntityStarWarsCharacter> {
        return dao.getAllCharacters()
    }

    override suspend fun insertData(data: List<EntityStarWarsCharacter>) {
        dao.insertAllCharacters(data)
    }
}