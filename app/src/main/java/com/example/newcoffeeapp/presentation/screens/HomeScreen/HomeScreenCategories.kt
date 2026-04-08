package com.example.newcoffeeapp.presentation.screens.HomeScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true, showSystemUi = true)

fun HomeScreenCategories(){
    val categories = listOf<String>("All ","Macchiato","Latte","Americano","Snacks","Desserts")

    var selectedCategory by remember { mutableStateOf(categories.first())
    }


    LazyRow (
        modifier = Modifier.padding(horizontal = 12.dp),
        horizontalArrangement = Arrangement.spacedBy(9.dp)
    ){
      items(categories){ category ->
          CategoryChip(
              text= category,
              isSelected =category == selectedCategory,
              onSelected = { selectedCategory= category}
          )
      }
    }
}
