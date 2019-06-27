package com.android.roomdemo

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface UserDao {

    @Query("SELECT * FROM USER")
    fun getAll(): List<User>

    @Query("SELECT * FROM user where firstName LIKE  :first AND mobile LIKE :mobile")
    fun findByName(first: String, mobile: String): User

    @Query("SELECT COUNT(*) from USER")
    fun getCount(): Int

    @Insert
    fun insertAll(vararg users: User)

    @Delete
    fun deletedUser(user: User)
}