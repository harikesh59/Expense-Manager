package com.harik.expenses.home.presentation

import com.harik.expenses.data.Currency

data class CurrencySummaryItemModel(val currency: Currency, val amount: Float) {
    val amountText by lazy { "${"%.2f".format(amount)} ${currency.symbol}" }
    val currencyText by lazy { "(${currency.title} • ${currency.code})" }
}