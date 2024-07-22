package com.kotlindersleri.kisileruygulamasi.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.kotlindersleri.kisileruygulamasi.R
import com.kotlindersleri.kisileruygulamasi.data.entity.Kisiler
import com.kotlindersleri.kisileruygulamasi.databinding.CardTasarimBinding
import com.kotlindersleri.kisileruygulamasi.databinding.FragmentAnasayfaBinding
import com.kotlindersleri.kisileruygulamasi.ui.fragment.AnasayfaFragmentDirections
import com.kotlindersleri.kisileruygulamasi.ui.viewmodel.AnasayfaViewModel
import com.kotlindersleri.kisileruygulamasi.util.gecisYap

class KisilerAdapter (var mContext:Context,var kisilerListesi:List<Kisiler>,var viewModel: AnasayfaViewModel)
    : RecyclerView.Adapter<KisilerAdapter.CardTasarimTutucu>(){

    inner class  CardTasarimTutucu(var tasarim:CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding:CardTasarimBinding=DataBindingUtil.inflate(LayoutInflater.from(mContext),
            R.layout.card_tasarim,parent,false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val kisi=kisilerListesi.get(position)
        val t=holder.tasarim

        t.kisiNesnesi=kisi

        t.cardViewSatir.setOnClickListener {
            val gecis=AnasayfaFragmentDirections.kisiDetayGecis(kisi) 
            Navigation.gecisYap(it,R.id.kisiKayitGecis)
        }
        t.imageViewSil.setOnClickListener {
            Snackbar.make(it,"${kisi.kisi_ad} silinsin mi?",Snackbar.LENGTH_SHORT)
                .setAction("EVET"){
                    viewModel.sil(kisi.kisi_id)
                }
                .show()
        }

    }

    override fun getItemCount(): Int {
        return kisilerListesi.size
    }


}