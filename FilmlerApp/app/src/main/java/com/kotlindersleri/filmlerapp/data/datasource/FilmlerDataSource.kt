package com.kotlindersleri.filmlerapp.data.datasource

import androidx.lifecycle.MutableLiveData
import com.google.firebase.firestore.CollectionReference
import com.kotlindersleri.filmlerapp.data.entity.Filmler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FilmlerDataSource(var collectionFilmler: CollectionReference) {
    fun filmleriYukle() : MutableLiveData<List<Filmler>> {
        val filmlerListesi = MutableLiveData<List<Filmler>>()

        collectionFilmler.get().addOnCompleteListener {
            val liste = ArrayList<Filmler>()
            for(d in it.result){
                val film = d.toObject(Filmler::class.java)
                film.id = d.id
                liste.add(film)
            }

            filmlerListesi.value = liste
        }

        return filmlerListesi
    }
}