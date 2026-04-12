package com.example.newcoffeeapp.presentation.screens.favourites


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.newcoffeeapp.R
import com.example.newcoffeeapp.presentation.screens.theme.StarbucksGreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable


fun FavouriteScreenTopBar(){


    TopAppBar(
        title = { Text("WishList",
            fontWeight = FontWeight.Bold,
            color = StarbucksGreen,
            fontSize = 30.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        ) },


    )
}


