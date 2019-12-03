package com.mbiamont.konvert.di

import com.mbiamont.konvert.fragment.ConverterFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Sandeep singh
 *
 * Dagger2 Module to provide Fragments dependencies
 */
@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    internal abstract fun converterFragment(): ConverterFragment
}
