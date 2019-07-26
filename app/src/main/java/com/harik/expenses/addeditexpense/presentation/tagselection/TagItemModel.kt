package com.harik.expenses.addeditexpense.presentation.tagselection

import com.harik.expenses.data.Tag

class TagItemModel(val tag: Tag):
    TagSelectionItemModel {

    var isChecked = false
    val name = tag.name

    var checkClick: (() -> Unit)? = null
    var deleteClick: (() -> Unit)? = null
}