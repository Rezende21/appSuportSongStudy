package com.example.supportstudysong.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.supportstudysong.data.db.dao.hino_Dao

@Database(entities = [hino_Entity::class], version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract fun hino_Dao(): hino_Dao

    companion object{
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instances = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_databese"
                ).build()
                INSTANCE = instances
                return instances
            }
        }
    }
}