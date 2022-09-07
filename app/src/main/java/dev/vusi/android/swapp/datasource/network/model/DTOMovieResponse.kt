package dev.vusi.android.swapp.datasource.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DTOMovieResponse(
    @SerialName("title")
    val title: String? = null,
    @SerialName("episode_id")
    val episodeNumber: Int? = null,
    @SerialName("opening_crawl")
    val introSummary: String? = null,
    @SerialName("producer")
    val producer: String? = null,
    @SerialName("release_date")
    val releaseDate: String? = null,
    @SerialName("created")
    val created: String? = null,
    @SerialName("edited")
    val edited: String? = null,
    @SerialName("url")
    val url: String? = null
)