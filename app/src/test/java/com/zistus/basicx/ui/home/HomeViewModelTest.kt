package com.zistus.basicx.ui.home

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.zistus.basicx.mock
import com.zistus.basicx.whenever
import com.zistus.domain.usecases.BaseUseCase
import com.zistus.domain.state.DataState
import com.zistus.domain.state.Success
import io.reactivex.Single
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.ArgumentCaptor

class HomeViewModelTest {
    @Rule
    @JvmField
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private var baseUseCase: BaseUseCase = mock<BaseUseCase>()
    private val observerState = mock<Observer<DataState>>()

    private val viewModel: HomeViewModel by lazy {
        HomeViewModel(baseUseCase)
    }

    @Before
    fun setUp() {
//        viewModel = HomeViewModel(baseUseCase)
//        viewModel.stateLiveData.observeForever(observerState)
    }

    @Test
    fun fetchUser_ShouldReturnUser() {
        val expected = 3
        val actual = viewModel.fetchUser(3)
        assertEquals(expected, actual)
    }

    @Test
    fun fetchUser_should_returnUser() {
        val argumentCaptor = ArgumentCaptor.forClass(DataState::class.java)
        val obj = TestObject("water")
        val expectedSuccess = Success(obj)

        argumentCaptor.run {

        }

    }

    @Test
    fun fetchUserError_should_returnError() {
        val expectedError = Throwable("water is empty")
        whenever(baseUseCase.getTestObject())
            .thenReturn(Single.error(expectedError))

        baseUseCase.getTestObject()
            .test()
            .assertError(expectedError)
    }
}