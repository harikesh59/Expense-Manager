package com.harik.expenses.expensedetail.domain

import com.harik.expenses.data.Expense
import com.harik.expenses.data.database.DatabaseDataSource
import io.reactivex.Completable

class DeleteExpenseUseCase(private val databaseDataSource: DatabaseDataSource) {
    
    operator fun invoke(expense: Expense): Completable {
        return databaseDataSource.deleteExpense(expense)
    }
}