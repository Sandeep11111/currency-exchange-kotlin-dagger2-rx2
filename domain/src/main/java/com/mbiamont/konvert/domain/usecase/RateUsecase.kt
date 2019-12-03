package com.mbiamont.konvert.domain.usecase

import com.mbiamont.konvert.data.model.RateList
import com.mbiamont.konvert.data.repository.RateRepository
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by Sandeep singh
 *
 * Usecase to retrieve rates
 */
class RateUsecase @Inject constructor(private val rateRepository: RateRepository) {

    /**
     * Returns the rates using a base symbol
     */
    fun getRates(base: String): Single<RateList> {
        return rateRepository.getRates(base)
    }
}