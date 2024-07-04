package com.kotlindersleri.kotlindersleri2.nesne_tabanli_programlama

fun main() {
    ucretHesapla(124,KonserveBoyut.BUYUK)
}

fun ucretHesapla(adet:Int,boyut:KonserveBoyut){
    when(boyut){
        KonserveBoyut.KUCUK-> println("Toplam maliyet : ${adet*30} tl")
        KonserveBoyut.ORTA-> println("Toplam maliyet : ${adet*40} tl")
        KonserveBoyut.BUYUK-> println("Toplam maliyet : ${adet*50} tl")
    }
}