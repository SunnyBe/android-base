package com.zistus.domain.repository

import com.zistus.domain.entity.Entity
import io.reactivex.Single


interface BaseRepository {
    fun fetchTestObject(): Single<Entity.TestObject>
    fun persistTestObject(item: Entity.TestObject): Single<Int>

}