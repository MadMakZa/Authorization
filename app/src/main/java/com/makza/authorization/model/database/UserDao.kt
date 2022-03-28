package com.makza.authorization.model.database

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

@Dao
interface UserDao {

    @Query("SELECT * FROM user_table")
    fun getAllUserData(): Flow<List<UserModel>>

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun save(userModel: UserModel)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(userModel: UserModel)

    @Delete
    suspend fun delete(userModel: UserModel)


}