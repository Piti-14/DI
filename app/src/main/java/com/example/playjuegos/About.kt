package com.example.playjuegos

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MenuAbout() {

    val images = listOf(R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5, R.drawable.image6, R.drawable.image7)
    val points = listOf(2014, 2056, 5231, 1892, 4547, 9941, 1664)
    val names = listOf("María Mata", "Antonio Sanz", "Carlos Pérez", "Beatriz Martos", "Jaime Costa", "Alba Duvall", "Marta Petra" )

    CreateLazyColumn(names = names, points = points, images = images)
}

@Composable
fun CreateLazyColumn(names: List<String>, points: List<Int>, images: List<Int>){

    var context = LocalContext.current

    LazyColumn(Modifier.padding(10.dp)) {
        for (i in names.indices){
            item {
                Row (horizontalArrangement = Arrangement.Center){
                    Image(
                        painter = painterResource(id = images.get(i)),
                        contentDescription = "Image nº $i",
                        modifier = Modifier.clickable { Toast.makeText(context, names.get(i), Toast.LENGTH_SHORT).show() }
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    Column (modifier = Modifier.padding(start = 35.dp, top = 45.dp).clickable { Toast.makeText(context, names.get(i), Toast.LENGTH_SHORT).show() }) {
                        Text(text = names.get(i), style = TextStyle(fontWeight = Bold, fontSize = 18.sp))

                        Text(text = "Points: " + points.get(i), style = TextStyle(fontStyle = FontStyle.Italic ))
                    }
                }
                Spacer(modifier = Modifier.height(15.dp))
            }
        }
    }
}