package dev.vusi.android.swapp.ui.starwarscharacters

import dev.vusi.android.swapp.domain.ProgressBarState
import dev.vusi.android.swapp.domain.model.StarWarsCharacter

data class StarWarsCharacterListState(
    val progressBarState: ProgressBarState = ProgressBarState.Idle,
    val starWarsCharacterList: List<StarWarsCharacter> = listOf(),
)