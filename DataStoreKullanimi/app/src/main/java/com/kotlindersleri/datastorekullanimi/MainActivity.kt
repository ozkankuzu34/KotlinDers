package com.kotlindersleri.datastorekullanimi

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kotlindersleri.datastorekullanimi.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ap=AppPref(this)

        CoroutineScope(Dispatchers.Main).launch {
            //Kayıt işlemleri
            ap.kayitAd("Ahmet")
            ap.kayitYas(23)
            ap.kayitBoy(1.78)
            ap.kayitBekar(true)

            val liste=HashSet<String>()
            liste.add("Ali")
            liste.add("Ece")

            ap.kayitArkadasListe(liste)

            //Okuma İşlemleri
            val gelenAd=ap.okuAd()
            val gelenYas=ap.okuYas()
            val gelenBoy=ap.okuBoy()
            val gelenBekar=ap.okuBekar()


            Log.e("Gelen Ad",gelenAd)
            Log.e("Gelen Yas", gelenYas.toString())
            Log.e("Gelen Boy", gelenBoy.toString())
            Log.e("Gelen Bekar", gelenBekar.toString())

            val gelenListe=ap.okuArkadasListe()

            if(gelenListe !=null){
                for (a in gelenListe){
                    Log.e("Gelen Arkadaş",a)
                }
            }

            var gelecSayac=ap.okuSayac()

            ap.kayitSayac(++gelecSayac)

            binding.textViewSayac.text="Açılış Sayısı : $gelecSayac"
        }
    }
}