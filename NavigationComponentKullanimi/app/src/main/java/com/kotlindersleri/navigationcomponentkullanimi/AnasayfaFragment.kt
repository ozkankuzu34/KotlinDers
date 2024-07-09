package com.kotlindersleri.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import com.kotlindersleri.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonDetay.setOnClickListener{
            //Snackbar.make(it,"Merhaba",Snackbar.LENGTH_SHORT).show()
            //binding.textView.text="Nasılsın"

            val urun=Urunler(100,"TV")
            val gecis=AnasayfaFragmentDirections.detayGecis(urun=urun,ad="Ahmet",yas=23,boy=1.78f,bekar=true)

            Navigation.findNavController(it).navigate(gecis)
        }
        return binding.root
    }


}