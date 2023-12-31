package com.example.playjuegos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.playjuegos.ui.theme.PlayJuegosTheme
import com.example.playjuegos.ui.theme.menuNewPlayer
import com.example.playjuegos.ui.theme.menuPlayJuegos

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlayJuegosTheme {
                // A surface container using the 'background' color from the theme
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                  val navController = rememberNavController()
                  NavHost(navController = navController, startDestination = "Portada") {
                      composable("Portada") { menuPlayJuegos(navController) }
                      composable("NewPlayer") { menuNewPlayer() }
                  }
                }
            }
        }
    }
}