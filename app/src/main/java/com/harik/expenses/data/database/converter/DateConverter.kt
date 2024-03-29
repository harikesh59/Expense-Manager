package com.harik.expenses.data.database.converter

import androidx.room.TypeConverter
import com.harik.expenses.data.Date

class DateConverter {

    companion object {

        @JvmStatic
        @TypeConverter
        fun toDate(long: Long) = Date(long)

        @JvmStatic
        @TypeConverter
        fun toLong(date: Date) = date.utcTimestamp
    }
}