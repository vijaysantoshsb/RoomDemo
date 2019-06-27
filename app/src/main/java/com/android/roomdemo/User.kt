package com.android.roomdemo

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "user")
class User {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    @ColumnInfo(name = "firstName")
    lateinit var first: String

    @ColumnInfo(name = "mobile")
    lateinit var mobileNumber: String

    fun setUid(id: Int) {
        this.id = id
    }

    fun getUid(): Int {
        return id
    }

    fun setFirstname(first: String) {
        this.first = first;
    }

    fun getFirstName(): String {
        return first
    }

    fun setMobile(mobileNumber: String) {
        this.mobileNumber = mobileNumber
    }

    fun getMobile(): String {
        return mobileNumber
    }
}