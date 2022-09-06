package dev.vusi.android.swapp.ui.starwarscharacters

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.vusi.android.swapp.domain.DataState
import dev.vusi.android.swapp.domain.ProgressBarState
import dev.vusi.android.swapp.interactors.GetStarWarsCharacters
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class StarWarsCharactersViewModel @Inject constructor(
    private val getStarWarsCharacters: GetStarWarsCharacters
) : ViewModel() {

    var state: MutableState<StarWarsCharacterListState> =
        mutableStateOf(StarWarsCharacterListState())
        private set

    init {
        onTriggerEvent(StarWarsCharacterListEvents.GetStarWarsCharacterList)
    }

    fun onTriggerEvent(event: StarWarsCharacterListEvents) {
        when (event) {
            is StarWarsCharacterListEvents.GetStarWarsCharacterList -> {
                getStarWarsCharacterList()
            }

            is StarWarsCharacterListEvents.AddCharacterToFavourites -> {

            }
        }
    }

    private fun getStarWarsCharacterList() {
        getStarWarsCharacters.execute().onEach { dataState ->
            when (dataState) {
                is DataState.Response -> {
                    //todo - do logging
                }

                is DataState.Data -> {
                    state.value = state.value.copy(starWarsCharacterList = dataState.data.orEmpty())
                }

                is DataState.Loading -> {
                    state.value = state.value.copy(progressBarState = ProgressBarState.Loading)
                }
            }
        }.launchIn(viewModelScope)
    }

    private fun addCharacterToFavourites() {
        //todo
    }
}