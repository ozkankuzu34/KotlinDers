package com.kotlindersleri.calismayapisi

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.kotlindersleri.calismayapisi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDetay.setOnClickListener{
           // Snackbar.make(it,"Merhaba",Snackbar.LENGTH_SHORT).show()
           // binding.textView.text="Nasılsın"
            val intent=Intent(this@MainActivity,DetayActivity::class.java)
            intent.putExtra("ad","Ahmet")
            intent.putExtra("yas",23)
            intent.putExtra("boy",1.78)
            intent.putExtra("bekar",true)
            startActivity(intent)
        }

    }
}