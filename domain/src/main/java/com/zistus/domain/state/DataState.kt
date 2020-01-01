package com.zistus.domain.state

import com.zistus.domain.entity.Entity

sealed class DataState {
    abstract val data: Entity.TestObject?
}

data class Success(override val data: Entity.TestObject) : DataState()
data class Failed(val errorMessage: String, override val data: Entity.TestObject) : DataState()