package com.mbiamont.konvert.data.di

import com.mbiamont.konvert.data.repository.RateRepository
import com.mbiamont.konvert.data.repository.datastore.RateRestDatastore
import com.mbiamont.konvert.data.rest.RateService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Sandeep singh
 * Dagger2 Module to provides Repository dependencies
 */
@Module
class RepositoryModule {

    @Singleton
    @Provides
    internal fun providesRateRestDatastore(rateService: RateService): RateRestDatastore {
        return RateRestDatastore(rateService)
    }

    @Singleton
    @Provides
    internal fun providesRateRepository(rateRestDatastore: RateRestDatastore): RateRepository {
        return RateRepository(rateRestDatastore)
    }
}
