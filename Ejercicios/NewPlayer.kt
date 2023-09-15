package com.example.playjuegos.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.playjuegos.R

@Composable
fun menuNewPlayer() {
    Row {
        Image(
            painter = painterResource(id = R.drawable.account),
            contentDescription = "Cuenta",
            modifier = Modifier.weight(1f)
        )

        TextField(
            value = "Name",
            onValueChange = {},
            modifier = Modifier.weight(2f)
        )
                
    }
    
    
}