package com.kotlindersleri.androidalertdialog

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kotlindersleri.androidalertdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Toast.makeText(this@MainActivity,"HoşGeldiniz",Toast.LENGTH_LONG).show()

        /*
        binding.button.setOnClickListener {
            Toast.makeText(this,"Selamlar",Toast.LENGTH_LONG).show()
        }*/

    }
    fun kaydet(view:View){
        val alert=AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Kayıt Et")
        alert.setMessage("Kayıt etmek istediğinize emin misiniz")

        alert.setPositiveButton("Evet"){ dialog, which ->
            Toast.makeText(this@MainActivity,"Kayıt Edildi",Toast.LENGTH_LONG).show()
        }

        alert.setNegativeButton("Hayır",object :DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
                Toast.makeText(this@MainActivity,"Kayıt edilmedi",Toast.LENGTH_LONG).show()
            }
        })
        alert.show()
    }
}