package com.example.playjuegos

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
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
        InitButtons()
        ShowSlider()

    }

    Box(Modifier.fillMaxSize().padding(25.dp), contentAlignment = Alignment.BottomEnd) {
        StartFAB()
    }
}

@Composable
fun InitButtons() {
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

        Text(text = "Option 4", Modifier.padding(top = 12.dp))
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
            onClick = {  },
            enabled = true,
            colors = RadioButtonDefaults.colors(selectedColor = Color.Yellow, unselectedColor = Color.Black)
        )

        Text(text = "Opción 7", Modifier.padding(top = 12.dp))
    }
}

@Composable
fun ShowSlider() {
    val range = 0f..10f
    val steps = 10

    var selection by remember {mutableStateOf(0f)}

    Slider(
        value = selection,
        valueRange = range,
        steps = steps,
        onValueChange = {selection = it},
        modifier = Modifier.padding(15.dp,0.dp, 15.dp,0.dp),
        //colors = SliderDefaults.colors(Color.Gray)
    )
}

@Composable
fun StartFAB() {
    val context = LocalContext.current
    var message = ""

    FloatingActionButton(
        onClick = {
            if () {
                message = "Has seleccionado gameOption con una puntuación de rangoSlider"
            } else {
                message = "No has seleccionado ninguna aplicación"
            }

            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    ){}
}
