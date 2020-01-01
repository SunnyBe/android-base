package com.zistus.data.datasources.api

import com.zistus.domain.entity.Entity
import io.reactivex.Single

class ApiSourceImp(private val apiService: ApiService): ApiSource {

    override fun getTestObject(): Single<Entity.TestObject> {
        return apiService.fetchTestObject()
            .map {
//                    item-> Entity.TestObject(item.id)
                    item-> Entity.TestObject("23")
            }
    }
}