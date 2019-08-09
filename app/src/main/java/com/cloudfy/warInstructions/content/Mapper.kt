package com.cloudfy.warInstructions.content

import android.util.Log
import com.cloudfy.warInstructions.entities.Chapter
import com.google.gson.Gson

object Mapper {
    fun jsonToChapters(json: String){
        val gson = Gson()
        val post = gson.fromJson(json, Chapter::class.java)
        Log.v("taag", post.toString())
    }
}