package com.example.playjuegos

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.playjuegos.R
import com.example.playjuegos.ui.theme.Green100
import com.example.playjuegos.ui.theme.Green300
import com.example.playjuegos.ui.theme.Orange300

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuNewPlayer() {
    Column (Modifier.fillMaxSize()){
        var nameText by remember { mutableStateOf(TextFieldValue("")) }
        var lastnameText by remember { mutableStateOf(TextFieldValue("")) }
        var nicknameText by remember { mutableStateOf(TextFieldValue("")) }
        var phoneText by remember { mutableStateOf(TextFieldValue("")) }
        var emailText by remember { mutableStateOf(TextFieldValue("")) }

        Spacer(modifier = Modifier.height(20.dp))

        Row (Modifier.weight(1f)){
            Image(
                painter = painterResource(id = R.drawable.account),
                contentDescription = "Account",
                modifier = Modifier
                    .weight(0.9f)
                    .fillMaxSize()
            )

            TextField(
                value = nameText,
                onValueChange = {newText -> nameText = newText},
                label = {Text(
                            "Name",
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                        textColor = Color.DarkGray
                                    )
                            )
                        },
                modifier = Modifier.weight(1.9f),
                shape = RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Orange300,
                    containerColor = Green300,
                    textColor = Color.Black,
                )
            )
            
            Spacer(modifier = Modifier.weight(0.1f))
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row (Modifier.weight(1f)){
            Spacer(modifier = Modifier.weight(0.9f))

            TextField(
                value = lastnameText,
                onValueChange = { newText -> lastnameText = newText},
                label = {Text("Lastname")},
                modifier = Modifier.weight(1.9f),
                shape = RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp)
            )

            Spacer(modifier = Modifier.weight(0.1f))
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row (Modifier.weight(1f)){
            Spacer(modifier = Modifier.weight(0.9f))

            TextField(
                value = nicknameText,
                onValueChange = { newText -> nicknameText = newText},
                label = {Text("Nickname")},
                modifier = Modifier.weight(1.9f),
                shape = RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp)
            )

            Spacer(modifier = Modifier.weight(0.1f))
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row (horizontalArrangement = Arrangement.SpaceEvenly){
            Spacer(modifier = Modifier.width(125.dp))

            Image(
                painter = painterResource(id = R.drawable.android),
                contentDescription = "Android",
                modifier = Modifier.size(125.dp)
            )
            
            Spacer(modifier = Modifier.width(20.dp))
            
            Button(
                onClick = { /*TODO*/ },
                shape = RectangleShape,
                modifier = Modifier.clip(shape = RoundedCornerShape(11.dp)),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Orange300,
                    //contentColor = Orange300
                ),
            ) {
                Text(
                    text = "Change",
                    style = TextStyle(color = Color.Black)
                )

            }

            Spacer(modifier = Modifier.weight(0.1f))
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row (Modifier.weight(1f)){
            Image(
                painter = painterResource(id = R.drawable.camera),
                contentDescription = "Camera",
                modifier = Modifier
                    .weight(0.9f)
                    .fillMaxSize()
            )

            TextField(
                value = phoneText,
                onValueChange = { newText -> phoneText = newText},
                label = {Text("Phone Number")},
                modifier = Modifier.weight(1.9f),
                shape = RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp),

            )

            Spacer(modifier = Modifier.weight(0.1f))
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row (Modifier.weight(1f)){
            Image(
                painter = painterResource(id = R.drawable.email),
                contentDescription = "Mail",
                modifier = Modifier
                    .weight(0.9f)
                    .fillMaxSize()
            )

            TextField(
                value = emailText,
                onValueChange = {newText -> emailText = newText},
                label = {Text("Email")},
                modifier = Modifier.weight(1.9f),
                shape = RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp)
            )

            Spacer(modifier = Modifier.weight(0.1f))
        }
        
        Spacer(modifier = Modifier.weight(3f))
    }
}