package com.zistus.basicx.ui.home

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.zistus.domain.usecases.BaseUseCase
import org.junit.Before

import org.junit.Rule
import org.junit.Test

class HomeViewlTest {

    @Rule
    @JvmField
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var baseRepository: BaseUseCase

    private lateinit var homeViewModel: HomeViewModel

    @Before
    fun setUp() {
//        homeViewModel = HomeViewModel(baseRepository)
    }

    @Test
    fun fetchFirstTest(){
    }
}