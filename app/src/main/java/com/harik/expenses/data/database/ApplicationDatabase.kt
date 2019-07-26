package com.harik.expenses.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.harik.expenses.data.Expense
import com.harik.expenses.data.ExpenseTagJoin
import com.harik.expenses.data.Tag
import com.harik.expenses.data.database.dao.ExpenseDao
import com.harik.expenses.data.database.dao.ExpenseTagJoinDao
import com.harik.expenses.data.database.dao.TagDao
import com.harik.expenses.data.database.converter.CurrencyConverter
import com.harik.expenses.data.database.converter.DateConverter

@Database(
        entities = [
            Expense::class,
            Tag::class,
            ExpenseTagJoin::class
        ],
        version = 1,
        exportSchema = false)
@TypeConverters(
        value = [
            CurrencyConverter::class,
            DateConverter::class
        ]
)
abstract class ApplicationDatabase : RoomDatabase() {

    abstract fun expenseDao(): ExpenseDao

    abstract fun tagDao(): TagDao

    abstract fun expenseTagJoinDao(): ExpenseTagJoinDao
}