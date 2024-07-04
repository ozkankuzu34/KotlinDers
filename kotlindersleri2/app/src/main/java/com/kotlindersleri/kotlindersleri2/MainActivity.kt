package com.kotlindersleri.kotlindersleri2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var str1:String?=null
    lateinit var str2:String //lateinit daha sonra initialized etmek için yani değeri sonra atamak için kullanılır ve val ile kullanılmaz
    //lateinit var sayi:Int  // lateinit primitive tipler ile kullanılmaz
    var sayi:Int=0




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        str2="merhaba"

    }
}