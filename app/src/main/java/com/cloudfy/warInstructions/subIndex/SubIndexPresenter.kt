package com.cloudfy.warInstructions.subIndex

import com.cloudfy.warInstructions.base.MainMVP
import com.cloudfy.warInstructions.entities.Subchapter

class SubIndexPresenter(private val view: SubIndexView) : MainMVP.Presenter {
    private  var subchapters: ArrayList<Subchapter> = ArrayList()


    fun getData(args: SubIndexFragmentArgs) {
        subchapters = ArrayList(args.subChapters.toList())
        view.addSubchapters(subchapters)
    }
}