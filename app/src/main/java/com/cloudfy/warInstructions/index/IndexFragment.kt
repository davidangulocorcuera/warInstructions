package com.cloudfy.warInstructions.index


import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.cloudfy.warInstructions.R
import com.cloudfy.warInstructions.base.BaseFragment
import com.cloudfy.warInstructions.base.ConstantsManager
import com.cloudfy.warInstructions.entities.Chapter
import com.cloudfy.warInstructions.index.adapter.IndexAdapter
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.fragment_index.*


class IndexFragment : BaseFragment(), IndexView {

    private lateinit var indexAdapter: IndexAdapter
    private var chapters: ArrayList<Chapter> = ArrayList()
    private val presenter: IndexPresenter by lazy { IndexPresenter(this) }
    private val args: IndexFragmentArgs by navArgs()
    private val bundle: Bundle by lazy {Bundle()}
    private lateinit var mInterstitialAd: InterstitialAd



    override fun onCreateViewId(): Int {
        return R.layout.fragment_index
    }

    override fun viewCreated(view: View?) {
        initAdds()
        initInterstitial()
        setInterstitialListener()
        showProgress(show = true, hasShade = true)
        setToolbarTitle(getString(R.string.index))
        showToolbar(true)
        initList()
        if (chapters.isEmpty()) {
            presenter.getData(args)
        }
    }

    private fun setInterstitialListener() {
        mInterstitialAd.adListener = object : AdListener() {
            override fun onAdClosed() {
                mInterstitialAd.loadAd(AdRequest.Builder().build())
            }

            override fun onAdLoaded() {
                super.onAdLoaded()
                showProgress(show = false, hasShade = false)
            }
        }
    }

    private fun initAdds() {
        MobileAds.initialize(context)
    }

    private fun initInterstitial() {
        mInterstitialAd = InterstitialAd(context)
        mInterstitialAd.adUnitId = "ca-app-pub-1767954011690390/1821106455"
        mInterstitialAd.loadAd(AdRequest.Builder().build())
    }

    private fun initList() {
        val layoutManager = LinearLayoutManager(context)
        rvIndex.layoutManager = layoutManager
        setListListener()
        rvIndex.adapter = indexAdapter
    }



    private fun setListListener() {
        indexAdapter =
            IndexAdapter(
                activity = activity!!,
                items = chapters
            ) {
                if (mInterstitialAd.isLoaded) {
                    mInterstitialAd.show()
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.")
                }
                goToSubIndexFragment(it)

            }
    }

    private fun goToSubIndexFragment(chapter: Chapter){
        bundle.putParcelableArray(
            ConstantsManager.SUBCHAPTERS,
            chapter.subchapters.toTypedArray()
        )
        bundle.putString(ConstantsManager.TOOLBAR_TITLE, chapter.title)
        this.findNavController().navigate(R.id.goToSubIndex, bundle)
    }


    override fun addChapters(chapters: ArrayList<Chapter>) {
        indexAdapter.addAll(chapters)
    }

    override fun onDestroy() {
        super.onDestroy()
        showToolbar(false)

    }

}
