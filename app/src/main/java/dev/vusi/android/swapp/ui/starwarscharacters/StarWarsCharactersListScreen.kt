package dev.vusi.android.swapp.ui.starwarscharacters

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import dev.vusi.android.swapp.domain.ProgressBarState
import dev.vusi.android.swapp.domain.model.StarWarsCharacter

@Composable
fun StarWarsCharacters(
    state: StarWarsCharacterListState,
    onTriggerEvent: (StarWarsCharacterListEvents) -> Unit,
    onClickStarWarsCharacterItem: (StarWarsCharacter) -> Unit
) {
    if (state.progressBarState == ProgressBarState.Loading) {
        CircularProgressIndicator()
    } else {
        StarWarsCharacterList(listOfCharacters = state.starWarsCharacterList, onClick = {})
    }
}