package com.harik.expenses.settings.presentation

open class ActionSettingItemModel(val title: String):
    SettingItemModel {

    var click: (() -> Unit)? = null
}