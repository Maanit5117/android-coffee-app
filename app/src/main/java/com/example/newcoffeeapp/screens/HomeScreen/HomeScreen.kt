package com.example.newcoffeeapp.screens.HomeScreen

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.newcoffeeapp.screens.UI_Components.MyBottomNavBar

@Composable
@Preview(showBackground = true, showSystemUi = true)

fun HomeScreen(){

    Scaffold(
        bottomBar = { MyBottomNavBar() }
    ){ }

}
