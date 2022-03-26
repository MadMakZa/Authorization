package com.makza.authorization.model.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "user_table")
class UserModel(
    @PrimaryKey(autoGenerate = true)
    var userId: Int = 0,

    @ColumnInfo
    var userLogin: String = "",

    @ColumnInfo
    var userPassword: String = "",
)