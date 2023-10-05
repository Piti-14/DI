package com.example.playjuegos

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
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
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun MenuPreferences() {

    var choice: String = ""
    var punctuation: Float = 0f

    Column (
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.Start
    ){
        Text(text = "Choose one:", textAlign = TextAlign.Center, modifier = Modifier.padding(150.dp, 10.dp, 100.dp, 10.dp))
        choice = InitButtons()
        punctuation = ShowSlider()

        ShowFilterChips()
    }

    Box(
        Modifier
            .fillMaxSize()
            .padding(25.dp), contentAlignment = Alignment.BottomEnd
    ) {
        StartFAB(choice, punctuation)
    }
}

@Composable
fun InitButtons(): String {
    var radiusState by rememberSaveable { mutableStateOf("") }

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
            onClick = { radiusState = "Radiant Defense" },
            enabled = true,
            colors = RadioButtonDefaults.colors(selectedColor = Color.Yellow, unselectedColor = Color.Black)
        )

        Text(text = "Radiant Defense", Modifier.padding(top = 12.dp))
    }

    Row {
        RadioButton(
            selected = radiusState == "Ninja Jump",
            onClick = { radiusState = "Ninja Jump" },
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

    return radiusState
}

@Composable
fun ShowSlider(): Float {
    val range = 0f..10f
    val steps = 9

    var selection by remember {mutableStateOf(0f)}

    Slider(
        value = selection,
        valueRange = range,
        steps = steps,
        onValueChange = {selection = it},
        modifier = Modifier.padding(15.dp,0.dp, 15.dp,0.dp),
        //colors = SliderDefaults.colors(Color.Yellow)
    )

    return selection
}

@Composable
fun StartFAB(choice: String, punctuation: Float) {
    val context = LocalContext.current
    var message = ""

    FloatingActionButton(
        onClick = {
            if (choice != "") {
                message = "Has seleccionado $choice con una puntuación de $punctuation"
            } else {
                message = "No has seleccionado ninguna aplicación"
            }

            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        },
        shape = CircleShape,
    ){
        Image(painter = painterResource(id = R.drawable.tick), contentDescription = "Tick")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShowFilterChips() {
    var platform by rememberSaveable { mutableStateOf("") }
    val context = LocalContext.current

    Row(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        FilterChip(
            selected = (platform == "PS4"),
            onClick = {
                platform = "PS4";
                Toast.makeText(context, platform, Toast.LENGTH_SHORT).show()
            },
            label = { Text(text = "PS4") },
            leadingIcon = if (platform == "PS4") {
                {
                    Icon(
                        imageVector = Icons.Filled.Done,
                        contentDescription = "Done icon",
                        modifier = Modifier.size(FilterChipDefaults.IconSize)
                    )
                }
            } else {
                null
            }
        )

        FilterChip(
            selected = (platform == "XBOX"),
            onClick = {
                platform = "XBOX";
                Toast.makeText(context, platform, Toast.LENGTH_SHORT).show()
            },
            label = { Text(text = "XBOX") },
            leadingIcon = if (platform == "XBOX") {
                {
                    Icon(
                        imageVector = Icons.Filled.Done,
                        contentDescription = "Done icon",
                        modifier = Modifier.size(FilterChipDefaults.IconSize)
                    )
                }
            } else {
                null
            }
        )

        FilterChip(
            selected = (platform == "3DS"),
            onClick = {
                platform = "3DS";
                Toast.makeText(context, platform, Toast.LENGTH_SHORT).show()
            },
            label = { Text(text = "3DS") },
            leadingIcon = if (platform == "3DS") {
                {
                    Icon(
                        imageVector = Icons.Filled.Done,
                        contentDescription = "Done icon",
                        modifier = Modifier.size(FilterChipDefaults.IconSize)
                    )
                }
            } else {
                null
            }
        )

        FilterChip(
            selected = (platform == "WII"),
            onClick = {
                platform = "WII";
                Toast.makeText(context, platform, Toast.LENGTH_SHORT).show()
            },
            label = { Text(text = "WII") },
            leadingIcon = if (platform == "WII") {
                {
                    Icon(
                        imageVector = Icons.Filled.Done,
                        contentDescription = "Done icon",
                        modifier = Modifier.size(FilterChipDefaults.IconSize)
                    )
                }
            } else {
                null
            }
        )

        FilterChip(
            selected = (platform == "PC"),
            onClick = {
                platform = "PC";
                Toast.makeText(context, platform, Toast.LENGTH_SHORT).show()
            },
            label = { Text(text = "PC") },
            leadingIcon = if (platform == "PC") {
                {
                    Icon(
                        imageVector = Icons.Filled.Done,
                        contentDescription = "Done icon",
                        modifier = Modifier.size(FilterChipDefaults.IconSize)
                    )
                }
            } else {
                null
            }
        )
    }
}
