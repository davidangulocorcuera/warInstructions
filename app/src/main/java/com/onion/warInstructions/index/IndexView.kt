package com.onion.warInstructions.index

import com.onion.warInstructions.base.MainMVP
import com.onion.warInstructions.entities.Chapter

interface IndexView : MainMVP.View  {
    fun addChapters(chapters: ArrayList<Chapter>)
}