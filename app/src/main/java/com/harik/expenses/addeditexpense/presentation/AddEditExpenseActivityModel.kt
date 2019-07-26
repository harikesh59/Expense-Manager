package com.harik.expenses.addeditexpense.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.harik.expenses.data.Tag

class AddEditExpenseActivityModel : ViewModel() {

    val selectedTags = MutableLiveData<List<Tag>>()

    fun selectTags(tags: List<Tag>) {
        selectedTags.value = tags
    }
}