package dev.vusi.android.swapp.ui.navigation

sealed class NavDestinationScreen(val route: String) {

    object CharacterList: NavDestinationScreen(route = "characters")

    object CharacterProfile: NavDestinationScreen(route = "characterProfile")
}