package com.cloudfy.warInstructions.subIndex


import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager

import com.cloudfy.warInstructions.R
import com.cloudfy.warInstructions.base.BaseFragment
import com.cloudfy.warInstructions.entities.Subchapter
import kotlinx.android.synthetic.main.fragment_sub_index.*

class SubIndexFragment : BaseFragment() {
    private lateinit var subIndexAdapter: SubIndexAdapter
    private  var subChapters: ArrayList<Subchapter> = ArrayList()
    private val args: SubIndexFragmentArgs by navArgs()

    override fun viewCreated(view: View?) {
        setToolbarTitle(args.title)
        showToolbar(true)
        initList()
        if(subChapters.isEmpty()){
            subChapters = ArrayList(args.subChapters.toList())
            subIndexAdapter.addAll(subChapters)
        }
    }

    override fun onCreateViewId(): Int {
        return R.layout.fragment_sub_index
    }

    private fun initList() {
        val layoutManager = GridLayoutManager(activity, 1)
        rvSubIndex.layoutManager = layoutManager
        setListListener()
        rvSubIndex.adapter = subIndexAdapter
    }

    private fun setListListener() {
        subIndexAdapter =
            SubIndexAdapter(activity = activity!! , items = subChapters) {
                val bundle = Bundle()
                bundle.putParcelableArray("paragraphs",it.paragrahps.toTypedArray())
                bundle.putString("title",it.title)
                this.findNavController().navigate(R.id.goToContentFragment,bundle)
            }
    }

}
