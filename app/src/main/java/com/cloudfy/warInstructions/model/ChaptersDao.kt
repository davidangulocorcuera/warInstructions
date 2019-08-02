package com.cloudfy.warInstructions.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.cloudfy.warInstructions.entities.Chapter

@Dao
interface ChaptersDao {
    @Insert
    fun insert(chapter: Chapter)

    @Insert
    fun insertAll(chapters: List<Chapter>)

    @Query("DELETE FROM chapters")
    fun deleteAll()


    @Query("SELECT * from chapters ORDER BY id ASC")
    fun getAllChapters(): LiveData<List<Chapter>>

}