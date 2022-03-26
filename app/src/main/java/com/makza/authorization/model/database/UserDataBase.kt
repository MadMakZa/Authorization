package com.makza.authorization.model.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [UserModel::class], version = 1)
abstract class UserDataBase: RoomDatabase() {
    abstract fun getUserDao(): UserDao

    companion object {
        private var database: UserDataBase ?= null

        @Synchronized
        fun getInstance(context: Context): UserDataBase{
            return if (database == null){
                database = Room.databaseBuilder(context, UserDataBase::class.java, "userdb").build()
                database as UserDataBase
            }else{
                database as UserDataBase
            }
        }
    }
}