package com.onion.warInstructions.subIndex

import com.onion.warInstructions.base.MainMVP
import com.onion.warInstructions.entities.Subchapter

class SubIndexPresenter(private val view: SubIndexView) : MainMVP.Presenter {
    private  var subchapters: ArrayList<Subchapter> = ArrayList()


    fun getData(args: SubIndexFragmentArgs) {
        subchapters = ArrayList(args.subChapters.toList())
        view.addSubchapters(subchapters)
    }
}