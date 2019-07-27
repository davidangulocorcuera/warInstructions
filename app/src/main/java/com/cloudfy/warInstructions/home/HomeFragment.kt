package com.cloudfy.warInstructions.home


import android.util.Log
import android.view.View
import androidx.annotation.Nullable
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.cloudfy.warInstructions.R
import com.cloudfy.warInstructions.base.BaseFragment
import com.cloudfy.warInstructions.entities.Chapter
import kotlinx.android.synthetic.main.fragment_home.*
import com.cloudfy.warInstructions.model.ChaptersDatabase


class HomeFragment : BaseFragment() {
    override fun onCreateViewId(): Int {
        return R.layout.fragment_home
    }

    override fun viewCreated(view: View?) {
       goToIndex()
    }

    private fun goToIndex(){
        btnIndex.setOnClickListener {
            this.findNavController().navigate(R.id.goToIndex)
        }
        ChaptersDatabase.getDatabase(context!!).chapterDao().getAllChapters()
            .observe(this,
                Observer<List<Chapter>> { chapters ->
                    if (chapters != null) {
                        Log.v("LISTA", chapters.toString())
                    } else {
                        Log.v("LISTA", "no hay datos")
                    }
                })

    }




}
