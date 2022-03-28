package com.makza.authorization.model.database

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

interface UserRepository {

    suspend fun getAllUsers(userDataBase: UserDataBase): Flow<List<UserModel>> {
        return userDataBase.getUserDao().getAllUserData()
    }
    suspend fun insertUserData(userModel: UserModel, onSuccess:() -> Unit)
    suspend fun deleteUserData(userModel: UserModel, onSuccess:() -> Unit)



}