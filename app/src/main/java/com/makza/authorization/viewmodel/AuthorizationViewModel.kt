package com.makza.authorization.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.makza.authorization.MainActivity
import com.makza.authorization.model.database.REPOSITORY
import com.makza.authorization.model.database.UserDataBase
import com.makza.authorization.model.database.UserModel
import com.makza.authorization.model.database.UserRealization
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class AuthorizationViewModel(application: Application): AndroidViewModel(application) {

    private val context = application

    fun initDataBase(){
        val daoUser = UserDataBase.getInstance(context = context).getUserDao()
        REPOSITORY = UserRealization(userDao = daoUser)
    }

//    fun getAllUsers(): MutableStateFlow<List<UserModel>>{
//        return REPOSITORY.allUserData
//    }

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