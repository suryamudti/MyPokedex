package com.smile.testpokedex.data.remote.responses


import com.google.gson.annotations.SerializedName
import com.smile.testpokedex.data.remote.responses.Emerald
import com.smile.testpokedex.data.remote.responses.FireredLeafgreen

data class GenerationIii(
    val emerald: Emerald,
    @SerializedName("firered-leafgreen")
    val fireredLeafgreen: FireredLeafgreen,
    @SerializedName("ruby-sapphire")
    val rubySapphire: RubySapphire
)