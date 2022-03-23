package com.makza.authorization.view

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.makza.authorization.viewmodel.AuthorizationViewModel

@Composable
fun AuthorizationView(viewModel: AuthorizationViewModel){

    var login by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
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
            label = { Text("login") },
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
            label = { Text("password") },
            singleLine = true
        )


        Button(
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Magenta,
                contentColor = Color.Black
            ),
            onClick = {
                if (login.isNotBlank() && password.isNotBlank()) {
                    viewModel.setLogin(login)
                    viewModel.testPrint()
                    Toast.makeText(context, "Logging", Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(context, "Error: invalid e-mail or password", Toast.LENGTH_LONG).show()
                }
            }) {
            Text("Login")
        }
    }
}