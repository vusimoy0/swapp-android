package dev.vusi.android.swapp.ui.starwarscharacters.characterdetail.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DeviceHub
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import dev.vusi.android.swapp.R
import dev.vusi.android.swapp.domain.model.StarWarsCharacter

@Composable
fun StarWarsCharacterProfile(character: StarWarsCharacter) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {

        Image(imageVector = Icons.Default.DeviceHub, contentDescription = null)

        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            text = stringResource(id = R.string.label_character_birth_year),
            fontWeight = FontWeight.Bold
        )
        Text(text = character.birthYear)

        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            modifier = Modifier,
            text = stringResource(id = R.string.label_character_gender),
            fontWeight = FontWeight.Bold
        )
        Text(text = character.gender)

        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            text = stringResource(id = R.string.label_character_species),
            fontWeight = FontWeight.Bold
        )
        Text(text = "Human")

        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            text = stringResource(id = R.string.label_character_hair_color),
            fontWeight = FontWeight.Bold
        )
        Text(text = character.hairColor)

        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            text = stringResource(id = R.string.label_character_skin_color),
            fontWeight = FontWeight.Bold
        )
        Text(text = character.skinColor)

        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            text = stringResource(id = R.string.label_character_eye_color),
            fontWeight = FontWeight.Bold
        )
        Text(text = character.eyeColor)

        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            text = stringResource(id = R.string.label_character_height),
            fontWeight = FontWeight.Bold
        )
        Text(text = character.height)

        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            text = stringResource(id = R.string.label_character_mass),
            fontWeight = FontWeight.Bold
        )
        Text(text = character.mass)
    }
}