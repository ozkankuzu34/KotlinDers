package com.kotlindersleri.filmlerapp.di

import com.kotlindersleri.filmlerapp.data.datasource.FilmlerDataSource
import com.kotlindersleri.filmlerapp.data.repo.FilmlerRepository
import com.kotlindersleri.filmlerapp.retrofit.ApiUtils
import com.kotlindersleri.filmlerapp.retrofit.FilmlerDao
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
    fun provideFilmlerDataSource(fdao:FilmlerDao) : FilmlerDataSource {
        return FilmlerDataSource(fdao)
    }

    @Provides
    @Singleton
    fun provideFilmlerRepository(fds:FilmlerDataSource) : FilmlerRepository {
        return FilmlerRepository(fds)
    }

    @Provides
    @Singleton
    fun provideFilmlerDao() : FilmlerDao {
        return ApiUtils.getFilmlerDao()
    }
}