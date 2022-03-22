package com.makza.authorization

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.makza.authorization.ui.theme.AuthorizationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AuthorizationTheme {
                // A surface container using the 'background' color from the theme
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    AuthorizationBlock()
                }
            }
        }
    }
}


@Preview
@Composable
fun AuthorizationBlock(){

    var login by rememberSaveable { mutableStateOf("")}
    var password by rememberSaveable { mutableStateOf("")}
    val maxChar = 50
    val context = LocalContext.current

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        TextField(
            shape = RoundedCornerShape(20.dp),
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            ),
            value = login,
            onValueChange = {
                if(it.length <= maxChar)
                login = it
            },
            label = { Text("login")},
            singleLine = true
        )

        TextField(
            shape = RoundedCornerShape(20.dp),
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            ),
            value = password,
            onValueChange = {
                if(it.length <= maxChar)
                    password = it
            },
            label = { Text("password")},
            singleLine = true
        )


        Button(

            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Blue,
                contentColor = Color.Black
            ),
            onClick = {
                Toast.makeText(context,"Logging", Toast.LENGTH_LONG).show()
            }) {
            Text("Login")
        }
    }
}