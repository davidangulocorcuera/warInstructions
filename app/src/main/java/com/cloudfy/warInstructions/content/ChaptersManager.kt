package com.cloudfy.warInstructions.content

import com.cloudfy.warInstructions.entities.Chapter
import com.cloudfy.warInstructions.entities.Subchapter

object ChaptersManager {
    val chapters: ArrayList<Chapter> = ArrayList()

    val chapterOne: Chapter = Chapter(
        1,
        title = "La patría y la bandera"
        , index = 1
        , subchapters = arrayListOf(
            Subchapter(title = "La patría y la bandera"),
            Subchapter(title = "El amor a la patría"),
            Subchapter(title = "Deberes del hombre para con la patría"),
            Subchapter(title = "La bandera")

        )
    )
    fun addChapters(){
        chapters.add(chapterOne)
    }
}