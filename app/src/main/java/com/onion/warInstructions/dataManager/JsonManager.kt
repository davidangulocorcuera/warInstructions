package com.onion.warInstructions.dataManager

import com.onion.warInstructions.base.BaseActivity
import com.onion.warInstructions.entities.Chapter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.nio.charset.Charset

object JsonManager {

    fun getJson(path: String, activity: BaseActivity): String {
        val inputStream = activity.assets.open(path)
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        return String(buffer, Charset.forName("UTF-8"))
    }

    fun getObjectsFromJson(json: String): ArrayList<Chapter> {
        val gson = Gson()
        val listType = object : TypeToken<ArrayList<Chapter>>() {
        }.type
        return gson.fromJson(json, listType)
    }
}