package com.zistus.basicx.ui.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.zistus.basicx.ui.BaseViewModel
import com.zistus.domain.entity.Entity
import com.zistus.domain.usecases.BaseUseCase
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

class HomeViewModel(private val useCase: BaseUseCase): BaseViewModel() {
    private val user = MutableLiveData<User>()

    fun fetchUser(id: Int) =
        useCase.getTestObject()
            .subscribeOn(Schedulers.newThread())
            .subscribe {test->
                Log.e("uuh", "${test.id}")
            }.track()
}