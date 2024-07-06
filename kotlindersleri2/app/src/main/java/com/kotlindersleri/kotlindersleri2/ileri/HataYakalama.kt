package com.kotlindersleri.kotlindersleri2.ileri

fun main() {
    //1.Compile error
    val x=10
    //x=300 //val değişkene yeni değer atama hatası

    //2.Exception
    val a=10
    val b=0
    /*println("Sonuc :${a/b}")
    println("işlem tamam")*/

    try {
        println("Sonuc :${a/b}")
        println("işlem tamam")
    }catch (e:Exception){
        println("ikinci sayı sıfır olamaz hata:$e")
    }finally {
        println("çalıştı")
    }


}