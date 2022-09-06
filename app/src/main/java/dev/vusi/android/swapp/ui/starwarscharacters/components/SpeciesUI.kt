package dev.vusi.android.swapp.ui.starwarscharacters.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SpeciesUI(speciesItem: String) {
    Text(text = speciesItem)
    Spacer(modifier = Modifier.padding(5.dp))
}

@Composable
fun SpeciesList(species: List<String>) {
    LazyColumn() {
        items(species.size) {
            species.forEach { speciesItem ->
                SpeciesUI(speciesItem = speciesItem)
            }
        }
    }
}