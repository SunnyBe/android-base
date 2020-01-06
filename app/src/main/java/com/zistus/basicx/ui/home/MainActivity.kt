package com.zistus.basicx.ui.home

import android.os.Bundle
import com.zistus.basicx.R
import com.zistus.basicx.ui.BaseActivity
import org.koin.android.viewmodel.ext.android.viewModel



class MainActivity: BaseActivity() {

    val homeViewModel: HomeViewModel by viewModel<HomeViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun getNavControllerId(): Int = R.id.mainHostFragment
}