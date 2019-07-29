package com.cloudfy.warInstructions.home


import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.cloudfy.warInstructions.R
import com.cloudfy.warInstructions.base.BaseFragment
import com.cloudfy.warInstructions.database.ChaptersDatabase
import com.cloudfy.warInstructions.entities.Chapter
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : BaseFragment() {
    override fun onCreateViewId(): Int {
        return R.layout.fragment_home
    }

    override fun viewCreated(view: View?) {
        goToIndex()
        context?.let {
            ChaptersDatabase.getDatabase(it).chapterDao().getAllChapters()
                .observe(this,
                    Observer<List<Chapter>> { chapters ->
                        if(chapters.isNotEmpty()){
                            Log.v("taag", "is not empty")

                        }
                        else{
                            Log.v("taag", "is empty")
                        }

                    })
        }

    }

    private fun goToIndex() {
        btnIndex.setOnClickListener {
            this.findNavController().navigate(R.id.goToIndex)
        }

    }



}
