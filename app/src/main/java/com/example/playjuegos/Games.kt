package com.example.playjuegos

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Checkbox
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun MenuGames() {

    var names by rememberSaveable {  mutableStateOf(ArrayList<String>()) }

    Column (
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
            .padding(10.dp),
        //verticalArrangement = Arrangement.SpaceEvenly,
        //horizontalAlignment = Alignment.Start
    ) {
        CreateGameRow(R.drawable.games_angrybirds, "Angry Birds", 15.dp, names)
        CreateGameRow(R.drawable.games_dragonfly, "Dragon Fly", 15.dp, names)
        CreateGameRow(R.drawable.games_hillclimbingracing, "Hill Climbing Racing", 15.dp, names)
        CreateGameRow(R.drawable.games_radiantdefense, "Radiant Defense", 15.dp, names)
        CreateGameRow(R.drawable.games_pocketsoccer, "Pocket Soccer", 15.dp, names)
        CreateGameRow(R.drawable.games_ninjump, "Ninja Jump", 15.dp, names)
        CreateGameRow(R.drawable.games_aircontrol, "Air Control", 15.dp, names)
    }

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(15.dp), contentAlignment = Alignment.BottomEnd){
        PlaceFAB(names)
    }
}

@Composable
fun CreateGameRow(id: Int, description: String, spacerSize: Dp, names: ArrayList<String>){

    var name = ""
    var state by rememberSaveable { mutableStateOf(names) }

    Row (){
        Image(
            painter = painterResource(id = id),
            contentDescription = description,
            Modifier.size(80.dp)
        )

        Checkbox(
            checked = state.contains(name),
            onCheckedChange = {
                if (!state.contains(description)) {
                    name = description
                    names.add(name)
                } else {
                    names.remove(name)
                }
            },
            enabled = true,
            modifier = Modifier.padding(top = 15.dp)
        )

        Text(text = description, Modifier.padding(top = 25.dp))
    }

    Spacer(modifier = Modifier.height(spacerSize))
}

@OptIn(ExperimentalStdlibApi::class)
@Composable
fun PlaceFAB(names: ArrayList<String>) {

    var message = "Has seleccionado "
    val context = LocalContext.current

    FloatingActionButton(
        onClick = {
            if (names.size == 1) {
                message += names.get(0)
            } else if (names.size == 0){
                message = "No has seleccionado ninguna opción"
            } else {
                for (i in 0..<names.size - 2) {
                    message += names.get(i) + ", "
                }
                message += names.get(names.lastIndex - 1) + " y " + names.get(names.lastIndex)
            }

            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
            message = "Has seleccionado "
        },
        shape = CircleShape
    ) {
        Image(painter = painterResource(id = R.drawable.tick), contentDescription = "Tick")
    }
}