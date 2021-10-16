package com.example.supportstudysong.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.supportstudysong.data.db.hino_Entity
import java.util.concurrent.Flow

@Dao
interface Hino_Dao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun saveHino(hino: hino_Entity)

    @Update
    fun updateHino(hino: hino_Entity)

    @Query("SELECT * FROM studying_hino ORDER BY id ASC")
    fun getHino(): LiveData<List<hino_Entity>>

    @Query ("DELETE FROM studying_hino")
    fun deleteAll()
}