package dev.vusi.android.swapp.ui.starwarscharacters

sealed class StarWarsCharacterListEvents {

    object GetStarWarsCharacterList: StarWarsCharacterListEvents()

    object AddCharacterToFavourites: StarWarsCharacterListEvents()
}