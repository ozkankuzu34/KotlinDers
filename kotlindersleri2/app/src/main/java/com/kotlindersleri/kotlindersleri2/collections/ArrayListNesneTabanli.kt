package com.kotlindersleri.kotlindersleri2.collections

fun main() {
    val o1=Ogrenciler(200,"Zeynep","9C")
    val o2=Ogrenciler(300,"Ahmet","11Z")
    val o3=Ogrenciler(100,"Beyza","12A")

    val ogrencilerListesi=ArrayList<Ogrenciler>()

    ogrencilerListesi.add(o1)
    ogrencilerListesi.add(o2)
    ogrencilerListesi.add(o3)

    for(o in ogrencilerListesi){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif}")
    }

}