package com.smile.testpokedex.data.remote

import com.smile.testpokedex.data.remote.responses.Pokemon
import com.smile.testpokedex.data.remote.responses.PokemonList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by suryamudtisalmat on 31,October,2021
 */
interface PokeApi {

    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int,
    ): PokemonList

    @GET("pokemon/{name}")
    suspend fun getPokemonData(
        @Path("name") name: String
    ): Pokemon


}