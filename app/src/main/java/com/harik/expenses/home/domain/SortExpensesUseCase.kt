package com.harik.expenses.home.domain

import com.harik.expenses.data.Expense

class SortExpensesUseCase {

    operator fun invoke(expenses: List<Expense>): List<Expense> {
        return expenses.sortedByDescending { it.date.utcTimestamp }
    }
}