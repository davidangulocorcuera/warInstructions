package com.cloudfy.warInstructions.content

import com.beust.klaxon.JsonReader
import com.beust.klaxon.Klaxon
import com.cloudfy.warInstructions.entities.Chapter
import java.io.StringReader

object Mapper {

    fun streamingArray(json: String) {
        val klaxon = Klaxon()
        JsonReader(StringReader(json)).use { reader ->
            val result = arrayListOf<Chapter>()
            reader.beginArray {
                while (reader.hasNext()) {
                    val chapter = klaxon.parse<Chapter>(reader)
                    chapter?.let {
                        result.add(it)
                    }
                }
            }
        }
    }
}