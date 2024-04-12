package com.example.parcial_2_jg.data.remote

import com.example.parcial_2_jg.data.model.NoteModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiServices {

    @GET("note")
    fun notes(): Call<List<NoteModel>> // Cambio de List<NoteModel> a Call<List<NoteModel>>
}