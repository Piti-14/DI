package com.example.playjuegos

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun MenuPlayJuegos(navController: NavHostController) {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_PORTRAIT -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                //color = MaterialTheme.colorScheme.background
            ) {
                MenuVertical(navController)
            }
        }

        else -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                //color = MaterialTheme.colorScheme.background
            ) {
                MenuHorizontal(navController)
            }
        }
    }
}

@Composable
fun MenuVertical(navController: NavHostController, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.portada),
        contentDescription = "icono",
        modifier = Modifier.size(150.dp)
    )

    Spacer(Modifier.height(10.dp))

    Text(
        text = stringResource(id = R.string.portada),
        fontSize = 50.sp,
        fontFamily = FontFamily(Font(R.font.courgette_regular))
    )

    Spacer(modifier = modifier.height(50.dp))

    Button(
        onClick = { /*TODO*/ },
        modifier = modifier
            .width(250.dp)
            .clip(RoundedCornerShape(34)),
        shape = RectangleShape
    )
    {
        Text(
            text = stringResource(id = R.string.button1),
            fontSize = 20.sp,
        )
    }

    Button(
        onClick = { navController.navigate("NewPlayer") },
        modifier = modifier
            .width(250.dp)
            .clip(RoundedCornerShape(34)),
        shape = RectangleShape
    )
    {
        Text(
            text = stringResource(id = R.string.button2),
            fontSize = 20.sp,
        )
    }

    Button(
        onClick = { navController.navigate("Preferences") },
        modifier = modifier
            .width(250.dp)
            .clip(RoundedCornerShape(34)),
        shape = RectangleShape
    )
    {
        Text(
            text = stringResource(id = R.string.button3),
            fontSize = 20.sp,
        )
    }

    Button(
        onClick = { /*TODO*/ },
        modifier = modifier
            .width(250.dp)
            .clip(RoundedCornerShape(34)),
        shape = RectangleShape
    ) {
        Text(
            text = stringResource(id = R.string.button4),
            fontSize = 20.sp,
        )
    }
}
@Composable
fun MenuHorizontal (navController: NavHostController, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.portada),
        contentDescription = "icono",
        modifier = Modifier.size(150.dp)
    )

    Spacer(Modifier.height(10.dp))

    Text(
        text = stringResource(id = R.string.portada),
        fontSize = 50.sp
    )

    Spacer(modifier = modifier.height(30.dp))

    Row {
        Button(
            onClick = {  },
            modifier = modifier
                .width(250.dp)
                .clip(RoundedCornerShape(34)),
            shape = RectangleShape
        )
        {
            Text(
                text = stringResource(id = R.string.button1),
                fontSize = 20.sp,
            )
        }

        Spacer(modifier = modifier.width(30.dp))

        Button(
            onClick = { navController.navigate("NewPlayer") },
            modifier = modifier
                .width(250.dp)
                .clip(RoundedCornerShape(34)),
            shape = RectangleShape
        )
        {
            Text(
                text = stringResource(id = R.string.button2),
                fontSize = 20.sp,
            )
        }
    }

    Spacer(modifier = modifier.height(10.dp))

    Row {
        Button(
            onClick = { navController.navigate("Prferences") },
            modifier = modifier
                .width(250.dp)
                .clip(RoundedCornerShape(34)),
            shape = RectangleShape
        )
        {
            Text(
                text = stringResource(id = R.string.button3),
                fontSize = 20.sp,
            )
        }

        Spacer(modifier = modifier.width(30.dp))

        Button(
            onClick = { /*TODO*/ },
            modifier = modifier
                .width(250.dp)
                .clip(RoundedCornerShape(34)),
            shape = RectangleShape
        )
        {
            Text(
                text = stringResource(id = R.string.button4),
                fontSize = 20.sp,
            )
        }
    }
}