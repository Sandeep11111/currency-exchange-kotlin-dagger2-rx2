package com.mbiamont.konvert.data.repository

import com.mbiamont.konvert.data.model.RateList
import com.mbiamont.konvert.data.repository.datastore.RateRestDatastore
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by Sandeep singh
 *
 * Repository to access rates
 */
class RateRepository @Inject constructor(private val rateRestDatastore: RateRestDatastore) {

    /**
     * Returns the rates using a base symbol
     */
    fun getRates(base: String): Single<RateList> {
        return rateRestDatastore.getRates(base)
    }
}