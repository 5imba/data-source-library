package com.bogleo.datasourcelibrary.database

import com.bogleo.datasourcelibrary.data.UserState

class DataSourceRepository(
    private  val dsDao: DataSourceDao
) {

    suspend fun getAllData(): List<UserState> {
        return dsDao.getAllData()
    }

    suspend fun getData(): UserState? {
        return dsDao.getData()
    }

    suspend fun addData(userState: UserState) {
        dsDao.addData(userState = userState)
    }

}