package com.zistus.data.datasources.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.zistus.data.datasources.db.room.dao.BaseDao
import com.zistus.data.datasources.db.room.model.Model

@Database(entities = [Model.TestItem::class], version = 1, exportSchema = true)
abstract class MyDatabase: RoomDatabase() {

    abstract fun baseDao(): BaseDao

}