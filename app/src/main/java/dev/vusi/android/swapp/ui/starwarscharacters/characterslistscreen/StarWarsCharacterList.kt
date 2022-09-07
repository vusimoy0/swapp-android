package dev.vusi.android.swapp.ui.starwarscharacters.characterslistscreen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import dev.vusi.android.swapp.domain.model.StarWarsCharacter
import dev.vusi.android.swapp.ui.starwarscharacters.characterslistscreen.components.StarWarsCharacterListItem

@Composable
fun StarWarsCharacterList(
    listOfCharacters: List<StarWarsCharacter>,
    onCharacterSelected: (String) -> Unit
) {

    LazyColumn {
        items(listOfCharacters) { characterItem ->
            StarWarsCharacterListItem(
                character = characterItem,
                onCharacterSelected = { name-> onCharacterSelected(name) })
        }
    }
}
