package com.yusuf.learning.navigationlearningcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.yusuf.learning.navigationlearningcompose.ui.theme.Purple40

@Composable
fun TampilanBScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Hello Tampilan B",
            style = MaterialTheme.typography.headlineLarge
        )
        Button(
            onClick = {
                      navController.navigateUp()
//                      navController.navigate(Route.TampilanA.address)
            },
            colors = ButtonDefaults.buttonColors(Purple40)) {
            Text(text = "Balik A", color = Color.White, fontWeight = FontWeight.Bold)
        }
    }
}