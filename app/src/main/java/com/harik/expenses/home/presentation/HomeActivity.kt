package com.harik.expenses.home.presentation

import android.os.Bundle
import com.harik.expenses.R
import com.harik.expenses.common.presentation.BaseActivity

class HomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(findViewById(R.id.toolbar))
    }
}