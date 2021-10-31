package com.smile.testpokedex.data.repository

import com.smile.testpokedex.data.remote.PokeApi
import com.smile.testpokedex.data.remote.responses.Pokemon
import com.smile.testpokedex.data.remote.responses.PokemonList
import com.smile.testpokedex.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import java.lang.Exception
import javax.inject.Inject

/**
 * Created by suryamudtisalmat on 31,October,2021
 */

@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api: PokeApi
)  {

    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception) {
            return  Resource.Error("An Error happened")
        }
        return Resource.Success(response)
    }

    suspend fun getPokemonInfo(name: String): Resource<Pokemon> {
        val response = try {
            api.getPokemonData(name)
        } catch (e: Exception) {
            return  Resource.Error("An Error happened")
        }
        return Resource.Success(response)
    }











}