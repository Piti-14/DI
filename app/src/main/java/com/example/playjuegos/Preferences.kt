package com.example.playjuegos

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun MenuPreferences() {
    var radiusState by rememberSaveable { mutableStateOf("") }

    Column (
        modifier = Modifier.fillMaxSize(),
        //verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start
    ){
        Text(text = "Choose one:", textAlign = TextAlign.Center, modifier = Modifier.padding(150.dp, 10.dp, 100.dp, 10.dp))
        InitButtons()
        ShowSlider()

    }

    Box(
        Modifier
            .fillMaxSize()
            .padding(25.dp), contentAlignment = Alignment.BottomEnd) {
        StartFAB(radiusState, steps)
    }
}

@Composable
fun InitButtons() {

    Row {
        RadioButton(
            selected = radiusState == "Angry Birds",
            onClick = { radiusState = "Angry Birds"},
            enabled = true,
            colors = RadioButtonDefaults.colors(selectedColor = Color.Yellow, unselectedColor = Color.Black)
        )

        Text(text = "Angry Birds", Modifier.padding(top = 12.dp))
    }

    Row {
        RadioButton(
            selected = radiusState == "Dragon Fly",
            onClick = { radiusState = "Dragon Fly"},
            enabled = true,
            colors = RadioButtonDefaults.colors(selectedColor = Color.Yellow, unselectedColor = Color.Black)
        )

        Text(text = "Dragon Fly", Modifier.padding(top = 12.dp))
    }

    Row {
        RadioButton(
            selected = radiusState == "Hill Climbing Racing",
            onClick = { radiusState = "Hill Climbing Racing"},
            enabled = true,
            colors = RadioButtonDefaults.colors(selectedColor = Color.Yellow, unselectedColor = Color.Black)
        )

        Text(text = "Hill Climbing Racing", Modifier.padding(top = 12.dp))
    }

    Row {
        RadioButton(
            selected = radiusState == "Pocket Soccer",
            onClick = { radiusState = "Pocket Soccer"},
            enabled = true,
            colors = RadioButtonDefaults.colors(selectedColor = Color.Yellow, unselectedColor = Color.Black)
        )

        Text(text = "Pocket Soccer", Modifier.padding(top = 12.dp))
    }

    Row {
        RadioButton(
            selected = radiusState == "Radiant Defense",
            onClick = { radiusState = "Radiant Defense"},
            enabled = true,
            colors = RadioButtonDefaults.colors(selectedColor = Color.Yellow, unselectedColor = Color.Black)
        )

        Text(text = "Radiant Defense", Modifier.padding(top = 12.dp))
    }

    Row {
        RadioButton(
            selected = radiusState == "Ninja Jump",
            onClick = {radiusState = "Ninja Jump"},
            enabled = true,
            colors = RadioButtonDefaults.colors(selectedColor = Color.Yellow, unselectedColor = Color.Black)
        )

        Text(text = "Ninja Jump", Modifier.padding(top = 12.dp))
    }

    Row {
        RadioButton(
            selected = radiusState == "Air Control",
            onClick = { radiusState = "Air Control"},
            enabled = true,
            colors = RadioButtonDefaults.colors(selectedColor = Color.Yellow, unselectedColor = Color.Black)
        )

        Text(text = "Air Control", Modifier.padding(top = 12.dp))
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
        //colors = SliderDefaults.colors(Color.Yellow)
    )
}

@Composable
fun StartFAB(radiusState: String, sliderRange: Double) {
    val context = LocalContext.current
    var message = ""

    FloatingActionButton(
        onClick = {
            if (radiusState == "") {
                message = "Has seleccionado $radiusState con una puntuación de $sliderRange"
            } else {
                message = "No has seleccionado ninguna aplicación"
            }

            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        },
        shape = CircleShape,
    ){
        Image(painter = painterResource(id = R.drawable.tick), contentDescription = "Tick")
    }
}
