package com.harik.expenses.home.domain

import com.harik.expenses.data.Tag

class SortTagsUseCase {
    operator fun invoke(tags: List<Tag>): List<Tag> {
        return tags.sortedBy { it.name }
    }
}