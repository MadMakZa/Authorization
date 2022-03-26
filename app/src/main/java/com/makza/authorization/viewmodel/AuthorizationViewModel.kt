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

    private val _passwordSF = MutableStateFlow("")
    val passwordSF = _passwordSF.asStateFlow()

    fun setPassword(inputPass: String){
        _passwordSF.value = inputPass
    }








    fun testPrint(){
        println("~~ login: ${_loginSF.value}  password: ${_passwordSF.value}")
    }


}