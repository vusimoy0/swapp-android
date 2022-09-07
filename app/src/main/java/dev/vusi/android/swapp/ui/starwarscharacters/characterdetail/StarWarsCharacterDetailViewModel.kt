package dev.vusi.android.swapp.ui.starwarscharacters.characterdetail

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.vusi.android.swapp.core.domain.DataState
import dev.vusi.android.swapp.domain.model.StarWarsCharacter
import dev.vusi.android.swapp.interactors.GetStarWarsCharacterProfile
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class StarWarsCharacterDetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val getCharacterProfile: GetStarWarsCharacterProfile
) : ViewModel() {

    var state: MutableState<CharacterDetailState> = mutableStateOf(CharacterDetailState())
        private set

    init {
        try {
            savedStateHandle.get<String>("characterName")?.let { name ->
                onTriggerEvent(event = CharacterDetailEvents.GetCharacterProfile(name))
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun onTriggerEvent(event: CharacterDetailEvents) {
        when (event) {
            is CharacterDetailEvents.GetCharacterProfile -> {
                getCharacterProfile(event.characterName)
            }
        }
    }

    private fun getCharacterProfile(name: String) {
        getCharacterProfile.execute(name).onEach { dataState ->
            when(dataState) {
                is DataState.Response -> {
                    //todo - ui component for errors
                }

                is DataState.Data -> {
                    state.value = state.value.copy(characterProfile = dataState.data ?: StarWarsCharacter())
                }

                is DataState.Loading ->{
                    state.value = state.value.copy(progressBarState = dataState.progressBarState)
                }

            }
        }.launchIn(viewModelScope)
    }
}