package com.cloudfy.warInstructions.content

import com.cloudfy.warInstructions.base.MainMVP

class ContentPresenter(private val view: ContentView): MainMVP.Presenter {
    private var paragraphs: ArrayList<String> = ArrayList()
    fun getData(args: ContentFragmentArgs){
        paragraphs = ArrayList(args.paragraphs.toList())
        view.addParagraphs(paragraphs)
    }
}