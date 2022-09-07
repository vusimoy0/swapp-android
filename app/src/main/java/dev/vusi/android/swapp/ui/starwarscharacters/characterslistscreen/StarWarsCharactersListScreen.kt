package dev.vusi.android.swapp.ui.starwarscharacters.characterslistscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import dev.vusi.android.swapp.core.domain.ProgressBarState
import dev.vusi.android.swapp.ui.starwarscharacters.components.AppProgressBar
import dev.vusi.android.swapp.ui.starwarscharacters.components.ErrorDialog

@Composable
fun StarWarsCharacterListScreen(
    state: StarWarsCharacterListState,
    onTriggerEvent: (StarWarsCharacterListEvents) -> Unit,
    onClickStarWarsCharacter: (String) -> Unit
) {
    Column {

    }
    if (state.progressBarState == ProgressBarState.Loading) {
        AppProgressBar()
    } else {
        StarWarsCharacterList(
            listOfCharacters = state.starWarsCharacterList,
            onCharacterSelected = onClickStarWarsCharacter
        )
        state.error?.let { errorText ->
            ErrorDialog(
                error = errorText,
                dismissError = { onTriggerEvent(StarWarsCharacterListEvents.DismissErrorDialog) })
        }
    }
}