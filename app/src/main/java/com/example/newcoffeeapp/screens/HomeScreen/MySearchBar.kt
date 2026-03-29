package com.example.newcoffeeapp.screens.HomeScreen

import android.R.attr.contentDescription
import androidx.compose.foundation.background
import com.example.newcoffeeapp.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.newcoffeeapp.ui.theme.CoffeeBrown
import com.example.newcoffeeapp.ui.theme.IvoryWhite
import com.example.newcoffeeapp.ui.theme.StarbucksGreen
import kotlin.contracts.contract


@Composable
@Preview(showBackground = true, showSystemUi = true)

fun MySearchBar(){

    var searchText by remember { mutableStateOf("") }

    Row (
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ){
        TextField( value = searchText,
            onValueChange = {searchText= it},
            placeholder = { Text(text = "Search Coffee") },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon")
            },
            shape = RoundedCornerShape(topStart = 16.dp, topEnd = 0.dp, bottomStart = 16.dp, bottomEnd = 0.dp),
            singleLine = true,
            modifier = Modifier.weight(1f).height(56.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = IvoryWhite,
                unfocusedContainerColor = IvoryWhite,
            )
        )

        Spacer(modifier = Modifier.width(9.dp))

        IconButton(onClick = {},
            modifier = Modifier.background(
                color = StarbucksGreen,
                shape = RoundedCornerShape(topStart = 0.dp, topEnd = 16.dp, bottomStart = 0.dp, bottomEnd = 16.dp)
            ).size(56.dp)) {
           Icon(painter = painterResource(R.drawable.regular_outline_filter),
               contentDescription = "Filter")
            
        }
    }
}
