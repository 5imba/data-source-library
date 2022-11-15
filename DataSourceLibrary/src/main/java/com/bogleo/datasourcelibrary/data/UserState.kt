package com.bogleo.datasourcelibrary.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "data_source")
data class UserState(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val data: String,
    val isValid: Boolean
)