package com.zistus.data.repository

import com.zistus.data.datasources.api.ApiSource
import com.zistus.data.datasources.db.room.DatabaseSource
import com.zistus.domain.entity.Entity
import com.zistus.domain.repository.BaseRepository
import io.reactivex.Single

class BaseRepositoryImpl(private val apiSource: ApiSource, private val databaseSource: DatabaseSource): BaseRepository {

    override fun fetchTestObject(): Single<Entity.TestObject> {
        return apiSource.getTestObject()
            .map { item-> item }
            .onErrorReturn { Entity.TestObject("30949494") }
    }

    override fun persistTestObject(item: Entity.TestObject): Single<Int> {
//        return dbSource.insertItem(item = item)
//            .map { item-> item }
        return Single.just(1)
    }

}