package com.harik.expenses.home.domain

import com.harik.expenses.data.Expense
import com.harik.expenses.home.presentation.DateRange
import com.harik.expenses.home.presentation.TagFilter

class FilterExpensesUseCase {

    operator fun invoke(
        expenses: List<Expense>,
        dateRange: DateRange,
        tagFilter: TagFilter?
    ): List<Expense> {
        return expenses.filter { expense ->
            dateRange.contains(expense.date) &&
                    tagFilter?.let { expense.tags.containsAll(it.tags) } ?: true
        }
    }
}