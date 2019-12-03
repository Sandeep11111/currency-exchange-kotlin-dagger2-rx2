package com.mbiamont.konvert.data.di

import com.mbiamont.konvert.data.rest.RateService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by Sandeep singh
 * Dagger2 Module to provides Rest dependencies
 */
@Module
class RestModule {

    @Singleton
    @Provides
    internal fun providesRateService(): RateService {
        return Retrofit.Builder()
                .baseUrl(RateService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build().create(RateService::class.java)
    }
}
