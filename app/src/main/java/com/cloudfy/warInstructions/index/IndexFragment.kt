package com.cloudfy.warInstructions.index


import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import com.cloudfy.warInstructions.R
import com.cloudfy.warInstructions.base.BaseFragment
import com.cloudfy.warInstructions.database.ChaptersDatabase
import com.cloudfy.warInstructions.entities.Chapter
import com.cloudfy.warInstructions.home.HomeFragmentArgs
import kotlinx.android.synthetic.main.fragment_index.*


class IndexFragment : BaseFragment() {
    private lateinit var indexAdapter: IndexAdapter
    private var chapters: ArrayList<Chapter> = ArrayList()



    override fun onCreateViewId(): Int {
        return R.layout.fragment_index
    }

    override fun viewCreated(view: View?) {
        initList()
        val args: IndexFragmentArgs by navArgs()
        chapters = ArrayList(args.chapters.toList())
        chapters.forEach {chapter ->
            Log.v("taag", chapter.title)
        }
        indexAdapter.addAll(chapters)
        }
    private fun initList() {
        val layoutManager = GridLayoutManager(activity, 1)
        rvIndex.layoutManager = layoutManager
        setListListener()
        rvIndex.adapter = indexAdapter
    }

    private fun setListListener() {
        indexAdapter =
            IndexAdapter(activity = activity!! , items = chapters) {
                // onClick event
            }
    }



}
