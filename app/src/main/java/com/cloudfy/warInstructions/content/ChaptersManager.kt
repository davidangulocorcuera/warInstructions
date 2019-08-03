package com.cloudfy.warInstructions.content

import com.cloudfy.warInstructions.entities.Chapter
import com.cloudfy.warInstructions.entities.Subchapter

object ChaptersManager {
    val chapters: ArrayList<Chapter> = ArrayList()

    private val chapterOne: Chapter = Chapter(
        1,
        title = "La patría y la bandera"
        , index = 1
        , subchapters = arrayListOf(
            Subchapter(title = "La patría y la bandera", content = ""),
            Subchapter(title = "El amor a la patría"),
            Subchapter(title = "Deberes del hombre para con la patría"),
            Subchapter(title = "La bandera")

        )
    )

    private val chapterTwo: Chapter = Chapter(
        2,
        title = "La Marina"
        , index = 2
        , subchapters = arrayListOf(
            Subchapter(title = "¿Qué es la Marina?", content = ""),
            Subchapter(title = "importancia de la Marina de guerra"),
            Subchapter(title = "Lo que ha hecho la Marina española"),
            Subchapter(title = "La bandera")

        )
    )
    fun addChapters(){
        chapters.add(chapterOne)
        chapters.add(chapterTwo)
    }
}