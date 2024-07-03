package com.kotlindersleri.dortnoktaiki

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kotlindersleri.dortnoktaiki.databinding.ActivityMainBinding
import com.kotlindersleri.dortnoktaiki.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val maindenGelenIntent=intent
        val yollananIsim=maindenGelenIntent.getStringExtra("isim")

        binding.textView2.text=yollananIsim
    }


    fun ikinciAktiviteyiAc(view : View){
        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}