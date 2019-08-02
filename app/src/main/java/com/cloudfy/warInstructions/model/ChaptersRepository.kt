package com.cloudfy.warInstructions.model

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.cloudfy.warInstructions.entities.Chapter
import com.cloudfy.warInstructions.database.ChaptersDatabase
import org.jetbrains.anko.doAsync

class ChaptersRepository(var application: Application,
                         val db: ChaptersDatabase = ChaptersDatabase.getDatabase(application),
                         val chaptersDao: ChaptersDao = db.chapterDao()
): ViewModel() {

    private lateinit var mAllChapters: LiveData<List<Chapter>>

    fun getAllChapters(): LiveData<List<Chapter>> {
        return chaptersDao.getAllChapters()
    }
    fun insertAsynTask(chapter: Chapter) {
        doAsync {
            chaptersDao.insert(chapter)
        }
    }

}
