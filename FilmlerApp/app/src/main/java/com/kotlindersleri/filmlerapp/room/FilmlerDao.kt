package com.kotlindersleri.filmlerapp.room

import androidx.room.Dao
import androidx.room.Query
import com.kotlindersleri.filmlerapp.data.entity.Filmler

@Dao
interface FilmlerDao {
    @Query("SELECT * FROM filmler")
    suspend fun filmleriYukle() :List<Filmler>
}