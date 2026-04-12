package com.example.newcoffeeapp.presentation.screens.favourites

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.newcoffeeapp.R
import com.example.newcoffeeapp.domain.model.Product
import com.example.newcoffeeapp.presentation.screens.UI_Components.MyBottomNavBar
import com.example.newcoffeeapp.presentation.screens.navigation.Routes

@Composable

fun FavouriteScreen(navController: NavController){
    var favouriteItems by remember { mutableStateOf((listOf(
        Product(id = 1, "Espresso", "Strong and Bold", 6.99, R.drawable.espresso),
        Product(id = 2, "Latte", "Smooth and Creamy", 9.99, R.drawable.latte),
        Product(id = 3, "Cappuccino", "With Chocolate", 8.99, R.drawable.cappuccino)
    )
            )
    ) }

    Scaffold(
        topBar = {FavouriteScreenTopBar()},
        bottomBar = { MyBottomNavBar(navController = navController, "Favourites") }
    ) {innerpadding ->
        LazyColumn (
            modifier = Modifier.fillMaxSize().padding(16.dp).padding(innerpadding)
        ){
            item{
                favouriteItems.forEach { product ->
                    FavouriteItemCard(product,
                        onRemove = {
                            favouriteItems= favouriteItems - product
                        })
                }
            }


        }
    }




    }


