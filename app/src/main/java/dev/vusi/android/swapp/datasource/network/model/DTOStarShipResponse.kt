package dev.vusi.android.swapp.datasource.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DTOStarShipResponse(
    @SerialName("name")
    val name: String? = null,
    @SerialName("model")
    val model: String? = null,
    @SerialName("manufacturer")
    val manufacturer: String? = null,
    @SerialName("cost_in_credits")
    val cost: String? = null,
    @SerialName("length")
    val length: String? = null,
    @SerialName("max_atmospheric_speed")
    val maxSpeed: String? = null,
    @SerialName("crew")
    val crew: String? = null,
    @SerialName("passengers")
    val passengers: String? = null,
    @SerialName("cargo_capacity")
    val capacity: String? = null,
    @SerialName("consumables")
    val consumables: String? = null,
    @SerialName("hyperdrive_rating")
    val hyperDriveRating: String? = null,
    @SerialName("MGLT")
    val mglt: String? = null,
    @SerialName("starship_class")
    val starShipClass: String? = null,
    @SerialName("pilots")
    val pilots: List<String>? = null,
    @SerialName("films")
    val films: List<String>? = null,
    @SerialName("created")
    val created: String? = null,
    @SerialName("edited")
    val edited: String? = null,
    @SerialName("url")
    val url: String? = null
)