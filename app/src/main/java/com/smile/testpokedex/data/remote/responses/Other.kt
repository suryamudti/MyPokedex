package com.smile.testpokedex.data.remote.responses


import com.google.gson.annotations.SerializedName
import com.smile.testpokedex.data.remote.responses.DreamWorld

data class Other(
    @SerializedName("dream_world")
    val dreamWorld: DreamWorld,
    @SerializedName("official-artwork")
    val officialArtwork: OfficialArtwork
)