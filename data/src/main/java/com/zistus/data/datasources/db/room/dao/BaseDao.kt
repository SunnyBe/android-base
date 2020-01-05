package com.zistus.data.datasources.db.room.dao

import androidx.room.*
import com.zistus.data.datasources.db.room.model.Model
import io.reactivex.Single

@Dao
interface BaseDao {
    @Insert
    fun addItem(item: Model.TestItem): Long

    @Query("select * from test")
    fun allItem(): Single<List<Model.TestItem>>
//
//    @Query("select * from AjoCardUser limit 1")
//    fun myUserLone(): AjoCardUser
//
//    @Query("Select * from AjoCardUser where phone = :phone")
//    fun myUserByPhone(phone: String): LiveData<AjoCardUser>
//
//    @Delete
//    fun deleteUser(user: AjoCardUser)
}