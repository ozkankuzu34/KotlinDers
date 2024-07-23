package com.kotlindersleri.filmlerapp.di

import com.kotlindersleri.filmlerapp.data.datasource.FilmlerDataSource
import com.kotlindersleri.filmlerapp.data.repo.FilmlerRepository
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
    fun provideFilmlerDataSource():FilmlerDataSource{
        return FilmlerDataSource()
    }

    @Provides
    @Singleton
    fun provideFilmlerRepository(fds:FilmlerDataSource): FilmlerRepository {
        return FilmlerRepository(fds)
    }
}