package com.example.newcoffeeapp.presentation.screens.cartScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.newcoffeeapp.R
import com.example.newcoffeeapp.domain.model.Product
import com.example.newcoffeeapp.presentation.screens.UI_Components.MyBottomNavBar
import com.example.newcoffeeapp.presentation.screens.theme.LightMint
import com.example.newcoffeeapp.presentation.screens.theme.StarbucksGreen

@Composable

fun CartScreen(navController: NavController){

    var Amount by remember { mutableStateOf(25.97) }
    var DeliveryFee by remember { mutableStateOf(1.50) }
    val totalAmount = Amount + DeliveryFee

    val products = listOf(
        Product(id = 1, "Espresso", "Strong and Bold", 6.99, R.drawable.espresso),
        Product(id = 2, "Latte", "Smooth and Creamy", 9.99, R.drawable.latte),
        Product(id = 3, "Cappuccino", "With Chocolate", 8.99, R.drawable.cappuccino)
    )
    Scaffold(
        topBar = {CartScreenTopBar(navController)},
        bottomBar = { MyBottomNavBar(navController = navController, "Cart") }
    ) {innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                .padding(innerPadding)
        ) {
            item {
                Row {
                    Text(text = "Deliver",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        color = StarbucksGreen
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                products.forEach { product ->
                    CartItemCard(product = product)
                }

                Spacer(modifier = Modifier.height(20.dp))

                Text(text = "Pyment Summary",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold
                    ),
                    color = StarbucksGreen,
                    fontSize = 22.sp)

                Spacer(modifier = Modifier.height(15.dp))

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(text = "Price",
                        color = StarbucksGreen)
                    Text(text = "$ $Amount",
                        color = StarbucksGreen)
                }

                Spacer(modifier = Modifier.height(10.dp))

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(text = "Delivery Fee",
                        color = StarbucksGreen)
                    Text(text = "$ $DeliveryFee",
                        color = StarbucksGreen)
                }

                Spacer(modifier = Modifier.height(16.dp))

                Card (
                    modifier = Modifier.fillMaxWidth()
                ){

                    Column (
                        modifier = Modifier.padding(16.dp)
                    ){
                        Icon(painter = painterResource(R.drawable.mobile_banking),
                            contentDescription = "Online Payment",
                            modifier = Modifier.size(24.dp),
                            tint = StarbucksGreen
                        )

                        Text(text = "Net Amount",
                            style = MaterialTheme.typography.titleMedium)

                        Text(text = "$ $totalAmount",
                            style = MaterialTheme.typography.titleMedium)
                    }
                    Button(
                        onClick = { },
                        modifier = Modifier.padding(20.dp).fillMaxWidth().height(50.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Black
                        ),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text(text = "Place Order", fontWeight = FontWeight.Bold, fontSize = 25.sp)
                    }
                }
            }
        }
    }
}
