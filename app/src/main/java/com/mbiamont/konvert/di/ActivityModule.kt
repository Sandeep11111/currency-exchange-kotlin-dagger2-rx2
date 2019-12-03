package com.mbiamont.konvert.di

import com.mbiamont.konvert.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Sandeep singh
 *
 * Dagger2 Module to provide Activities dependencies
 */
@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    internal abstract fun mainActivity(): MainActivity
}
