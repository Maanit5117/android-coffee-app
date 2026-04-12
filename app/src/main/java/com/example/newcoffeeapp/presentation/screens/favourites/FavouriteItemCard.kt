package com.example.newcoffeeapp.presentation.screens.favourites

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newcoffeeapp.R
import com.example.newcoffeeapp.domain.model.Product
import com.example.newcoffeeapp.presentation.screens.theme.LightMint
import com.example.newcoffeeapp.presentation.screens.theme.StarbucksGreen

@Composable


fun FavouriteItemCard(product: Product, onRemove: () -> Unit){

    var quantity by remember { mutableStateOf(1) }


    Card (
        modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = LightMint
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,

            ){
            Image(painter = painterResource(id = product.imageResources),
                contentDescription = "Coffee 1",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .size(70.dp)
                    )

            Column (
                modifier = Modifier
                    .weight(1f)
                    .padding(12.dp)
            ){
                Text(text = product.name,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.bodyLarge)

                Text(text = product.description,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.DarkGray)
            }

            Row (
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ){
                IconButton(onClick = onRemove,
                    modifier = Modifier.size(36.dp)){
                    Icon(imageVector = Icons.Default.Delete,
                        contentDescription = "Delete",
                        tint = Color.Black
                    )
                }


            }
        }
    }
}