package com.kotlindersleri.superkahramankitabi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.kotlindersleri.superkahramankitabi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var superKahramanListesi:ArrayList<SuperKahraman>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val superman=SuperKahraman("Superman","Gazeteci",R.drawable.superman)
        val batman=SuperKahraman("Batman","Patron",R.drawable.batman)
        val ironman=SuperKahraman("Iron man","Holding Sahibi",R.drawable.ironman)
        val spiderman=SuperKahraman("Spiderman","Gazeteci",R.drawable.spiderman)

        superKahramanListesi= arrayListOf(superman,batman,ironman,spiderman)

        val adapter=SuperKahramanAdapter(superKahramanListesi)
        binding.superKahramanRecyclerView.layoutManager=LinearLayoutManager(this)
        binding.superKahramanRecyclerView.adapter=adapter



    }
}