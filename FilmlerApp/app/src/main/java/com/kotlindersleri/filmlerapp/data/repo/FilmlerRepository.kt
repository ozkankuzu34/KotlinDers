package com.kotlindersleri.filmlerapp.data.repo

import androidx.lifecycle.MutableLiveData
import com.kotlindersleri.filmlerapp.data.datasource.FilmlerDataSource
import com.kotlindersleri.filmlerapp.data.entity.Filmler

class FilmlerRepository(var fds:FilmlerDataSource) {

    fun filmleriYukle() : MutableLiveData<List<Filmler>> = fds.filmleriYukle()
}