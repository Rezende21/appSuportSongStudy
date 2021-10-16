package com.example.supportstudysong.data.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "studying_hino")
class hino_Entity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    @ColumnInfo(name = "Hino")
    val hino: String
)

