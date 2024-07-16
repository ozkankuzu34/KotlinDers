package com.kotlindersleri.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.kotlindersleri.kisileruygulamasi.R
import com.kotlindersleri.kisileruygulamasi.data.entity.Kisiler
import com.kotlindersleri.kisileruygulamasi.databinding.FragmentAnasayfaBinding
import com.kotlindersleri.kisileruygulamasi.ui.adapter.KisilerAdapter


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentAnasayfaBinding.inflate(inflater,container,false)

        binding.toolbarAnasayfa.title="Kişiler"

        //binding.rv.layoutManager=LinearLayoutManager(requireContext())
        //binding.rv.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        //binding.rv.layoutManager=StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        binding.rv.layoutManager=LinearLayoutManager(requireContext())


        val kisilerListesi=ArrayList<Kisiler>()
        val k1=Kisiler(1,"Ahmet","1111")
        val k2=Kisiler(2,"Zeynep","2222")
        val k3=Kisiler(3,"Beyza","3333")

        kisilerListesi.add(k1)
        kisilerListesi.add(k2)
        kisilerListesi.add(k3)

        val kisilerAdapter=KisilerAdapter(requireContext(),kisilerListesi)
        binding.rv.adapter=kisilerAdapter


        binding.fab.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.kisiKayitGecis)
        }

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextChange(newText: String): Boolean {
                ara(newText)
                return true
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                ara(query)
                return true
            }
        })

        return binding.root
    }
    fun ara(aramaKelimesi:String){
        Log.e("Kişi Ara",aramaKelimesi)
    }


}