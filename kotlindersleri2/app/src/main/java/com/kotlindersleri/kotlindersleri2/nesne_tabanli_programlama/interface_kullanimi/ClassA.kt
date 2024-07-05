package com.kotlindersleri.kotlindersleri2.nesne_tabanli_programlama.interface_kullanimi

class ClassA :MyInterface {
    override val degisken: Int=10


    override fun metod1() {
        println("metod 1 çalıştı")
    }

    override fun metod2(): String {
    return "metot 2 çalıştı"
        }

}