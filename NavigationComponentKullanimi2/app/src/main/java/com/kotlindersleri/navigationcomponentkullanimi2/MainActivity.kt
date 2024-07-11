package com.kotlindersleri.navigationcomponentkullanimi2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.kotlindersleri.navigationcomponentkullanimi2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navHostFragment1=supportFragmentManager.findFragmentById(R.id.navHostFragment1) as NavHostFragment

        NavigationUI.setupWithNavController(binding.bottomNavigationView,navHostFragment1.navController)

    }
}