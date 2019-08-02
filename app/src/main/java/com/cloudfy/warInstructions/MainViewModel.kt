package com.cloudfy.warInstructions

import android.app.Application
import android.content.Context
import android.util.Base64
import android.util.Log
import androidx.annotation.Nullable
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.cloudfy.warInstructions.base.BaseActivity
import com.cloudfy.warInstructions.database.ChaptersDatabase
import com.cloudfy.warInstructions.database.ChaptersDatabase.Companion.getDatabase
import com.cloudfy.warInstructions.entities.Chapter
import com.cloudfy.warInstructions.model.ChaptersRepository

 class MainViewModel : ViewModel() {

    val chapters = MutableLiveData<ArrayList<Chapter>>()

    val chaptersResponse: MutableLiveData<ArrayList<Chapter>> by lazy {
        MutableLiveData<ArrayList<Chapter>>().also {
            chapters
        }
    }


    fun getAllChapters(application: Application, activity: BaseActivity){
        ChaptersDatabase.getDatabase(application).chapterDao().getAllChapters()
            .observe(activity,
                Observer<List<Chapter>> {
                    it?.let { chapters ->
                        this.chaptersResponse.postValue(ArrayList(chapters))
                    }
                })
    }

}