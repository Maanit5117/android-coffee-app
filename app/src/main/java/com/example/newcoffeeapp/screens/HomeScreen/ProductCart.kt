package com.example.newcoffeeapp.screens.HomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.newcoffeeapp.R
import com.example.newcoffeeapp.screens.model.Product
import com.example.newcoffeeapp.ui.theme.LightGray
import com.example.newcoffeeapp.ui.theme.LightMint
import com.example.newcoffeeapp.ui.theme.StarbucksGreen
import com.example.newcoffeeapp.ui.theme.Typography

@Composable


fun ProductCard(
    product: Product,
    modifier: Modifier = Modifier
){

    Card (
        modifier = modifier.fillMaxWidth().padding(8.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = LightMint
        ),
        elevation =  CardDefaults.cardElevation(
            defaultElevation = 8.dp
        )
    ){
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxWidth().height(160.dp)
                    .background(
                        color = LightGray.copy(alpha = 0.8f),
                        shape = RoundedCornerShape(8.dp)
                    )
            ){
                Image(
                    painter = painterResource(product.imageResources),
                    contentDescription = "espresso image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                        .clip(RoundedCornerShape(24.dp))
                )

                Box(
                    modifier = Modifier.align(Alignment.TopEnd)
                ){
                    Icon(painter = painterResource(R.drawable.regular_outline_heart),
                        contentDescription = "Favorite",
                        modifier= Modifier.size(34.dp),
                        tint = StarbucksGreen)
                }
            }



            Spacer(modifier = Modifier.height(7.dp))

            Text(
                text = product.name,
                style = MaterialTheme.typography.titleMedium,
                fontWeight= FontWeight.SemiBold,
                maxLines = 1,
            )

            Text(
                text = product.description,
                style = MaterialTheme.typography.titleSmall,
                fontWeight= FontWeight.SemiBold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )

            Spacer(modifier = Modifier.height(7.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "$${product.price}",
                    style = Typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = StarbucksGreen,
                    ),
                )

                IconButton(onClick = {},
                    modifier = Modifier.background(
                        color = LightMint,
                        shape = RoundedCornerShape(10.dp)
                    ).padding(16.dp).size(40.dp)) {
                    Icon(imageVector = Icons.Default.Add,
                        contentDescription = "Add Button")
                }
            }




        }
    }
}