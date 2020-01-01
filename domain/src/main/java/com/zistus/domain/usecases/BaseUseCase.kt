package com.zistus.domain.usecases

import com.zistus.domain.entity.Entity
import io.reactivex.Single

interface BaseUseCase {
    fun getTestObject(): Single<Entity.TestObject>
}