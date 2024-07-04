package com.kotlindersleri.kotlindersleri2.nesne_tabanli_programlama.kalitim

fun main() {
    val topkapiSarayi=Saray(5,300)
    val bogazVilla=Villa(true,10)

    println(topkapiSarayi.kuleSayisi)
    println(topkapiSarayi.pencereSayisi)

    println(bogazVilla.garajVarmi)
    println(bogazVilla.pencereSayisi)
}