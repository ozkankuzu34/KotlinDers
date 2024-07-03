package com.kotlindersleri.dortnoktaalti.nesne_tabanli_programlama

class Fonksiyonlar {
    fun selamla1(){
        val sonuc="Merhaba Ahmet"
        println(sonuc)
    }
    fun selamla2():String{
        val sonuc="Merhaba Ahmet"
        return sonuc
    }
    fun selamla3(isim:String){
        val sonuc="merhaba $isim"
        println(sonuc)
    }
    fun toplama1(sayi1:Int,sayi2:Int):Int{
        val toplam=sayi1+sayi2
        return toplam
    }

    fun carp(sayi1:Int,sayi2:Int){
        println("Çarpma : ${sayi1*sayi2}")
    }
    fun carp(sayi1:Double,sayi2:Int){
        println("Çarpma : ${sayi1*sayi2}")
    }
    fun carp(sayi1:Int,sayi2:Double){
        println("Çarpma : ${sayi1*sayi2}")
    }
    fun carp(sayi1:Double,sayi2:Double){
        println("Çarpma : ${sayi1*sayi2}")
    }
}