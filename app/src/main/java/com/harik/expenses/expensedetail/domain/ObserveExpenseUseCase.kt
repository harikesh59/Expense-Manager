package com.harik.expenses.expensedetail.domain

import com.harik.expenses.data.Expense
import com.harik.expenses.data.database.DatabaseDataSource
import io.reactivex.Observable

class ObserveExpenseUseCase(private val databaseDataSource: DatabaseDataSource) {
    operator fun invoke(expenseId: Long): Observable<Expense> {
        return databaseDataSource.observeExpense(expenseId)
    }
}