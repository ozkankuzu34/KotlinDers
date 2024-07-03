package com.kotlindersleri.dortnoktaalti.nesne_tabanli_programlama

class Araba(var renk:String,var hiz:Int,var calisiyorMu:Boolean) {

    fun calistir(){
        calisiyorMu=true
        hiz=5
    }
    fun durdur(){
        calisiyorMu=false
        hiz=0
    }
    fun hizlan(kacKm:Int){
        hiz=hiz+kacKm
    }


    fun bilgiAl(){
    println("------------------------------")
    println("Renk           :${renk}")
    println("Hız            :${hiz}")
    println("Çalışıyormu    :${calisiyorMu}")
}
}