package com.bogleo.datasourcelibrary.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.bogleo.datasourcelibrary.data.UserState

@Database(entities = [UserState::class], version = 1, exportSchema = false)
abstract class UserStateDatabase : RoomDatabase() {

    abstract fun userStateDao(): UserStateDao

    companion object {
        @Volatile
        private var INSTANCE: UserStateDatabase? = null

        fun getDB(context: Context): UserStateDatabase{
            val tempInstance = INSTANCE
            if(tempInstance != null) {
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserStateDatabase::class.java,
                    "data_source"
                )
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}