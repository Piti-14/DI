package com.example.playjuegos

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun MenuPreferences() {

    Column (
        modifier = Modifier.fillMaxSize(),
        //verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start
    ){
        Text(text = "Choose one:", textAlign = TextAlign.Center, modifier = Modifier.padding(150.dp, 10.dp, 100.dp, 10.dp))
        initButtons()
    }
}
@Composable
fun initButtons() {
    Row {
        RadioButton(
            selected = false,
            onClick = { /*TODO*/ },
            enabled = true,
            colors = RadioButtonDefaults.colors(selectedColor = Color.Yellow, unselectedColor = Color.Black)
        )

        Text(text = "Opción 1", Modifier.padding(top = 12.dp))
    }

    Row {
        RadioButton(
            selected = false,
            onClick = { /*TODO*/ },
            enabled = true,
            colors = RadioButtonDefaults.colors(selectedColor = Color.Yellow, unselectedColor = Color.Black)
        )

        Text(text = "Opción 2", Modifier.padding(top = 12.dp))
    }

    Row {
        RadioButton(
            selected = false,
            onClick = { /*TODO*/ },
            enabled = true,
            colors = RadioButtonDefaults.colors(selectedColor = Color.Yellow, unselectedColor = Color.Black)
        )

        Text(text = "Opción 3", Modifier.padding(top = 12.dp))
    }

    Row {
        RadioButton(
            selected = false,
            onClick = { /*TODO*/ },
            enabled = true,
            colors = RadioButtonDefaults.colors(selectedColor = Color.Yellow, unselectedColor = Color.Black)
        )

        Text(text = "Opción 4", Modifier.padding(top = 12.dp))
    }

    Row {
        RadioButton(
            selected = false,
            onClick = { /*TODO*/ },
            enabled = true,
            colors = RadioButtonDefaults.colors(selectedColor = Color.Yellow, unselectedColor = Color.Black)
        )

        Text(text = "Opción 5", Modifier.padding(top = 12.dp))
    }

    Row {
        RadioButton(
            selected = false,
            onClick = { /*TODO*/ },
            enabled = true,
            colors = RadioButtonDefaults.colors(selectedColor = Color.Yellow, unselectedColor = Color.Black)
        )

        Text(text = "Opción 6", Modifier.padding(top = 12.dp))
    }

    Row {
        RadioButton(
            selected = false,
            onClick = { /*TODO*/ },
            enabled = true,
            colors = RadioButtonDefaults.colors(selectedColor = Color.Yellow, unselectedColor = Color.Black)
        )

        Text(text = "Opción 7", Modifier.padding(top = 12.dp))
    }
}
