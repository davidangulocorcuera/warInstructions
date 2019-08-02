package com.cloudfy.warInstructions

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.cloudfy.warInstructions.base.BaseActivity
import com.cloudfy.warInstructions.entities.Chapter
import com.cloudfy.warInstructions.database.ChaptersDatabase

class MainActivity : BaseActivity() {

    private val mainViewModel: MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel()::class.java)
    }

    override fun onCreateViewId(): Int {
        return R.layout.activity_main
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainViewModel.chaptersResponse.observe(this, Observer { chapters ->
            chapters?.let {
                Log.v("taag", it[0].title)
            }
        })
        mainViewModel.getAllChapters(application, this)


    }


}
