package dev.vusi.android.swapp.interactors

import dev.vusi.android.swapp.core.domain.DataState
import dev.vusi.android.swapp.core.domain.ProgressBarState
import dev.vusi.android.swapp.core.domain.UIComponent
import dev.vusi.android.swapp.datasource.cache.StarWarsAppCache
import dev.vusi.android.swapp.datasource.cache.models.EntityStarWarsCharacter
import dev.vusi.android.swapp.datasource.network.SwAppService
import dev.vusi.android.swapp.domain.model.StarWarsCharacter
import dev.vusi.android.swapp.domain.model.StarWarsCharacterDataMapper.toEntityStarWarsCharacter
import dev.vusi.android.swapp.domain.model.StarWarsCharacterDataMapper.toStarWarsCharacter
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetStarWarsCharacters @Inject constructor(
    private val cache: StarWarsAppCache,
    private val service: SwAppService
) {

    fun execute(): Flow<DataState<List<StarWarsCharacter>>> = flow {
        try {
            emit(DataState.Loading(progressBarState = ProgressBarState.Loading))

            val serviceResponse: List<EntityStarWarsCharacter> = try {
                service.fetchAllCharactersFromRemote().results?.map { it.toEntityStarWarsCharacter() }
                    .orEmpty()
            } catch (e: Exception) {
                e.printStackTrace()
                emit(
                    DataState.Response(
                        uiComponent = UIComponent.Dialog(
                            title = "Network Error",
                            message = e.message ?: "Unknown Error"
                        )
                    )
                )

                listOf()
            }

            //store data into cache
            cache.insertData(serviceResponse)
            //emit from cache
            emit(DataState.Data(data = cache.getAllCharacters().map { it.toStarWarsCharacter() }))

        } finally {
            emit(DataState.Loading(progressBarState = ProgressBarState.Idle))
        }
    }
}
