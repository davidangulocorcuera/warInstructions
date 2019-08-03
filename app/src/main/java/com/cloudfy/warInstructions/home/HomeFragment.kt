package com.cloudfy.warInstructions.home


import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.cloudfy.warInstructions.R
import com.cloudfy.warInstructions.base.BaseFragment
import com.cloudfy.warInstructions.entities.Chapter
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : BaseFragment() {
    private lateinit var chapters: ArrayList<Chapter>

    override fun onCreateViewId(): Int {
        return R.layout.fragment_home
    }

    override fun viewCreated(view: View?) {
        val bundle = Bundle()
        val args: HomeFragmentArgs by navArgs()

        chapters = ArrayList(args.chapters.toList())

        bundle.putParcelableArray("chapters", chapters.toTypedArray())

        btnIndex.setOnClickListener {
            this.findNavController().navigate(R.id.goToIndex, bundle)
        }
    }

}

