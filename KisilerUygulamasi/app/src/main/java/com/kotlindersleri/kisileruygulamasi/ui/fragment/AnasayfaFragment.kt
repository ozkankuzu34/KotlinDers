package com.kotlindersleri.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.kotlindersleri.kisileruygulamasi.R
import com.kotlindersleri.kisileruygulamasi.data.entity.Kisiler
import com.kotlindersleri.kisileruygulamasi.databinding.FragmentAnasayfaBinding
import com.kotlindersleri.kisileruygulamasi.ui.adapter.KisilerAdapter
import com.kotlindersleri.kisileruygulamasi.ui.viewmodel.AnasayfaViewModel
import com.kotlindersleri.kisileruygulamasi.ui.viewmodel.KisiDetayViewModel


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    private lateinit var viewModel: AnasayfaViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa,container,false)
        binding.anasayfaFragment=this
        binding.anasayfaToolbarBaslik="Kişiler"

        //binding.rv.layoutManager=LinearLayoutManager(requireContext())
        //binding.rv.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        //binding.rv.layoutManager=StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
       // binding.rv.layoutManager=LinearLayoutManager(requireContext())

        viewModel.kisilerListesi.observe(viewLifecycleOwner){
            val kisilerAdapter=KisilerAdapter(requireContext(),it,viewModel)
            binding.kisilerAdapter=kisilerAdapter
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel: AnasayfaViewModel by viewModels()
        viewModel=tempViewModel

    }

    fun fabTikla(it:View){
        Navigation.findNavController(it).navigate(R.id.kisiKayitGecis)
    }

    fun ara(aramaKelimesi:String){
        Log.e("Kişi Ara",aramaKelimesi)
    }


}