package com.example.supportstudysong.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "studying_hino")
class hino_Entity(
    @PrimaryKey val id: Int,
    val hino: Int
)
