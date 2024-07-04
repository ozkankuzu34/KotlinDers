package com.kotlindersleri.kotlindersleri2.nesne_tabanli_programlama.paket1

open class A {
    var varsayilanDegisken=1
    public var publicDegisken=2         //heryerden erişilebilir
    private var privateDegisken=3       //sadece class içinden erişilebilir
    internal var internalDegisken=4     //modül ile ilgili
    protected var protectedDegisken=5  // kalıtım yoluyla erişim inheritance

    /*fun fonksiyon(){
        println(privateDegisken)
    }*/
}