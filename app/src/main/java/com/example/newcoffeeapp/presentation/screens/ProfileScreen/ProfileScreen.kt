package com.example.newcoffeeapp.presentation.screens.ProfileScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.newcoffeeapp.presentation.screens.UI_Components.MyBottomNavBar
import com.example.newcoffeeapp.presentation.screens.navigation.Routes
import com.example.newcoffeeapp.presentation.screens.theme.LightMint
import com.example.newcoffeeapp.presentation.screens.theme.StarbucksGreen

@Composable


fun ProfileScreen(navController: NavHostController) {

    Scaffold(
        topBar = { ProfileScreenTopBar() },
        bottomBar = { MyBottomNavBar(navController = navController,"Profile") }
    ) { innerpadding ->

        Column (
            modifier = Modifier.fillMaxSize().padding(16.dp).padding(innerpadding)
        ){
            Column (
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Box(
                    modifier = Modifier
                        .size(120.dp)
                        .clip(CircleShape)
                        .background(
                            color = LightMint.copy(alpha = 0.3f)
                        ),
                    contentAlignment = Alignment.Center
                ){
                    Icon(imageVector = Icons.Default.Person,
                        contentDescription = "Profile Pic",
                        modifier = Modifier.size(75.dp),
                        tint = StarbucksGreen
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                Text(text = "Maanit Mittra",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.SemiBold)

                Text(text = "abc123@gmail.com",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Light)
            }

            Spacer(modifier = Modifier.height(70.dp))

            Text(text = "Address",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.SemiBold)

            Text(text = "New Delhi, \n110087",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Light)

            Spacer(modifier = Modifier.height(40.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(contentColor = StarbucksGreen, containerColor = LightMint)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth().clickable{navController.navigate(Routes.CartScreen)},
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Icon(imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "cart",
                            tint = StarbucksGreen,)

                        Spacer(modifier = Modifier.width(16.dp))

                        Text(text = "Cart",
                            fontSize = 16.sp)
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    HorizontalDivider(
                        color = Color.LightGray.copy(alpha = 0.7f)
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Row (
                        modifier = Modifier.fillMaxWidth().clickable{navController.navigate(Routes.FavouriteScreen)},
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Icon(imageVector = Icons.Default.Favorite,
                            contentDescription = "cart",
                            tint = StarbucksGreen,)


                        Text(text = "Favourites",
                            fontSize = 16.sp)
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    HorizontalDivider(
                        color = Color.LightGray.copy(alpha = 0.7f)
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Row (
                        modifier = Modifier.fillMaxWidth().clickable{},
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Icon(imageVector = Icons.Default.Settings,
                            contentDescription = "cart",
                            tint = StarbucksGreen,)


                        Text(text = "Settings",
                            fontSize = 16.sp)
                    }


                }
            }
        }
    }




}