package com.kotlindersleri.ornproje

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kotlindersleri.ornproje.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    fun sonrakiSayfa(view:View){
        val intent=Intent(this,IkinciActivity::class.java)
        val kullaniciGirdisi=binding.editTextIsim.text.toString()
        intent.putExtra("isim",kullaniciGirdisi)
        startActivity(intent)
    }
}