package com.kotlindersleri.superkahramankitabi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kotlindersleri.superkahramankitabi.databinding.ActivityTanitimAktivitesiBinding

class TanitimAktivitesi : AppCompatActivity() {
    private lateinit var binding: ActivityTanitimAktivitesiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityTanitimAktivitesiBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val adapterdenGelenIntent=intent
       // val secilenKahraman=adapterdenGelenIntent.getSerializableExtra("secilenKahraman",SuperKahraman::class.java)
        val secilenKahraman=adapterdenGelenIntent.getSerializableExtra("secilenKahraman") as SuperKahraman
        binding.imageView.setImageResource(secilenKahraman.gorsel)
        binding.isimTextView.text=secilenKahraman.isim
        binding.meslekTextView.text=secilenKahraman.meslek
    }
}