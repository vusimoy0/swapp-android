package dev.vusi.android.swapp.ui.starwarscharacters.characterslistscreen

sealed class StarWarsCharacterListEvents {

    object GetStarWarsCharacterList: StarWarsCharacterListEvents()

    object OpenCharacter: StarWarsCharacterListEvents()
}