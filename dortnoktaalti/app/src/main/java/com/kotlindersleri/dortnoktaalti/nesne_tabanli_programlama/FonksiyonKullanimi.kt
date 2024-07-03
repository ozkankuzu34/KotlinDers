package com.kotlindersleri.dortnoktaalti.nesne_tabanli_programlama

fun main() {
    val f=Fonksiyonlar()
    f.selamla1()

    val gelenSonuc=f.selamla2()
    println(gelenSonuc)
    f.selamla3("özkan")
    val gelenToplam=f.toplama1(10,20)
    println(gelenToplam)


    f.carp(5,5)


}