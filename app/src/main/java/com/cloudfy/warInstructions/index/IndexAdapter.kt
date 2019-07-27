package com.cloudfy.warInstructions.index

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cloudfy.warInstructions.R
import com.cloudfy.warInstructions.base.BaseRecyclerAdapter
import com.cloudfy.warInstructions.entities.Chapter
import kotlinx.android.synthetic.main.index_item.view.*


class IndexAdapter(val items: ArrayList<Chapter>, val activity: Activity, var onClick: (Chapter) -> Unit) : BaseRecyclerAdapter<Chapter, IndexAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.index_item, parent, false)

        return ViewHolder(v)
    }

    init {
        list = items
    }


    inner class ViewHolder(var view: View) : BaseRecyclerAdapter.ViewHolder(view) {
        private lateinit var current: Chapter


        override fun bind(position: Int) {
            current = getItem(position)
            setValues()

        }

        fun setValues() {
            view.tvNumberIndex.text = "I"

        }

    }
}