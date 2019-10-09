package com.onion.warInstructions.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.onion.warInstructions.base.BaseActivity
import com.onion.warInstructions.dataManager.JsonManager.getObjectsFromJson
import com.onion.warInstructions.dataManager.JsonManager.getJson
import com.onion.warInstructions.entities.Chapter


class HomeViewModel : ViewModel() {


    val chapters = MutableLiveData<ArrayList<Chapter>>()
    val chaptersResponse: MutableLiveData<ArrayList<Chapter>> by lazy {
        MutableLiveData<ArrayList<Chapter>>().also {
            chapters
        }
    }

    fun getAllChapters(activity: BaseActivity) {
        val chapters = getObjectsFromJson(getJson("data/war_book.json",activity))
        this.chaptersResponse.postValue(chapters)
    }





}