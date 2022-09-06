package dev.vusi.android.swapp.ui.starwarscharacters

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
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
fun StarWarsCharacterListItem(character: StarWarsCharacter) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = 8.dp
    ) {
        Text(
            text = character.name,
            fontWeight = FontWeight.SemiBold,
            fontSize = TextUnit(value = 14f, type = TextUnitType.Sp)
        )
    }
}