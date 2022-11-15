package com.bogleo.datasourcelibrary.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.bogleo.datasourcelibrary.data.UserState

@Database(entities = [UserState::class], version = 1, exportSchema = false)
abstract class DataSourceDatabase : RoomDatabase() {

    abstract fun dataSourceDao(): DataSourceDao

    companion object {
        @Volatile
        private var INSTANCE: DataSourceDatabase? = null

        fun getDatabase(context: Context): DataSourceDatabase{
            val tempInstance = INSTANCE
            if(tempInstance != null) {
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DataSourceDatabase::class.java,
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