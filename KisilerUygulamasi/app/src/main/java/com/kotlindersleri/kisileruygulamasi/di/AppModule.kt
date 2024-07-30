package com.kotlindersleri.kisileruygulamasi.di

import com.kotlindersleri.kisileruygulamasi.data.datasource.KisilerDataSource
import com.kotlindersleri.kisileruygulamasi.data.repo.KisilerRepository
import com.kotlindersleri.kisileruygulamasi.retrofit.ApiUtils
import com.kotlindersleri.kisileruygulamasi.retrofit.KisilerDao
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
    fun provideKisilerDataSource(kdao:KisilerDao) :KisilerDataSource{
        return KisilerDataSource(kdao)
    }

    @Provides
    @Singleton
    fun provideKisilerRepository(kds:KisilerDataSource) :KisilerRepository{
        return KisilerRepository(kds)
    }

    @Provides
    @Singleton
    fun provideKisilerDao() :KisilerDao{
        return ApiUtils.getKisilerDao()
    }

}