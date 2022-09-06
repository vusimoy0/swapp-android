package dev.vusi.android.swapp.ui.starwarscharacters.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import dev.vusi.android.swapp.R
import dev.vusi.android.swapp.domain.model.StarWarsCharacter

@Composable
fun StarWarsCharacter(character: StarWarsCharacter) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Column {
                Text(text = stringResource(id = R.string.label_character_birth_year))
                Spacer(modifier = Modifier.padding(10.dp))
                Text(text = character.birthYear)
            }

            Column {
                Text(text = stringResource(id = R.string.label_character_height))
                Spacer(modifier = Modifier.padding(10.dp))
                Text(text = character.height)
            }
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            Column {
                Text(text = stringResource(id = R.string.label_character_planet))
                Spacer(modifier = Modifier.padding(10.dp))
                Text(text = character.homeWorld)
            }
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            Column {
                Text(text = stringResource(id = R.string.label_character_species))
                Spacer(modifier = Modifier.padding(10.dp))
                if (character.species.isEmpty()) {
                    Text(text = stringResource(id = R.string.info_unavailable_species))
                } else {
                    SpeciesList(species = character.species)
                }
            }
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            Text(text = stringResource(id = R.string.label_character_films))
        }

    }
}