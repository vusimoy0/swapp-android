package dev.vusi.android.swapp.datasource.network

import dev.vusi.android.swapp.datasource.network.model.DTOStarWarsCharacterResponse

interface SwAppService {

    suspend fun fetchAllCharactersFromRemote(): DTOStarWarsCharacterResponse
}