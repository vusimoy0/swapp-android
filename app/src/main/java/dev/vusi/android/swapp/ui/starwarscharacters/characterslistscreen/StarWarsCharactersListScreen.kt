package dev.vusi.android.swapp.ui.starwarscharacters.characterslistscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import dev.vusi.android.swapp.domain.ProgressBarState

@Composable
fun StarWarsCharacterListScreen(
    state: StarWarsCharacterListState,
    onTriggerEvent: (StarWarsCharacterListEvents) -> Unit,
    onClickStarWarsCharacter: (String) -> Unit
) {
    Column {

    }
    if (state.progressBarState == ProgressBarState.Loading) {
        CircularProgressIndicator()
    } else {
        StarWarsCharacterList(
            listOfCharacters = state.starWarsCharacterList,
            onCharacterSelected = onClickStarWarsCharacter
        )
    }
}