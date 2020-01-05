package com.zistus.data.datasources.db.room

import com.zistus.domain.entity.Entity
import io.reactivex.Single

interface DatabaseSource {

    fun insertItem(item: Entity.TestObject): Single<Long>
}