package com.cloudfy.warInstructions.index

import com.cloudfy.warInstructions.base.MainMVP
import com.cloudfy.warInstructions.entities.Chapter

interface IndexView : MainMVP.View  {
    fun addChapters(chapters: ArrayList<Chapter>)
}