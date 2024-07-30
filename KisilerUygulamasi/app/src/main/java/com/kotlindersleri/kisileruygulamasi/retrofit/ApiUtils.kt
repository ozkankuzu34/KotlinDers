package com.kotlindersleri.kisileruygulamasi.retrofit

class ApiUtils {
    companion object{
        val BASE_URL="http://www.kasimadalan.pe.hu/"

        fun getKisilerDao():KisilerDao{
            return RetrofitClient.getClient(BASE_URL).create(KisilerDao::class.java)
        }
    }
}