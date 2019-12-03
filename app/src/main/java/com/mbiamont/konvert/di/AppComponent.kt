package com.mbiamont.konvert.di

import android.app.Application
import android.content.Context
import com.mbiamont.konvert.KonvertApp
import com.mbiamont.konvert.data.di.RepositoryModule
import com.mbiamont.konvert.data.di.RestModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Sandeep singh
 *
 * Dagger2 Component to inject modules
 */
@Singleton
@Component(modules = [
    ActivityModule::class,
    FragmentModule::class,
    RestModule::class,
    RepositoryModule::class])
interface AppComponent {

    fun inject(application: KonvertApp)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }
}