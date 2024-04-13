package com.example.parcial_2_jg.data.remote

import com.example.parcial_2_jg.data.model.NoteModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiServices {

    @GET("note")
    fun notes(): Call<List<NoteModel>> // Cambio de List<NoteModel> a Call<List<NoteModel>>

    @GET("note/{id}") // Cambio de "note" a "note/{id}"
    fun noteById(@Path("id")id:Int): Call<NoteModel> // Cambio de NoteModel a Call<NoteModel>
}