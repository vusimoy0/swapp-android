package dev.vusi.android.swapp.ui.starwarscharacters.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.HiltViewModelFactory
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import dev.vusi.android.swapp.ui.starwarscharacters.StarWarsCharactersViewModel
import dev.vusi.android.swapp.ui.starwarscharacters.characterdetail.StarWarsCharacterDetailViewModel
import dev.vusi.android.swapp.ui.starwarscharacters.characterdetail.StarWarsCharacterScreen
import dev.vusi.android.swapp.ui.starwarscharacters.characterslistscreen.StarWarsCharacterListScreen

@Composable
fun StarWarsNav() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavDestinationScreen.CharacterList.route,
    ) {
        composable(route = NavDestinationScreen.CharacterList.route) { navBackStackEntry ->

            val factory =
                HiltViewModelFactory(LocalContext.current, navBackStackEntry = navBackStackEntry)
            val viewModel: StarWarsCharactersViewModel =
                viewModel(key = StarWarsCharactersViewModel::class.java.name, factory = factory)

            StarWarsCharacterListScreen(
                state = viewModel.state.value,
                onTriggerEvent = viewModel::onTriggerEvent,
                onClickStarWarsCharacter = { characterName ->
                    navController.navigate(route = "${NavDestinationScreen.CharacterProfile.route}/$characterName")
                }
            )
        }

        composable(
            route = NavDestinationScreen.CharacterProfile.route + "/{characterName}",
            arguments = listOf(navArgument(name = "characterName") {
                type = NavType.StringType
            })
        ) { navBackStackEntry ->
            val factory =
                HiltViewModelFactory(LocalContext.current, navBackStackEntry = navBackStackEntry)
            val viewModel: StarWarsCharacterDetailViewModel =
                viewModel(key = StarWarsCharactersViewModel::class.java.name, factory = factory)
            StarWarsCharacterScreen(
                state = viewModel.state.value,
                onTriggerEvent = viewModel::onTriggerEvent
            )
        }
    }
}