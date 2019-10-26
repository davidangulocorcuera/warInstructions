package com.cloudfy.warInstructions.subIndex

import com.cloudfy.warInstructions.base.MainMVP
import com.cloudfy.warInstructions.entities.Subchapter

interface SubIndexView: MainMVP.View {
    fun addSubchapters(subchapters: ArrayList<Subchapter>)
}