package com.bogleo.datasourcelibrary.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.bogleo.datasourcelibrary.data.UserState

@Dao
interface DataSourceDao {

    @Query("SELECT * FROM data_source WHERE id = 0")
    suspend fun getData(): UserState?

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun addData(userState: UserState)
}