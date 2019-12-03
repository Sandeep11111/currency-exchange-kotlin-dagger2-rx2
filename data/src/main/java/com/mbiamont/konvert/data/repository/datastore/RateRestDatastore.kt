package com.mbiamont.konvert.data.repository.datastore

import com.mbiamont.konvert.data.model.RateList
import com.mbiamont.konvert.data.rest.RateService
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by Sandeep singh
 *
 * Datastore implementation to access Rates using Rest API
 */
class RateRestDatastore @Inject constructor(private val rateService: RateService) : RateDatastore {

    override fun getRates(base: String): Single<RateList> {
        return rateService.getTopTracks(base)
    }
}