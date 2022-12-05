package com.bogleo.datasourcelibrary.database

import com.bogleo.datasourcelibrary.data.UserState

class UserStateRepository(
    private  val userStateDao: UserStateDao
) {

    suspend fun getAllData(): List<UserState> {
        return userStateDao.getAllData()
    }

    suspend fun getUserState(): UserState? {
        return userStateDao.getData()
    }

    suspend fun addUserState(userState: UserState) {
        userStateDao.addData(userState = userState)
    }

}