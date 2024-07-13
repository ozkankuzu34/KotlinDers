package com.kotlindersleri.kullanicietkilesimi

import android.app.Dialog
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import com.kotlindersleri.kullanicietkilesimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonToast.setOnClickListener {
            Toast.makeText(this,"Merhaba",Toast.LENGTH_LONG).show()
        }

        binding.buttonSnacbar.setOnClickListener {
            Snackbar.make(it,"Silmek istiyor musunuz?",Snackbar.LENGTH_SHORT)
                .setAction("Evet"){
                    Snackbar.make(it,"Silindi",Snackbar.LENGTH_SHORT)
                        .setTextColor(Color.YELLOW)
                        .show()

                }
                .setBackgroundTint(Color.WHITE)
                .setTextColor(Color.BLUE)
                .setActionTextColor(Color.RED)
                .show()
        }

        binding.buttonDialog.setOnClickListener {
            MaterialAlertDialogBuilder(this)
                .setTitle("Başlık")
                .setMessage("Mesaj")
                .setPositiveButton("Tamam"){d,i ->
                    Toast.makeText(this,"Tamam Seçildi",Toast.LENGTH_LONG).show()

                }
                .setNegativeButton("iptal"){d,i ->
                    Toast.makeText(this,"iptal seçildi",Toast.LENGTH_LONG).show()
                }
                .show()


        }

    }
}