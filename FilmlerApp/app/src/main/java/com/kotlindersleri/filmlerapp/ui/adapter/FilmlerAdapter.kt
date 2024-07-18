package com.kotlindersleri.filmlerapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.kotlindersleri.filmlerapp.data.entity.Filmler
import com.kotlindersleri.filmlerapp.databinding.CardTasarimBinding
import com.kotlindersleri.filmlerapp.ui.fragment.AnasayfaFragment
import com.kotlindersleri.filmlerapp.ui.fragment.AnasayfaFragmentDirections

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

        t.cardViewFilm.setOnClickListener {
            val gecis=AnasayfaFragmentDirections.detayGecis(film)
            Navigation.findNavController(it).navigate(gecis)
        }
        t.buttonSepet.setOnClickListener {
            Snackbar.make(it,"${film.ad} sepete eklendi",Snackbar.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }
}