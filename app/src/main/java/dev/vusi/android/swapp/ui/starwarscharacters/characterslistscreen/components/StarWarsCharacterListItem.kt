package dev.vusi.android.swapp.ui.starwarscharacters.characterslistscreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import dev.vusi.android.swapp.domain.model.StarWarsCharacter

@OptIn(ExperimentalUnitApi::class)
@Composable
fun StarWarsCharacterListItem(
    character: StarWarsCharacter,
    onCharacterSelected: (String) -> Unit
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.secondaryContainer)
            .padding(8.dp)
            .clickable { onCharacterSelected(character.name) },
        elevation = 4.dp
    ) {
        Row(
            modifier = Modifier.padding(30.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = character.name,
                fontWeight = FontWeight.SemiBold,
                fontSize = TextUnit(value = 16f, type = TextUnitType.Sp)
            )
        }
    }
}