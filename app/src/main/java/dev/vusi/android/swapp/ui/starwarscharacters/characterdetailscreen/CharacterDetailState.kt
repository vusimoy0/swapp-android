package dev.vusi.android.swapp.ui.starwarscharacters.characterdetailscreen

import dev.vusi.android.swapp.core.domain.ProgressBarState
import dev.vusi.android.swapp.domain.model.StarWarsCharacter

data class CharacterDetailState(
    val progressBarState: ProgressBarState = ProgressBarState.Idle,
    val characterProfile: StarWarsCharacter = StarWarsCharacter(),
    val errorText: String? = null
)