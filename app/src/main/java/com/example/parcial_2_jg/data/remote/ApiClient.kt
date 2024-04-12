package com.example.parcial_2_jg.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {
    private val retrofit:Retrofit = Retrofit.Builder()
        .baseUrl("https://movie.danydev.co/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getApiService():ApiServices{
        return retrofit.create(ApiServices::class.java)
    }

}