package com.cloudfy.warInstructions.model

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.cloudfy.warInstructions.entities.Subchapter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.util.ArrayList


class Converters {

    @TypeConverter // note this annotation
    fun fromSubchaptersList(subchapters: ArrayList<Subchapter>?): String? {
        if (subchapters == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<List<Subchapter>>() {

        }.type
        return gson.toJson(subchapters, type)
    }

    @TypeConverter // note this annotation
        fun toSubchaptersList(subchapterString: String?): ArrayList<Subchapter>? {
        if (subchapterString == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<List<Subchapter>>() {

        }.type
        return gson.fromJson<ArrayList<Subchapter>>(subchapterString, type)
    }

}