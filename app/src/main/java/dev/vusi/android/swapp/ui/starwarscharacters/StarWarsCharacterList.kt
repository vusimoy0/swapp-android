package dev.vusi.android.swapp.ui.starwarscharacters

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import dev.vusi.android.swapp.domain.model.StarWarsCharacter

@Composable
fun StarWarsCharacterList(
    listOfCharacters: List<StarWarsCharacter>,
    onClick: (StarWarsCharacter) -> Unit
) {
    LazyColumn {
        items(listOfCharacters) { characterItem ->
            StarWarsCharacterListItem(character = characterItem)
        }
    }
}