package com.example.newcoffeeapp.presentation.screens.navigation

import android.app.FragmentManager
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.newcoffeeapp.presentation.screens.welcomeScreen.WelcomeScreen
import com.example.newcoffeeapp.welcomeScreen.WelcomeScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.newcoffeeapp.presentation.screens.HomeScreen.HomeScreen
import com.example.newcoffeeapp.presentation.screens.cartScreen.CartScreen
import com.example.newcoffeeapp.presentation.screens.details.DetailsScreen
import com.example.newcoffeeapp.presentation.screens.navigation.Routes

@Composable
fun NavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.WelcomeScreen
    ) {

        composable<Routes.WelcomeScreen> {
            WelcomeScreen(navController)
        }

        composable<Routes.HomeScreen> {
            HomeScreen(navController)
        }

        composable<Routes.DetailsScreen> { backStackEntry ->
            val args = backStackEntry.toRoute<Routes.DetailsScreen>()

            DetailsScreen(
                productID = args.productId,
                navController = navController
            )

        }
        composable<Routes.CartScreen> {
            CartScreen(navController)
        }
    }
}
