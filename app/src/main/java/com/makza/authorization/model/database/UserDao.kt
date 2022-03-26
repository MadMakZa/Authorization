package com.makza.authorization.model.database

import androidx.room.*
import kotlinx.coroutines.flow.MutableStateFlow

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(userModel: UserModel)

    @Delete
    suspend fun delete(userModel: UserModel)

//    @Query("SELECT * FROM user_table")
//    fun getAllUserData(): MutableStateFlow<List<UserModel>>
}