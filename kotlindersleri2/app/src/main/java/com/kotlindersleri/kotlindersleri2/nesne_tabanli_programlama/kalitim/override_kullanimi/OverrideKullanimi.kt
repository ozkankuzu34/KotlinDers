package com.kotlindersleri.kotlindersleri2.nesne_tabanli_programlama.kalitim.override_kullanimi

fun main() {
    val hayvan=Hayvan()
    val memeli=Memeli()
    val kedi=Kedi()
    val kopek=Kopek()

    hayvan.sesCikar()//kalıtım yok ,kendi sınıfına erişti
    memeli.sesCikar()//kalıtım var,üst sınıfın metodunu kullandı
    kedi.sesCikar()//kalıtım var,kendi metodunu kullandı
    kopek.sesCikar()//kalıtım var,kendi metodunu kullandı

}