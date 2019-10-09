package com.onion.warInstructions.index

import com.onion.warInstructions.base.MainMVP
import com.onion.warInstructions.entities.Chapter

class IndexPresenter(private val view: IndexView): MainMVP.Presenter {
    private var chapters: ArrayList<Chapter> = ArrayList()


    fun getData(args: IndexFragmentArgs){
            chapters = ArrayList(args.chapters.toList())
            view.addChapters(chapters)
        }
    }

