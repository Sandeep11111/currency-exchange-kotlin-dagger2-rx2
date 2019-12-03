package com.mbiamont.konvert.data.repository.datastore

import com.mbiamont.konvert.data.model.RateList
import io.reactivex.Single

/**
 * Created by Sandeep singh
 *
 * Datastore interface to access rates
 */
interface RateDatastore {

    /**
     * Returns the rates using a base symbol
     */
    fun getRates(base: String): Single<RateList>

}