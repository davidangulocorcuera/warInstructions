package com.onion.warInstructions.subIndex.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.onion.warInstructions.R
import com.onion.warInstructions.base.BaseRecyclerAdapter
import com.onion.warInstructions.entities.Subchapter
import kotlinx.android.synthetic.main.index_item.view.*


class SubIndexAdapter(val items: ArrayList<Subchapter>, val activity: Activity, var onClick: (Subchapter) -> Unit) : BaseRecyclerAdapter<Subchapter, SubIndexAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.index_item, parent, false)

        return ViewHolder(v)
    }

    init {
        list = items
    }


    inner class ViewHolder(var view: View) : BaseRecyclerAdapter.ViewHolder(view) {
        private lateinit var current: Subchapter


        override fun bind(position: Int) {
            current = getItem(position)
            setValues()
            view.setOnClickListener {
                onClick(current)
            }


        }

        private fun setValues() {
            view.tvTitle.text = current.title

        }

    }
}