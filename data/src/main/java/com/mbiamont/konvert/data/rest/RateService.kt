package com.mbiamont.konvert.data.rest

import com.mbiamont.konvert.data.model.RateList
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Sandeep Singh
 *
 * Retrofit2 service to access Revolut Rates API
 */
interface RateService {

    companion object {
        const val BASE_URL = "https://revolut.duckdns.org"
    }

    @GET("/latest")
    fun getTopTracks(@Query("base") base: String): Single<RateList>
}