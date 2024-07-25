package com.kotlindersleri.filmlerapp.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kotlindersleri.filmlerapp.data.entity.Filmler

@Database(entities = [Filmler::class], version = 1)
abstract class Veritabani :RoomDatabase(){
    abstract fun getFilmlerDao():FilmlerDao
}