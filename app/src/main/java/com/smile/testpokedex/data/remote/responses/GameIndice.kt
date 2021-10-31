package com.smile.testpokedex.data.remote.responses


import com.google.gson.annotations.SerializedName
import com.smile.testpokedex.data.remote.responses.Version

data class GameIndice(
    @SerializedName("game_index")
    val gameIndex: Int,
    val version: Version
)