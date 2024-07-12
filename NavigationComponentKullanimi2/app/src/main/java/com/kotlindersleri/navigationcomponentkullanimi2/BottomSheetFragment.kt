package com.kotlindersleri.navigationcomponentkullanimi2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.snackbar.Snackbar
import com.kotlindersleri.navigationcomponentkullanimi2.databinding.FragmentBottomSheetBinding


class BottomSheetFragment :  BottomSheetDialogFragment(){
    private lateinit var binding: FragmentBottomSheetBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentBottomSheetBinding.inflate(inflater,container,false)
        binding.imageViewPaylas.setOnClickListener{
            Snackbar.make(it,"Paylaşıldı",Snackbar.LENGTH_SHORT).show()
        }

        binding.imageViewKopyala.setOnClickListener{
            Snackbar.make(it,"Kopyalandı",Snackbar.LENGTH_SHORT).show()
        }

        return binding.root
    }


}