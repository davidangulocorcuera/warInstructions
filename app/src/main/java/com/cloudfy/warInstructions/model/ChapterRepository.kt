package com.cloudfy.warInstructions.model

import android.app.Application
import android.os.AsyncTask
import androidx.lifecycle.LiveData
import com.cloudfy.warInstructions.entities.Chapter
import org.jetbrains.anko.doAsync

class ChapterRepository(var application: Application) {

    private lateinit var chaptersDao: ChapterDao
    private lateinit var mAllChapters: LiveData<List<Chapter>>

    init {
        val db: ChaptersDatabase = ChaptersDatabase.getDatabase(application);
        val chaptersDao = db.chapterDao()
        val mAllChapters = chaptersDao.getAllChapters()
    }
    fun getAllChapters(): LiveData<List<Chapter>> {
        return mAllChapters;
    }
    fun insertAsynTask(chapter: Chapter) {
        doAsync {
            chaptersDao.insert(chapter)
        }
    }

}
