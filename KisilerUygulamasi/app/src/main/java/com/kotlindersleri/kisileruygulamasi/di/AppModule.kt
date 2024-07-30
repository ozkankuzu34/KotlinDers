package com.kotlindersleri.kisileruygulamasi.di

import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.kotlindersleri.kisileruygulamasi.data.datasource.KisilerDataSource
import com.kotlindersleri.kisileruygulamasi.data.repo.KisilerRepository
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
    fun provideKisilerDataSource(collectionKisiler:CollectionReference) : KisilerDataSource {
        return KisilerDataSource(collectionKisiler)
    }

    @Provides
    @Singleton
    fun provideKisilerRepository(kds:KisilerDataSource) : KisilerRepository {
        return KisilerRepository(kds)
    }

    @Provides
    @Singleton
    fun provideCollectionReference() : CollectionReference {
        return Firebase.firestore.collection("Kisiler")
    }
}