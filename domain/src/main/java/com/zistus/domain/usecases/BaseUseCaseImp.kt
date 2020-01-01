package com.zistus.domain.usecases

import com.zistus.domain.entity.Entity
import com.zistus.domain.repository.BaseRepository
import io.reactivex.Single

class BaseUseCaseImp(private val baseRepository: BaseRepository): BaseUseCase {

    override fun getTestObject(): Single<Entity.TestObject> {
        return baseRepository.fetchTestObject()
    }
}