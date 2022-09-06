package dev.vusi.android.swapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import dagger.hilt.android.AndroidEntryPoint
import dev.vusi.android.swapp.ui.starwarscharacters.StarWarsCharacters
import dev.vusi.android.swapp.ui.starwarscharacters.StarWarsCharactersViewModel
import dev.vusi.android.swapp.ui.theme.StarWarsAppTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel: StarWarsCharactersViewModel by viewModels()

        setContent {
            StarWarsCharacterContent(viewModel = viewModel)
        }
    }
}

@Composable
fun StarWarsCharacterContent(viewModel: StarWarsCharactersViewModel) {
    StarWarsAppTheme() {
        StarWarsCharacters(
            state = viewModel.state.value,
            onTriggerEvent = viewModel::onTriggerEvent,
            onClickStarWarsCharacterItem = {}
        )
    }
}