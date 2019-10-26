package com.cloudfy.warInstructions.content.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cloudfy.warInstructions.R
import com.cloudfy.warInstructions.base.BaseRecyclerAdapter
import kotlinx.android.synthetic.main.paragraph_item.view.*


class ContentAdapter(val items: ArrayList<String>, val activity: Activity) : BaseRecyclerAdapter<String, ContentAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.paragraph_item, parent, false)

        return ViewHolder(v)
    }

    init {
        list = items
    }


    inner class ViewHolder(var view: View) : BaseRecyclerAdapter.ViewHolder(view) {
        private lateinit var current: String


        override fun bind(position: Int) {
            current = getItem(position)
            setValues()
        }

        private fun setValues() {
            view.tvContent.text = current

        }

    }
}