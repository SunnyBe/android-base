package com.zistus.data.datasources.api

import com.zistus.domain.entity.Entity
import io.reactivex.Single

interface ApiSource {
    fun getTestObject(): Single<Entity.TestObject>
}