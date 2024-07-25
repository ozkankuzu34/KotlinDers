package com.kotlindersleri.bilgisaklamaprojesi

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kotlindersleri.bilgisaklamaprojesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var sharedPreferences: SharedPreferences
    var alinanKullaniciAdi:String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences=this.getSharedPreferences("com.kotlindersleri.bilgisaklamaprojesi",
            MODE_PRIVATE)
        alinanKullaniciAdi=sharedPreferences.getString("isim","")
        if (alinanKullaniciAdi==""){
            binding.textView.text="Kaydedilen İsim: "
        }else{
            binding.textView.text="Kaydedilen İsim: ${alinanKullaniciAdi}"
        }
    }
    fun kaydet(view: View){
        val kullaniciIsmi=binding.editTextText.text.toString()
        if (kullaniciIsmi==""){
            Toast.makeText(this@MainActivity,"isminizi boş bırakmayın",Toast.LENGTH_LONG).show()
        }else{
            sharedPreferences.edit().putString("isim",kullaniciIsmi).apply()
            binding.textView.text="Kaydedilen İsim ${kullaniciIsmi}"
        }


    }
    fun sil(view:View){
        alinanKullaniciAdi=sharedPreferences.getString("isim","")
        if(alinanKullaniciAdi!=""){
            sharedPreferences.edit().remove("isim").apply()
        }
        binding.textView.text="Kaydedilen isim :"
    }
}