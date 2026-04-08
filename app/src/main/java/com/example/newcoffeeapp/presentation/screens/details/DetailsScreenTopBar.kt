package com.example.newcoffeeapp.presentation.screens.details

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.newcoffeeapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showBackground = true, showSystemUi = true)

fun DetailsScreenTopBar(){


            TopAppBar(
                title = { Text("Details",
                    fontWeight = FontWeight.Bold) },
                actions = { Icon(
                    painter = painterResource(id = R.drawable.regular_outline_heart),
                    contentDescription = "Add to favourites",
                    modifier = Modifier.padding(12.dp)
                )
                },
                navigationIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.regular_outline_arrow_left),
                        contentDescription = "back button",
                        modifier = Modifier.padding(12.dp)
                    )
                }
            )
}


