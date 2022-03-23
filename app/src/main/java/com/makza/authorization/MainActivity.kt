package com.makza.authorization

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import com.makza.authorization.theme.AuthorizationTheme
import com.makza.authorization.view.AuthorizationView
import com.makza.authorization.viewmodel.AuthorizationViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModelAuth = AuthorizationViewModel()


        setContent {
            AuthorizationTheme {
                // A surface container using the 'background' color from the theme
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(bottom = 200.dp)
                ) {
                    AuthorizationView(AuthorizationViewModel())
                }
            }
        }
    }
}


