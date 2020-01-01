package com.zistus.data.datasources.api

import com.zistus.data.datasources.entity.Dto
import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {

    @GET("test")
    fun fetchTestObject(): Single<Dto.TestObject>
}