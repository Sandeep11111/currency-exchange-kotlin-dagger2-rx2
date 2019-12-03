package com.mbiamont.konvert.di

import com.mbiamont.konvert.domain.usecase.RateUsecase
import com.mbiamont.konvert.presenter.ConverterPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Sandeep singh
 *
 * Dagger2 Module to provide the Presenters
 */
@Module
class PresenterModule {

    @Singleton
    @Provides
    internal fun providesConverterPresenter(rateUsecase: RateUsecase): ConverterPresenter {
        return ConverterPresenter(rateUsecase)
    }
}