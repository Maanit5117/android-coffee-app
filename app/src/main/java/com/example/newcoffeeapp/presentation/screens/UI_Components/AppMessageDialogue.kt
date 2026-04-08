package com.example.newcoffeeapp.presentation.screens.UI_Components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable

@Composable

fun AppMessageDialogue(
    show: Boolean,
    title: String,
    message: String,
    onDismiss: () -> Unit

){
    if(show){
      AlertDialog(
          onDismissRequest = onDismiss,
          title = { Text(text = title) },
          text = {Text(text = message)},
          confirmButton = { TextButton(onClick = onDismiss) {Text("Ok")} }
      )
    }

}