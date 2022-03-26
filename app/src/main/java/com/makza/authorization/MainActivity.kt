package com.makza.authorization

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import com.makza.authorization.model.database.APP
import com.makza.authorization.theme.AuthorizationTheme
import com.makza.authorization.view.AuthorizationView
import com.makza.authorization.viewmodel.AuthorizationViewModel

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val authorizationViewModel = ViewModelProvider(this).get(AuthorizationViewModel::class.java)
        authorizationViewModel.initDataBase()

        setContent {
            AuthorizationTheme {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(bottom = 200.dp)
                ) {
                    AuthorizationView(authorizationViewModel)
                }
            }
        }


    }

}


