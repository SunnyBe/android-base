package com.zistus.data.repository

import com.zistus.data.datasources.api.ApiSource
import com.zistus.data.datasources.db.room.DatabaseSource
import com.zistus.domain.entity.Entity
import com.zistus.domain.repository.BaseRepository
import io.reactivex.Single

class BaseRepositoryImpl(private val apiSource: ApiSource, private val dbSource: DatabaseSource): BaseRepository {

    override fun fetchTestObject(): Single<Entity.TestObject> {
        return apiSource.getTestObject()
            .map { item-> item }
    }

    override fun persistTestObject(item: Entity.TestObject): Single<Int> {
        return dbSource.insertItem(item = item)
            .map { item-> item }
    }

}