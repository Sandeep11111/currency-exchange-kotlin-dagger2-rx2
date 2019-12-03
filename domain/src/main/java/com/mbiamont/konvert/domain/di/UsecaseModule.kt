package com.mbiamont.konvert.domain.di

import com.mbiamont.konvert.data.repository.RateRepository
import com.mbiamont.konvert.domain.usecase.RateUsecase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Sandeep singh
 *
 * Dagger2 Module to provides Usecases dependencies
 */
@Module
class UsecaseModule {

    @Singleton
    @Provides
    internal fun providesRateUsecase(rateRepository: RateRepository): RateUsecase {
        return RateUsecase(rateRepository)
    }
}