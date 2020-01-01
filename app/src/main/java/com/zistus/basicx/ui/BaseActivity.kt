package com.zistus.basicx.ui

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController

abstract class BaseActivity : AppCompatActivity() {

    // Create a navigation controller in the extending activities
    private val navController: NavController by lazy {
        findNavController(getNavControllerId())
    }

    // Supports navigation up for the extending Activities
    override fun onSupportNavigateUp() = navController.navigateUp()

    abstract fun getNavControllerId(): Int
}
