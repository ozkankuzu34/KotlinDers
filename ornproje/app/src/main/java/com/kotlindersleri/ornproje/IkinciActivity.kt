package com.kotlindersleri.ornproje

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kotlindersleri.ornproje.databinding.ActivityIkinciBinding

class IkinciActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIkinciBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityIkinciBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val maindenGelenIntent=intent
        val yollananIsim= maindenGelenIntent.getStringExtra("isim")
        binding.textView2.text=yollananIsim

    }
    fun oncekiSayfa(view: View){
        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}