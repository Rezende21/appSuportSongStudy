package com.example.supportstudysong.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.supportstudysong.data.db.hino_Entity

@Dao
interface hino_Dao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(hino: hino_Entity)

    @Query("SELECT * FROM studying_hino WHERE id = :id")
    fun getHino(id: Long): hino_Entity
}