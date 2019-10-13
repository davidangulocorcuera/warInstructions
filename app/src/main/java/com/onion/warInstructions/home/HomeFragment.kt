package com.onion.warInstructions.home


import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityCompat.finishAffinity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.onion.warInstructions.R
import com.onion.warInstructions.base.BaseFragment
import com.onion.warInstructions.base.ConstantsManager
import com.onion.warInstructions.entities.Chapter
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : BaseFragment() {

    private var chapters: ArrayList<Chapter> = ArrayList()
    private val homeViewModel: HomeViewModel by lazy {
        ViewModelProviders.of(this).get(HomeViewModel()::class.java)
    }
    private val bundle: Bundle by lazy {Bundle()}


    override fun onCreateViewId(): Int {
        return R.layout.fragment_home
    }

    override fun viewCreated(view: View?) {
        setButtonsListeners()
        initializeViewModel()
        setToolbarBackButton(true)
        baseActivity?.let {
            homeViewModel.getAllChapters(it)
        }
    }


    private fun initializeViewModel() {
        homeViewModel.chaptersResponse.observe(this, Observer { chapters ->
            chapters?.let {
                this.chapters = it
            }
        })
    }

    private fun setButtonsListeners() {
        btnIndex.setOnClickListener {
           goToIndexFragment(bundle)
        }

        btnExit.setOnClickListener {
            activity?.let { activity ->
                finishAffinity(activity)
            }
        }
    }

    private fun goToIndexFragment(bundle: Bundle){
        bundle.putParcelableArray(ConstantsManager.CHAPTERS, chapters.toTypedArray())
        this.findNavController().navigate(R.id.goToIndex, bundle)
    }

}

