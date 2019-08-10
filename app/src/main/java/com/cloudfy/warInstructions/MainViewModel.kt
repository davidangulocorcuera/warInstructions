package com.cloudfy.warInstructions

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cloudfy.warInstructions.base.BaseActivity
import com.cloudfy.warInstructions.content.Mapper
import com.cloudfy.warInstructions.entities.Chapter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.nio.charset.Charset

class MainViewModel() : ViewModel() {

    val chapters = MutableLiveData<ArrayList<Chapter>>()

    val chaptersResponse: MutableLiveData<ArrayList<Chapter>> by lazy {
        MutableLiveData<ArrayList<Chapter>>().also {
            chapters
        }
    }

    fun getAllChapters(activity: BaseActivity) {
        this.chaptersResponse.postValue(
            mapJson(
                readJson("data/war_book.json",activity)
            )
        )
    }

    private fun readJson(path: String, activity: BaseActivity): String{
        val inputStream = activity.assets.open(path)
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        return String(buffer, Charset.forName("UTF-8"))
    }

    private fun mapJson(json: String): ArrayList<Chapter>{
        val gson = Gson()
        val listType = object : TypeToken<ArrayList<Chapter>>() {
        }.type
        return  gson.fromJson(json, listType)
    }

}