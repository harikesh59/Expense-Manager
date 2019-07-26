package com.harik.expenses.data.preference

import android.content.Context
import androidx.preference.PreferenceManager
import com.harik.expenses.R
import com.harik.expenses.data.Currency

class PreferenceDataSource {

    fun getDefaultCurrency(context: Context): Currency {
        val preferences = PreferenceManager.getDefaultSharedPreferences(context)

        val key = getDefaultCurrencyKey(context)

        return preferences.getString(key, null)?.let { Currency.valueOf(it) } ?: Currency.INR
    }

    fun setDefaultCurrency(context: Context, defaultCurrency: Currency) {
        val preferences = PreferenceManager.getDefaultSharedPreferences(context)

        val key = getDefaultCurrencyKey(context)

        return preferences.edit().putString(key, defaultCurrency.name).apply()
    }

    private fun getDefaultCurrencyKey(context: Context) =
        context.getString(R.string.key_default_currency)
}