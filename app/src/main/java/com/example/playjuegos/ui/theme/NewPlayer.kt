package com.example.playjuegos.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.SemanticsActions.OnClick
import androidx.compose.ui.unit.dp
import com.example.playjuegos.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuNewPlayer() {
    Column {
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

        Spacer(modifier = Modifier.height(20.dp))

        Row {
            Spacer(modifier = Modifier.weight(1f))

            TextField(
                value = "Last Name",
                onValueChange = {},
                modifier = Modifier.weight(2f)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row {
            Spacer(modifier = Modifier.weight(1f))

            TextField(
                value = "Nickname",
                onValueChange = {},
                modifier = Modifier.weight(2f)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row {
            Spacer(modifier = Modifier.weight(1f))

            Image(
                painter = painterResource(id = R.drawable.android),
                contentDescription = "Android",
                modifier = Modifier.weight(1f)
            )

            Button(onClick = { /*TODO*/ }) {
                Text(
                    text = "Change",
                    color = Purple80
                    )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row {
            Image(
                painter = painterResource(id = R.drawable.camera),
                contentDescription = "Camera",
                modifier = Modifier.weight(1f)
            )

            TextField(
                value = "Phone Number",
                onValueChange = {""},
                modifier = Modifier.weight(2f)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row {
            Image(
                painter = painterResource(id = R.drawable.email),
                contentDescription = {},
                modifier = Modifier.weight(1f)
            )

            TextField(
                value = "Email",
                onValueChange = {""},
                modifier = Modifier.weight(2f)
            )
        }
    }
}