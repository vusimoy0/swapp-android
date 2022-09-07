package dev.vusi.android.swapp.ui.starwarscharacters.characterdetail

import dev.vusi.android.swapp.domain.ProgressBarState
import dev.vusi.android.swapp.domain.model.StarWarsCharacter

data class CharacterDetailState(
    val progressBarState: ProgressBarState = ProgressBarState.Idle,
    val characterProfile: StarWarsCharacter = StarWarsCharacter()
)