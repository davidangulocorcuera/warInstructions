package com.cloudfy.warInstructions.index


import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import com.cloudfy.warInstructions.R
import com.cloudfy.warInstructions.base.BaseFragment
import com.cloudfy.warInstructions.entities.Chapter
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.fragment_index.*
import org.jetbrains.anko.support.v4.act


class IndexFragment : BaseFragment() {
    private lateinit var indexAdapter: IndexAdapter
    private var chapters: ArrayList<Chapter> = ArrayList()
    private lateinit var mInterstitialAd: InterstitialAd




    override fun onCreateViewId(): Int {
        return R.layout.fragment_index
    }

    override fun viewCreated(view: View?) {
        setToolbarTitle("Índice")
        setToolbarBackButton(true)
        showToolbar(true)
        initList()
        if(chapters.isEmpty()){
            val args: IndexFragmentArgs by navArgs()
            chapters = ArrayList(args.chapters.toList())
            indexAdapter.addAll(chapters)
        }



    }

    private fun initializeInterstitialAd(){
        MobileAds.initialize(act,
            "ca-app-pub-1767954011690390~3917587805")
        mInterstitialAd = InterstitialAd(act)
        mInterstitialAd.adUnitId = "ca-app-pub-1767954011690390/6028799726"
        mInterstitialAd.loadAd(AdRequest.Builder().build())
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
                val bundle = Bundle()
                bundle.putParcelableArray("subChapters",it.subchapters.toTypedArray())
                bundle.putString("title",it.title)
                loadAds()
                this.findNavController().navigate(R.id.goToSubIndex, bundle)
            }
    }

    private fun loadAds(){
        if (mInterstitialAd.isLoaded) {
            mInterstitialAd.show()
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        showToolbar(false)

    }

    override fun onResume() {
        super.onResume()
        initializeInterstitialAd()
    }



}
