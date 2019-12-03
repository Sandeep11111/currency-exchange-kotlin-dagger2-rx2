package com.mbiamont.konvert.view

import com.mbiamont.konvert.data.model.Rate

/**
 * Created by Sandeep singh
 *
 * Contract to interact with the converter view
 */
interface ConverterView {

    /**
     * Update the rates
     */
    fun updateRatesList(rates: ArrayList<Rate>)

    /**
     * Update the amount in each EditText
     */
    fun updateAmount(amount: Float)

    /**
     * Show or hide the loader
     */
    fun showLoading(isLoading: Boolean)

    /**
     * Show an error message
     */
    fun showErrorMessage()
}