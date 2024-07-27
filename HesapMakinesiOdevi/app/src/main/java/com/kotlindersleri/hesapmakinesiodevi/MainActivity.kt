package com.kotlindersleri.hesapmakinesiodevi

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kotlindersleri.hesapmakinesiodevi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var sayi1:Double?=null
    var sayi2:Double?=null
    var sonuc:Double?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        /*
        binding.buttonCarp.setOnClickListener {
        sayi1=binding.editTextSayi1.text.toString().toDoubleOrNull()
        sayi2=binding.editTextSayi2.text.toString().toDoubleOrNull()
        if (sayi1 !=null && sayi2 !=null){
            sonuc= sayi1!! * sayi2!!
            binding.textView.text=sonuc.toString()
        }else{
            binding.textView.text="Numaraları giriniz"
        }

        }

        binding.buttonBol.setOnClickListener {
            sayi1=binding.editTextSayi1.text.toString().toDoubleOrNull()
            sayi2=binding.editTextSayi2.text.toString().toDoubleOrNull()
            if (sayi1 !=null && sayi2 !=null){
                sonuc= sayi1!! / sayi2!!
                binding.textView.text=sonuc.toString()
            }else{
                binding.textView.text="Numaraları giriniz"
            }

        }

        binding.buttonTopla.setOnClickListener {
            sayi1=binding.editTextSayi1.text.toString().toDoubleOrNull()
            sayi2=binding.editTextSayi2.text.toString().toDoubleOrNull()
            if (sayi1 !=null && sayi2 !=null){
                sonuc= sayi1!! + sayi2!!
                binding.textView.text=sonuc.toString()
            }else{
                binding.textView.text="Numaraları giriniz"
            }

        }

        binding.buttonCikar.setOnClickListener {
            sayi1=binding.editTextSayi1.text.toString().toDoubleOrNull()
            sayi2=binding.editTextSayi2.text.toString().toDoubleOrNull()
            if (sayi1 !=null && sayi2 !=null){
                sonuc= sayi1!! - sayi2!!
                binding.textView.text=sonuc.toString()
            }else{
                binding.textView.text="Numaraları giriniz"
            }

        }
        */





    }
    fun carp(view: View){
        sayi1=binding.editTextSayi1.text.toString().toDoubleOrNull()
        sayi2=binding.editTextSayi2.text.toString().toDoubleOrNull()
        if (sayi1 !=null && sayi2 !=null){
            sonuc= sayi1!! * sayi2!!
            binding.textView.text=sonuc.toString()
        }else{
            binding.textView.text="Numaraları giriniz"
        }
    }

    fun bol(view: View){
        sayi1=binding.editTextSayi1.text.toString().toDoubleOrNull()
        sayi2=binding.editTextSayi2.text.toString().toDoubleOrNull()
        if (sayi1 !=null && sayi2 !=null){
            sonuc= sayi1!! / sayi2!!
            binding.textView.text=sonuc.toString()
        }else{
            binding.textView.text="Numaraları giriniz"
        }
    }

    fun topla(view: View){
        sayi1=binding.editTextSayi1.text.toString().toDoubleOrNull()
        sayi2=binding.editTextSayi2.text.toString().toDoubleOrNull()
        if (sayi1 !=null && sayi2 !=null){
            sonuc= sayi1!! + sayi2!!
            binding.textView.text=sonuc.toString()
        }else{
            binding.textView.text="Numaraları giriniz"
        }
    }

    fun cikar(view: View){
        sayi1=binding.editTextSayi1.text.toString().toDoubleOrNull()
        sayi2=binding.editTextSayi2.text.toString().toDoubleOrNull()
        if (sayi1 !=null && sayi2 !=null){
            sonuc= sayi1!! - sayi2!!
            binding.textView.text=sonuc.toString()
        }else{
            binding.textView.text="Numaraları giriniz"
        }
    }


}