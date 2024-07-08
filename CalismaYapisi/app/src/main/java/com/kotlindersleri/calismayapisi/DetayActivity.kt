package com.kotlindersleri.calismayapisi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kotlindersleri.calismayapisi.databinding.ActivityDetayBinding

class DetayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDetayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gelenAd=intent.getStringExtra("ad")
        val gelenYas=intent.getIntExtra("yas",0)
        val gelenBoy=intent.getDoubleExtra("boy",0.0)
        val gelenBekar=intent.getBooleanExtra("bekar",false)

        binding.textViewBilgi.text="$gelenAd - $gelenYas - $gelenBoy - $gelenBekar"

    }
}