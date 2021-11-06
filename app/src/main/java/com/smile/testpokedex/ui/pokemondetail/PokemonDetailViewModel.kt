package com.smile.testpokedex.ui.pokemondetail

import androidx.lifecycle.ViewModel
import com.smile.testpokedex.data.repository.PokemonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String)  = repository.getPokemonInfo(pokemonName)

}