package com.example.newcoffeeapp.presentation.screens.details

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newcoffeeapp.presentation.screens.theme.IvoryWhite
import com.example.newcoffeeapp.presentation.screens.theme.LightMint
import com.example.newcoffeeapp.presentation.screens.theme.StarbucksGreen


@Composable

fun DetailsScreenBottomBar(){

    BottomAppBar(
        containerColor = Color.Transparent
    ) {
        Row (
            modifier = Modifier.padding(horizontal = 16.dp)
        ){
            Column(
            ) {
                Text(text = "Price",
                    fontSize =  18.sp)

                Spacer(
                    modifier = Modifier.height(8.dp)
                )

                Text(text = "$4.53",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.SemiBold)
            }
            Spacer(
                modifier = Modifier.width(120.dp)
            )

            Button(onClick = {},
                modifier = Modifier.weight(1f).height(50.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = StarbucksGreen,
                    contentColor = IvoryWhite
                )
            ){
                Text(text = "Add To Cart",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold)
            }
        }


    }
}

