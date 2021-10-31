package com.smile.testpokedex.data.remote.responses


import com.google.gson.annotations.SerializedName
import com.smile.testpokedex.data.remote.responses.BlackWhite

data class GenerationV(
    @SerializedName("black-white")
    val blackWhite: BlackWhite
)