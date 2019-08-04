package com.cloudfy.warInstructions.home


import android.app.ActionBar
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.app.ActivityCompat.finishAffinity
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.cloudfy.warInstructions.R
import com.cloudfy.warInstructions.base.BaseFragment
import com.cloudfy.warInstructions.entities.Chapter
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.fragment_home.*
import org.jetbrains.anko.support.v4.act


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

        MobileAds.initialize(act, "ca-app-pub-1767954011690390~3917587805")


        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)


        btnIndex.setOnClickListener {
            this.findNavController().navigate(R.id.goToIndex, bundle)
        }
        btnExit.setOnClickListener {
            finishAffinity(activity!!)
        }
    }

}

