package com.kotlindersleri.kotlindersleri2.nesne_tabanli_programlama.composition

fun main() {
    val k1=Kategoriler(1,"Dram")
    val k2=Kategoriler(2,"Bilim Kurgu")

    val y1=Yonetmenler(1,"Quentin Tarantino")
    val y2=Yonetmenler(2,"Christoper Nolan")

    val f1=Filmler(1,"Django",2013,k1,y1)
    println(f1.yonetmen.yonetmen_ad)
}