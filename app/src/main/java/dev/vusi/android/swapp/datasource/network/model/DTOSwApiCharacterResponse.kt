package dev.vusi.android.swapp.datasource.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DTOSwApiCharacterResponse(
    @SerialName("count")
    val count: Int? = null,
    @SerialName("height")
    val next: String? = null,
    @SerialName("previous")
    val previous: String? = null,
    @SerialName("results")
    val results: List<DTOSwApiCharacter>? = null
)