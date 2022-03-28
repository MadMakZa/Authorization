package com.makza.authorization.model.database

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

class UserRealization(private val userDao: UserDao): UserRepository {

    val selectAll = userDao.getAllUserData()

    

    override suspend fun insertUserData(userModel: UserModel, onSuccess: () -> Unit) {
        userDao.insert(userModel)
        onSuccess()
    }

    override suspend fun deleteUserData(userModel: UserModel, onSuccess: () -> Unit) {
        userDao.delete(userModel)
        onSuccess()
    }
}