package com.onion.warInstructions.subIndex

import com.onion.warInstructions.base.MainMVP
import com.onion.warInstructions.entities.Subchapter

interface SubIndexView: MainMVP.View {
    fun addSubchapters(subchapters: ArrayList<Subchapter>)
}