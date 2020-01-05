package com.zistus.data.datasources.db.room.model

import androidx.room.Entity
import androidx.room.PrimaryKey

sealed class Model {
    @Entity(tableName = "test")
    data class TestItem(
        @PrimaryKey val id: Long,
        val myId: String
    ): Model()
}