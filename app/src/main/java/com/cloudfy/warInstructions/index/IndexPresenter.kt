package com.cloudfy.warInstructions.index

import com.cloudfy.warInstructions.base.MainMVP
import com.cloudfy.warInstructions.entities.Chapter

class IndexPresenter(private val view: IndexView): MainMVP.Presenter {
    private var chapters: ArrayList<Chapter> = ArrayList()


    fun getData(args: IndexFragmentArgs){
            chapters = ArrayList(args.chapters.toList())
            view.addChapters(chapters)
        }
    }

