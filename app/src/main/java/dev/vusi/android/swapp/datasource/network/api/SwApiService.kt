package dev.vusi.android.swapp.datasource.network.api

import dev.vusi.android.swapp.datasource.network.model.DTOSwApiCharacterResponse
import retrofit2.http.GET

interface SwApiService {

    @GET("people/")
    suspend fun getAllPeople(): DTOSwApiCharacterResponse
}