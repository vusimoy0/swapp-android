package dev.vusi.android.swapp.datasource.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DTOSpeciesResponse(
    @SerialName("name")
    val name: String? = null,
    @SerialName("classification")
    val classification: String? = null
)