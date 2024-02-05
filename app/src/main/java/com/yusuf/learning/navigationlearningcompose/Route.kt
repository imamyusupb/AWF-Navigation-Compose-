package com.yusuf.learning.navigationlearningcompose

sealed class Route (val address :String) {
    data object TampilanA : Route("tampilanA_screen")
    data object TampilanB :Route("tampilanB_screen")
    data object Login  :Route("login_screen")
    data object Dashboard :Route("dashboard_screen")
}


//navController.navigate(Route.TampilanA.address) // cara 1
//navController.navigate("tampilanA_screen") // cara 2


