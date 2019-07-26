package com.harik.expenses.util.extensions

import android.content.Context
import com.harik.expenses.Application

val Context.application: Application
    get() = applicationContext as Application