package com.kotlindersleri.glidekullanimi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.kotlindersleri.glidekullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //http://kasimadalan.pe.hu/yemekler/resimler/su.png

        resimGoster("kofte.png")

        binding.buttonResim1.setOnClickListener {
            resimGoster("ayran.png")
        }

        binding.buttonResim2.setOnClickListener {
            resimGoster("su.png")

        }

    }

    fun resimGoster(resimAdi:String){
        val url="http://kasimadalan.pe.hu/yemekler/resimler/$resimAdi"
        Glide.with(this).load(url).override(300,300).into(binding.imageView)
    }
}