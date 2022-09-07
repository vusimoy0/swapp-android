package dev.vusi.android.swapp.ui.starwarscharacters.characterdetail

sealed class CharacterDetailEvents {

    data class GetCharacterProfile(val characterName: String) : CharacterDetailEvents()

    object DismissErrorDialog : CharacterDetailEvents()
}