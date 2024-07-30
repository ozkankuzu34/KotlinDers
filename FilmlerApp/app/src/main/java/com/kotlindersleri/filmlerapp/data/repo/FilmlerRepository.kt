package com.kotlindersleri.filmlerapp.data.repo

import com.kotlindersleri.filmlerapp.data.datasource.FilmlerDataSource
import com.kotlindersleri.filmlerapp.data.entity.Filmler

class FilmlerRepository(var fds:FilmlerDataSource) {

    suspend fun filmleriYukle() : List<Filmler> = fds.filmleriYukle()
}