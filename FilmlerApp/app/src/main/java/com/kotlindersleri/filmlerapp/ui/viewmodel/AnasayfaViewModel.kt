package com.kotlindersleri.filmlerapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kotlindersleri.filmlerapp.data.datasource.FilmlerDataSource
import com.kotlindersleri.filmlerapp.data.entity.Filmler
import com.kotlindersleri.filmlerapp.data.repo.FilmlerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnasayfaViewModel:ViewModel() {
var frepo=FilmlerRepository()
var filmlerListesi=MutableLiveData<List<Filmler>>()

init {
    filmleriYukle()
}

    fun filmleriYukle(){
        CoroutineScope(Dispatchers.Main).launch {
           filmlerListesi.value= frepo.filmleriYukle()
        }
    }
}