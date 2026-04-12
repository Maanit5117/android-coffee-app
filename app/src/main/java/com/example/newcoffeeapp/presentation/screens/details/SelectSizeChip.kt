package com.example.newcoffeeapp.presentation.screens.details

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.example.newcoffeeapp.presentation.screens.theme.LightMint
import com.example.newcoffeeapp.presentation.screens.theme.StarbucksGreen

@Composable


fun SelectSizeChip(sizeText: String, selected: Boolean, onClick: () -> Unit,modifier: Modifier= Modifier){


        Box(
            modifier = Modifier
                .height(46.dp)
                .width(100.dp)
                .border(1.dp, color = LightMint, shape = RoundedCornerShape(12.dp))
                .background( if(selected) StarbucksGreen else LightMint,
                    shape = RoundedCornerShape(12.dp))
                .clickable{onClick()},
            contentAlignment = Alignment.Center
        ){
            Text(text = sizeText,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black)
        }
    }

