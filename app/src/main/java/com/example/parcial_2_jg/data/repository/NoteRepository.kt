package com.example.parcial_2_jg.data.repository

import android.content.Context

import com.example.parcial_2_jg.data.model.NoteModel
import com.example.parcial_2_jg.data.remote.ApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Call

class NoteRepository (context: Context) {
    private val apiClient= ApiClient().getApiService()
    // private val database=AppDataBase.getInstance(context)

    suspend fun getNotes(): Call<List<NoteModel>> {
        return withContext(Dispatchers.IO){
            //database.noteDao().getListNotes()
            apiClient.notes()
        }
    }

    /*
    suspend fun insertNote(note:NoteModel){
        withContext(Dispatchers.IO){
            database.noteDao().insertNote(note)
        }
    }

    suspend fun deleteNote(note:NoteModel){
        withContext(Dispatchers.IO){
            database.noteDao().deleteNote(note)
        }
    }

    suspend fun updateNote(note:NoteModel){
        withContext(Dispatchers.IO){
            database.noteDao().updateNote(note)
        }
    }
    */

}