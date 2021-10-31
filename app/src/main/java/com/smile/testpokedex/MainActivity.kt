package com.smile.testpokedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.smile.testpokedex.ui.pokemonlist.PokemonListScreen
import com.smile.testpokedex.ui.theme.TestPokedexTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestPokedexTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "list_screen",
                ) {
                    composable("list_screen") {
                        PokemonListScreen(navController = navController)
                    }
                    composable(
                        "detail_screen/{color}/{name}",
                        arguments = listOf(
                            navArgument("color") {
                                type = NavType.IntType
                            },
                            navArgument("name") {
                                type = NavType.StringType
                            }
                        )
                    ) {
                        val pokemonColor =  remember {
                            val color =  it.arguments?.getInt("color")
                            color?.let { Color(it) } ?: androidx.compose.ui.graphics.Color.White
                        }
                        val pokemonName = remember {
                            it.arguments?.getString("name")
                        }
                    }
                }
            }
        }
    }
}
