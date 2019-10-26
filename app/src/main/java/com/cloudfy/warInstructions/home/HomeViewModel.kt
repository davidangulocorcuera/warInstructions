package com.cloudfy.warInstructions.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cloudfy.warInstructions.base.BaseActivity
import com.cloudfy.warInstructions.dataManager.JsonManager.getObjectsFromJson
import com.cloudfy.warInstructions.dataManager.JsonManager.getJson
import com.cloudfy.warInstructions.entities.Chapter


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