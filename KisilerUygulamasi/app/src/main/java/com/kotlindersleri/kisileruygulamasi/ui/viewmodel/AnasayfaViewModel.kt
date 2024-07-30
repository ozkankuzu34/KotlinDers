package com.kotlindersleri.kisileruygulamasi.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kotlindersleri.kisileruygulamasi.data.entity.Kisiler
import com.kotlindersleri.kisileruygulamasi.data.repo.KisilerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnasayfaViewModel @Inject constructor(var krepo:KisilerRepository) : ViewModel() {
    var kisilerListesi = MutableLiveData<List<Kisiler>>()

    init {
        kisileriYukle()
    }

    fun sil(kisi_id:String){
        krepo.sil(kisi_id)
    }

    fun kisileriYukle() {
        kisilerListesi = krepo.kisileriYukle()
    }

    fun ara(aramaKelimesi:String){
        kisilerListesi = krepo.ara(aramaKelimesi)
    }
}