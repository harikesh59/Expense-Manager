package com.harik.expenses.common.presentation.currencyselection

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.harik.expenses.R
import com.harik.expenses.data.Currency

class CurrencySelectionDialogFragment : DialogFragment(), DialogInterface.OnClickListener {

    var onCurrencySelected: ((Currency) -> Unit)? = null

    private val currencies = Currency.values()

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireActivity())
            .setTitle(R.string.select_currency)
            .setItems(createItems(), this)
            .setNegativeButton(R.string.cancel) { _, _ -> }
            .create()
    }

    private fun createItems(): Array<String> {
        return currencies
            .map { currency -> currency.description }
            .toTypedArray()
    }

    override fun onClick(dialog: DialogInterface?, which: Int) {
        onCurrencySelected?.invoke(currencies[which])
    }

    companion object {
        fun newInstance() = CurrencySelectionDialogFragment()
    }
}