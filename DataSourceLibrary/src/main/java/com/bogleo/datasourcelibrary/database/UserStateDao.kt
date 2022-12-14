package com.bogleo.datasourcelibrary.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.bogleo.datasourcelibrary.data.UserState

@Dao
interface UserStateDao {

    @Query("SELECT * FROM data_source ORDER BY id ASC")
    suspend fun getAllData(): List<UserState>

    @Query("SELECT * FROM data_source WHERE id = 1")
    suspend fun getData(): UserState?

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addData(userState: UserState)
}