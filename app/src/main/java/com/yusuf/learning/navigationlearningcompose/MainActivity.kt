package com.yusuf.learning.navigationlearningcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yusuf.learning.navigationlearningcompose.ui.theme.NavigationLearningComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationLearningComposeTheme {

                val navController = rememberNavController()


                //Container Navigasi
                NavHost(navController = navController, startDestination = Route.TampilanA.address ){

                    composable(route = "tampilanA_screen"){  // pembungkus tampilan
                        TampilanAScreen(navController = navController)
                    }

                    composable(route = Route.TampilanB.address){
                        TampilanBScreen(navController = navController)
                    }

                }
            }
        }
    }
}


// navController.navigate1  , navController.navigate2 ,
// navController.navigate("Hanya satu address")
//SplashScreen ---> LoginScreen  ---> Dashboard