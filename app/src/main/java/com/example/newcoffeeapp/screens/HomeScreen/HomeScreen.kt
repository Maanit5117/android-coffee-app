package com.example.newcoffeeapp.screens.HomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newcoffeeapp.R
import com.example.newcoffeeapp.screens.UI_Components.MyBottomNavBar
import com.example.newcoffeeapp.screens.model.Product
import com.example.newcoffeeapp.ui.theme.CreamBeige
import com.example.newcoffeeapp.ui.theme.IvoryWhite

@Composable
@Preview(showBackground = true, showSystemUi = true)

fun HomeScreen(){


    val location = "New Delhi, 110087"
    Scaffold(
        bottomBar = { MyBottomNavBar() }
    ){ innerPadding ->
        Box(
            modifier = Modifier.fillMaxWidth().fillMaxHeight(1f/3f)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF303030),
                            Color(0xFF1F1F1F),
                            Color(0xFF121212),

                        )
                    )
                ).padding(innerPadding)
        )

        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp).padding(innerPadding)
        ) {



            // displaying products
            val products = listOf(
                Product(id = 1, "Espresso","Strong and Bold",6.99, R.drawable.espresso),
                Product(id = 2, "Latte","Smooth and Creamy",9.99, R.drawable.latte),
                Product(id = 3, "Cappuccino","With Chocolate",8.99, R.drawable.cappuccino),
                Product(id = 4, "Mocha","With cocoa Flavour",10.99, R.drawable.mocha),
                Product(id = 5, "Macchiato","Bold and Milky",10.49, R.drawable.machiato),
                Product(id = 6, "Flat White","velvety smooth",9.69, R.drawable.flatwhite),
                Product(id = 7, "Iced Latte","Refreshing and Rich",11.99, R.drawable.icedlatte),
            )

            ProductsGrid(products = products){
                Text(text = "Location",
                    color = IvoryWhite,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.height(6.dp))

                Row (){
                    Text(text = location,
                        color = IvoryWhite)
                    Icon(imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = "Change Location",
                        tint = IvoryWhite
                    )
                }

                Spacer(modifier = Modifier.height(30.dp))

                MySearchBar()

                Spacer(modifier = Modifier.height(40.dp))

                Image(painter = painterResource(com.example.newcoffeeapp.R.drawable.new_banner),
                    contentDescription = "Banner",
                    modifier = Modifier
                        .clip(RoundedCornerShape(16.dp)).fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(16.dp))

                HomeScreenCategories()

            }
        }
    }

}
