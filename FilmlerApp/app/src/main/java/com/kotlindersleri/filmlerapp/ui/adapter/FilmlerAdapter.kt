package com.kotlindersleri.filmlerapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kotlindersleri.filmlerapp.data.entity.Filmler
import com.kotlindersleri.filmlerapp.databinding.CardTasarimBinding

class FilmlerAdapter(var mContext:Context,var filmlerListesi:List<Filmler>):RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding=CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film=filmlerListesi.get(position)
        val t=holder.tasarim

        t.imageViewFLm.setImageResource(mContext.resources.getIdentifier(film.resim,"drawable",mContext.packageName))

        t.textViewFiyat.text="${film.fiyat}"
    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }
}