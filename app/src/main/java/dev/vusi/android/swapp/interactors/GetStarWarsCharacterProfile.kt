package dev.vusi.android.swapp.interactors

import dev.vusi.android.swapp.core.domain.DataState
import dev.vusi.android.swapp.core.domain.ProgressBarState
import dev.vusi.android.swapp.datasource.cache.StarWarsAppCache
import dev.vusi.android.swapp.domain.model.StarWarsCharacter
import dev.vusi.android.swapp.domain.model.StarWarsCharacterDataMapper.toStarWarsCharacter
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetStarWarsCharacterProfile @Inject constructor(
    private val cache: StarWarsAppCache
) {
    fun execute(characterName: String): Flow<DataState<StarWarsCharacter>> = flow {
        try {
            emit(DataState.Loading(progressBarState = ProgressBarState.Loading))

            //check cache before going to internet
            val characterResult: StarWarsCharacter = try {
                cache.getCharacter(characterName = characterName).toStarWarsCharacter()
            } catch (e: Exception) {
                e.printStackTrace()
                emit(DataState.Response(errorText = e.message ?: "An Unknown Error has occurred"))
                StarWarsCharacter()
            }

            //emit from cache
            emit(DataState.Data(data = characterResult))
        } finally {
            emit(DataState.Loading(progressBarState = ProgressBarState.Idle))
        }
    }
}