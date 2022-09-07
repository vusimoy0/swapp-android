package dev.vusi.android.swapp.ui.starwarscharacters.characterdetailscreen

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import dev.vusi.android.swapp.ui.starwarscharacters.characterdetailscreen.components.StarWarsCharacterProfile
import dev.vusi.android.swapp.ui.starwarscharacters.components.CharacterProfileAppBar
import dev.vusi.android.swapp.ui.starwarscharacters.components.ErrorDialog
import dev.vusi.android.swapp.ui.theme.StarWarsAppTheme

@Composable
fun StarWarsCharacterScreen(
    state: CharacterDetailState,
    onTriggerEvent: (CharacterDetailEvents) -> Unit,
    onBackButtonClicked: () -> Unit
) {
    StarWarsAppTheme {
        Scaffold(topBar = {
            CharacterProfileAppBar(
                appBarTitle = state.characterProfile.name,
                onNavigateBack = {  onBackButtonClicked() })
        },
            content = {
                StarWarsCharacterProfile(character = state.characterProfile)
                state.errorText?.let { errorText ->
                    ErrorDialog(
                        error = errorText,
                        dismissError = { onTriggerEvent(CharacterDetailEvents.DismissErrorDialog) })
                }
            })
    }
}