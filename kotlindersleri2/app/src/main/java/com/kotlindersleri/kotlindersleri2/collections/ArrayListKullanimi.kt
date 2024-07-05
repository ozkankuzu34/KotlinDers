package com.kotlindersleri.kotlindersleri2.collections

fun main() {
    val sayilar =ArrayList<Int>()
    val meyveler=ArrayList<String>()

    meyveler.add("Elma")
    meyveler.add("Muz")
    meyveler.add("Kiraz")

    println(meyveler)

    meyveler[1]="Yeni Muz"
    println(meyveler)

    meyveler.add(1,"Portakal")
    println(meyveler)

    println(meyveler[3])
    println(meyveler.get(2))

    println("Boyut : ${meyveler.size}")
    println("Boyut : ${meyveler.count()}")
    println("Boş kontrol : ${meyveler.isEmpty()}")//boşmu kontrol
    println("İçeriyor mu :${meyveler.contains("Kiraz")}")

    meyveler.reverse()//    Sıralama ters çevirme
    println(meyveler)

    meyveler.sort()//alfabetik sıralama(string ise),
    println(meyveler)

    for((indeks,meyve) in meyveler.withIndex()){
        println("$indeks.-> $meyve")
    }

    meyveler.removeAt(2)//indexe göre silme
    println(meyveler)

    meyveler.clear()//tamamını silme
    println(meyveler)

}