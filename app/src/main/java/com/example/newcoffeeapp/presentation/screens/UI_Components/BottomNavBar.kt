package com.example.newcoffeeapp.presentation.screens.UI_Components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.newcoffeeapp.R
import com.example.newcoffeeapp.presentation.screens.theme.StarbucksGreen

@Composable
@Preview(showBackground = true, showSystemUi = true)

fun MyBottomNavBar(){
    // Bottom Nav Items
    val navItems= listOf(
        NavItem(title = "Home", R.drawable.regular_outline_home ),
        NavItem(title = "Cart", R.drawable.regular_outline_bag ),
        NavItem(title = "Favourites", R.drawable.regular_outline_heart ),
        NavItem(title = "Profile", R.drawable.outline_account_circle_24 )
    )

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
        modifier = Modifier.height(100.dp)
    ) {
        navItems.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = item.title

                    )
                },
                label = { Text(item.title) },
                modifier = Modifier.size(30.dp),
                onClick = {},
                selected = true,
                alwaysShowLabel = false,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = StarbucksGreen,
                    selectedTextColor = StarbucksGreen,
                    unselectedIconColor = Color.DarkGray,
                    unselectedTextColor = Color.DarkGray,
                    indicatorColor = MaterialTheme.colorScheme.surface,

                )
            )
        }
    }
}

data class NavItem(
    val title: String,
    val icon: Int
)