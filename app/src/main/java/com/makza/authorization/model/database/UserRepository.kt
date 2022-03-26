package com.makza.authorization.model.database

import kotlinx.coroutines.flow.MutableStateFlow

interface UserRepository {

//    val allUserData: MutableStateFlow<List<UserModel>>

    suspend fun insertUserData(userModel: UserModel, onSuccess:() -> Unit)
    suspend fun deleteUserData(userModel: UserModel, onSuccess:() -> Unit)



}