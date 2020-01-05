package com.zistus.data.datasources.db.room

import com.zistus.data.datasources.db.room.dao.BaseDao
import com.zistus.data.datasources.db.room.model.Model
import com.zistus.domain.entity.Entity
import io.reactivex.Single

class DatabaseSourceImpl(private val baseDao: BaseDao): DatabaseSource {

    override fun insertItem(item: Entity.TestObject): Single<Long> {
        return Single.just(baseDao.addItem(Model.TestItem(0, item.id)))
    }
}