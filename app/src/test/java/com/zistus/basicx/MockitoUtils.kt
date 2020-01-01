package com.zistus.basicx

import org.mockito.Mockito
import org.mockito.stubbing.OngoingStubbing

inline fun <reified T> mock(): T = Mockito.mock(T::class.java)
inline fun <T> whenever(methodCall: T) : OngoingStubbing<T> = Mockito.`when`(methodCall)
