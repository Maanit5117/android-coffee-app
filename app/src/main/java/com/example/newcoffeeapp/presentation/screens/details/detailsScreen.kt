package com.example.newcoffeeapp.presentation.screens.details

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.newcoffeeapp.R
import com.example.newcoffeeapp.domain.model.Product

@Composable
@Preview(showBackground = true, showSystemUi = true)

fun DetailsScreen(){
    val products = listOf(
        Product(id = 1, "Espresso","Strong and Bold",6.99, R.drawable.espresso),
        Product(id = 2, "Latte","Smooth and Creamy",9.99, R.drawable.latte),
        Product(id = 3, "Cappuccino","With Chocolate",8.99, R.drawable.cappuccino),
        Product(id = 4, "Mocha","With cocoa Flavour",10.99, R.drawable.mocha),
        Product(id = 5, "Macchiato","Bold and Milky",10.49, R.drawable.machiato),
        Product(id = 6, "Flat White","velvety smooth",9.69, R.drawable.flatwhite),
        Product(id = 7, "Iced Latte","Refreshing and Rich",11.99, R.drawable.icedlatte),
    )

    var selectedProduct = products.find { it.id == 1 }

    Scaffold(
        topBar = {DetailsScreenTopBar()},
        bottomBar = {DetailsScreenBottomBar()}
    ){
        innerPadding ->

//        LazyColumn {
//            item{
//                productDetailsContent(selectedProduct,innerPadding)
//
//            }
        }
    }

