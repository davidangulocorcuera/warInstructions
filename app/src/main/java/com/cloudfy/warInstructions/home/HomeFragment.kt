package com.cloudfy.warInstructions.home


import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.app.ActivityCompat.finishAffinity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.cloudfy.warInstructions.MainViewModel
import com.cloudfy.warInstructions.R
import com.cloudfy.warInstructions.base.BaseFragment
import com.cloudfy.warInstructions.entities.Chapter
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.fragment_home.*
import org.jetbrains.anko.support.v4.act


class HomeFragment : BaseFragment() {
    private  var chapters: ArrayList<Chapter> = ArrayList()
    private val mainViewModel: MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel()::class.java)
    }
    private val bundle: Bundle by lazy {
        Bundle()
    }


    override fun onCreateViewId(): Int {
        return R.layout.fragment_home
    }

    override fun viewCreated(view: View?) {
        setButtonsListeners()
        initializeViewModel()
        Log.v(
            "taag", mainViewModel.readJson("data/war_book.json",baseActivity!!)
        )

        initializeAds()
    }

    private fun initializeAds(){
        MobileAds.initialize(act, "ca-app-pub-1767954011690390~3917587805")
        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)
    }

    private fun initializeViewModel(){
        baseActivity?.let { activity ->
            mainViewModel.getAllChapters(activity.application, activity = activity)
            mainViewModel.chaptersResponse.observe(this, Observer { chapters ->
                chapters?.let {
                    this.chapters = it
                }
            })
        }
    }

    private fun setButtonsListeners(){
        btnIndex.setOnClickListener {

            bundle.putParcelableArray("chapters", chapters.toTypedArray())
            this.findNavController().navigate(R.id.goToIndex, bundle)
        }

        btnExit.setOnClickListener {
            finishAffinity(activity!!)
        }
    }

}

