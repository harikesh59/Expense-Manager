package com.harik.expenses.data.database.converter

import androidx.room.TypeConverter
import com.harik.expenses.data.Currency

class CurrencyConverter {

    companion object {

        @JvmStatic
        @TypeConverter
        fun toCurrency(string: String) = Currency.fromCode(string)

        @JvmStatic
        @TypeConverter
        fun toString(currency: Currency) = currency.toString()
    }
}