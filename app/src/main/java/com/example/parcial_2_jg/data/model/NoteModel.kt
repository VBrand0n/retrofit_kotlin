package com.example.parcial_2_jg.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


data class NoteModel(

    val id:Int?=null,
    val title:String,
    val content:String,
    val createAt:String,
    val updateAt:String
)
