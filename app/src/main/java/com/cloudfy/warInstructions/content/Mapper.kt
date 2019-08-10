package com.cloudfy.warInstructions.content

import android.util.Log
import com.cloudfy.warInstructions.entities.Chapter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object Mapper {
    fun jsonToChapters(json: String){
        val gson = Gson()
        val listType = object : TypeToken<ArrayList<Chapter>>() {
        }.type
        val chapters: ArrayList<Chapter> = gson.fromJson(json, listType)
    }


}