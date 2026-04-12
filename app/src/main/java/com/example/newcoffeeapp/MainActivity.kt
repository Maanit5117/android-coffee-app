package com.example.newcoffeeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavController
import com.example.newcoffeeapp.presentation.screens.HomeScreen.HomeScreen
import com.example.newcoffeeapp.presentation.screens.cartScreen.CartScreen
import com.example.newcoffeeapp.presentation.screens.details.DetailsScreen
import com.example.newcoffeeapp.presentation.screens.navigation.NavGraph
import com.example.newcoffeeapp.presentation.screens.theme.NewCoffeeAppTheme
import com.example.newcoffeeapp.presentation.screens.welcomeScreen.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewCoffeeAppTheme {
                NavGraph()
                }
            }
        }
    }
 

