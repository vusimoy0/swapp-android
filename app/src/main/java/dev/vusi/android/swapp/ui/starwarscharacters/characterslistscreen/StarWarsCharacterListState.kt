package dev.vusi.android.swapp.ui.starwarscharacters.characterslistscreen

import dev.vusi.android.swapp.core.domain.ProgressBarState
import dev.vusi.android.swapp.domain.model.StarWarsCharacter

data class StarWarsCharacterListState(
    val progressBarState: ProgressBarState = ProgressBarState.Idle,
    val starWarsCharacterList: List<StarWarsCharacter> = listOf(),
    val error: String? = null
)