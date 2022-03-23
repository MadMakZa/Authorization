package com.makza.authorization.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class AuthorizationViewModel: ViewModel() {

    private val _loginSF = MutableStateFlow("")
    val loginSF = _loginSF.asStateFlow()

    fun setLogin(inputLogin: String){
        _loginSF.value = inputLogin
    }

    fun testPrint(){
        println("~~ ${_loginSF.value}")
    }


}