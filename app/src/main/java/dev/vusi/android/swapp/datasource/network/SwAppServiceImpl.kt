package dev.vusi.android.swapp.datasource.network

import dev.vusi.android.swapp.datasource.network.api.SwApiService
import dev.vusi.android.swapp.datasource.network.model.DTOStarWarsCharacterResponse
import javax.inject.Inject

class SwAppServiceImpl @Inject constructor(private val swappApiService: SwApiService): SwAppService {

    override suspend fun fetchAllCharactersFromRemote(): DTOStarWarsCharacterResponse {
        return swappApiService.getAllPeople()
    }
}