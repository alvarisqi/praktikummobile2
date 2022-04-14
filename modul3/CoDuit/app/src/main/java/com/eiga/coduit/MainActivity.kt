package com.eiga.coduit

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.eiga.coduit.databinding.ActivityMainBinding
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.calculateButton.setOnClickListener { calculateCurrency() }

        binding.costOfServiceEditText.setOnKeyListener { view, keyCode, _ ->
            handleKeyEvent(
                view,
                keyCode
            )
        }
    }

    private fun calculateCurrency() {
        val stringInTextField = binding.costOfServiceEditText.text.toString()
        val amount = stringInTextField.toDoubleOrNull()

        if (amount == null || amount == 0.0) {
            displayCurrency(0.0)
            return
        }

        val currencyRate = when (binding.tipOptions.checkedRadioButtonId) {
            R.id.euro -> 15620.81
            R.id.dollar -> 14366.00
            R.id.yen -> 114.51
            else -> 3831.34
        }

        var rupiah = currencyRate * amount

        displayCurrency(rupiah)
    }

    private fun displayCurrency(rupiah: Double) {
        val indonesianLocale = Locale("in", "ID")
        val formattedTip = NumberFormat.getCurrencyInstance(indonesianLocale).format(rupiah)
        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
    }

    private fun handleKeyEvent(view: View, keyCode: Int): Boolean {
        if (keyCode == KeyEvent.KEYCODE_ENTER) {

            val inputMethodManager =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
            return true
        }
        return false
    }
}