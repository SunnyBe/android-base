package com.zistus.data.datasources.entity

import com.google.gson.annotations.SerializedName

sealed class Dto {
    data class TestObject(@SerializedName("whatever") val id: String): Dto()
}