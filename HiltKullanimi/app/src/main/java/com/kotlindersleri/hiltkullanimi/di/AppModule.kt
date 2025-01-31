package com.kotlindersleri.hiltkullanimi.di

import com.kotlindersleri.hiltkullanimi.Adres
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideAdres() : Adres{
        return Adres("Kadıköy / İSTANBUL")
    }
}