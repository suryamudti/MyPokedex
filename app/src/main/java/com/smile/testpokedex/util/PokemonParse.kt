package com.smile.testpokedex.util

import androidx.compose.ui.graphics.Color
import com.smile.testpokedex.data.remote.responses.Stat
import com.smile.testpokedex.data.remote.responses.Type
import com.smile.testpokedex.ui.theme.AtkColor
import com.smile.testpokedex.ui.theme.DefColor
import com.smile.testpokedex.ui.theme.HPColor
import com.smile.testpokedex.ui.theme.SpAtkColor
import com.smile.testpokedex.ui.theme.SpDefColor
import com.smile.testpokedex.ui.theme.SpdColor
import com.smile.testpokedex.ui.theme.TypeBug
import com.smile.testpokedex.ui.theme.TypeDark
import com.smile.testpokedex.ui.theme.TypeDragon
import com.smile.testpokedex.ui.theme.TypeElectric
import com.smile.testpokedex.ui.theme.TypeFairy
import com.smile.testpokedex.ui.theme.TypeFighting
import com.smile.testpokedex.ui.theme.TypeFire
import com.smile.testpokedex.ui.theme.TypeFlying
import com.smile.testpokedex.ui.theme.TypeGhost
import com.smile.testpokedex.ui.theme.TypeGrass
import com.smile.testpokedex.ui.theme.TypeGround
import com.smile.testpokedex.ui.theme.TypeIce
import com.smile.testpokedex.ui.theme.TypeNormal
import com.smile.testpokedex.ui.theme.TypePoison
import com.smile.testpokedex.ui.theme.TypePsychic
import com.smile.testpokedex.ui.theme.TypeRock
import com.smile.testpokedex.ui.theme.TypeSteel
import com.smile.testpokedex.ui.theme.TypeWater
import java.util.*

fun parseTypeToColor(type: Type): Color {
    return when(type.type.name.toLowerCase(Locale.ROOT)) {
        "normal" -> TypeNormal
        "fire" -> TypeFire
        "water" -> TypeWater
        "electric" -> TypeElectric
        "grass" -> TypeGrass
        "ice" -> TypeIce
        "fighting" -> TypeFighting
        "poison" -> TypePoison
        "ground" -> TypeGround
        "flying" -> TypeFlying
        "psychic" -> TypePsychic
        "bug" -> TypeBug
        "rock" -> TypeRock
        "ghost" -> TypeGhost
        "dragon" -> TypeDragon
        "dark" -> TypeDark
        "steel" -> TypeSteel
        "fairy" -> TypeFairy
        else -> Color.Black
    }
}

fun parseStatToColor(stat: Stat): Color {
    return when(stat.stat.name.toLowerCase()) {
        "hp" -> HPColor
        "attack" -> AtkColor
        "defense" -> DefColor
        "special-attack" -> SpAtkColor
        "special-defense" -> SpDefColor
        "speed" -> SpdColor
        else -> Color.White
    }
}

fun parseStatToAbbr(stat: Stat): String {
    return when(stat.stat.name.toLowerCase()) {
        "hp" -> "HP"
        "attack" -> "Atk"
        "defense" -> "Def"
        "special-attack" -> "SpAtk"
        "special-defense" -> "SpDef"
        "speed" -> "Spd"
        else -> ""
    }
}