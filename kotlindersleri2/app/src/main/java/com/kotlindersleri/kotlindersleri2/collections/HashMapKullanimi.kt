package com.kotlindersleri.kotlindersleri2.collections

fun main() {
    //Dictionary
    val iller=HashMap<Int,String>()
    iller.put(16,"Bursa")
    iller.put(34,"İstanbul")
    iller[6]="Ankara"
    println(iller)

    println(iller.get(16))
    iller.put(16,"Yeni Bursa")
    println(iller)

    println(iller.size)
    println(iller.isEmpty())

    for ((key,value) in iller){
        println("$key -> $value")
    }
    iller.remove(34)
    println(iller)

    iller.clear()
    println(iller)

}