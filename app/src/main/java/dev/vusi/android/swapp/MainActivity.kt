package dev.vusi.android.swapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import dev.vusi.android.swapp.ui.starwarscharacters.navigation.StarWarsNav
import dev.vusi.android.swapp.ui.theme.StarWarsAppTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            StarWarsAppTheme {
                StarWarsNav()
            }
        }
    }
}