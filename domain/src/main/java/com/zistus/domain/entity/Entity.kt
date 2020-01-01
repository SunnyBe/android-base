package com.zistus.domain.entity

sealed class Entity {
    data class TestObject(val id: String)
}