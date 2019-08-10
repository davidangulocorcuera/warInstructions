package com.cloudfy.warInstructions

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.cloudfy.warInstructions.base.BaseActivity
import com.cloudfy.warInstructions.content.Mapper
import com.cloudfy.warInstructions.database.ChaptersDatabase
import com.cloudfy.warInstructions.entities.Chapter
import java.nio.charset.Charset

class MainViewModel(var activity: BaseActivity? = null) : ViewModel() {

    val chapters = MutableLiveData<ArrayList<Chapter>>()

    val chaptersResponse: MutableLiveData<ArrayList<Chapter>> by lazy {
        MutableLiveData<ArrayList<Chapter>>().also {
            chapters
        }
    }


    fun getAllChapters(application: Application, activity: BaseActivity) {
            ChaptersDatabase.getDatabase(application).chapterDao().getAllChapters()
                .observe(
                    activity,
                    Observer<List<Chapter>> {
                        it?.let { chapters ->
                            this.chaptersResponse.postValue(ArrayList(chapters))
                        }
                    })


    }

    fun readJson(path: String, activity: BaseActivity): String {
        var json = ""

            val inputStream = activity.assets.open(path)
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            json = String(buffer, Charset.forName("UTF-8"))

            if (json.isNotEmpty()) Mapper.jsonToChapters(json)

        return json
    }

}