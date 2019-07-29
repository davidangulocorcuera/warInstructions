package com.cloudfy.warInstructions

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.cloudfy.warInstructions.entities.Chapter
import com.cloudfy.warInstructions.model.ChapterDao
import com.cloudfy.warInstructions.database.ChaptersDatabase
import org.jetbrains.anko.doAsync

class MainViewModel(var application: Application): ViewModel() {

    private lateinit var chaptersDao: ChapterDao
    private lateinit var mAllChapters: LiveData<List<Chapter>>

    init {
        val db: ChaptersDatabase =
            ChaptersDatabase.getDatabase(application);
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
