package com.cloudfy.warInstructions.index


import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.cloudfy.warInstructions.R
import com.cloudfy.warInstructions.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_index.*


class IndexFragment : BaseFragment() {
    private lateinit var indexAdapter: IndexAdapter


    override fun onCreateViewId(): Int {
        return R.layout.fragment_index
    }

    override fun viewCreated(view: View?) {

    }
    private fun initUsersList() {
        val layoutManager = GridLayoutManager(activity, 1)
        rvIndex.layoutManager = layoutManager
        setListListener()
        rvIndex.adapter = indexAdapter
    }

    private fun setListListener() {
        indexAdapter =
            IndexAdapter(activity = activity!!) {
                // onClick event
            }
    }

}
