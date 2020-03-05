package com.cloudfy.warInstructions.subIndex


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
import com.cloudfy.warInstructions.entities.Subchapter
import com.cloudfy.warInstructions.subIndex.adapter.SubIndexAdapter
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.fragment_sub_index.*

class SubIndexFragment : BaseFragment(), SubIndexView {
    override fun addSubchapters(subchapters: ArrayList<Subchapter>) {
        subIndexAdapter.addAll(subchapters)
    }

    private lateinit var mInterstitialAd: InterstitialAd
    private lateinit var subIndexAdapter: SubIndexAdapter
    private var subChapters: ArrayList<Subchapter> = ArrayList()
    private val args: SubIndexFragmentArgs by navArgs()
    private val presenter: SubIndexPresenter by lazy { SubIndexPresenter(this)}
    private val bundle: Bundle by lazy {Bundle()}


    override fun viewCreated(view: View?) {
        initAdds()
        initInterstitial()
        setInterstitialListener()
        setToolbarTitle(args.title)
        showToolbar(true)
        initList()
        if (subChapters.isEmpty()) {
            presenter.getData(args)
        }
    }

    override fun onCreateViewId(): Int {
        return R.layout.fragment_sub_index
    }

    private fun initList() {
        val layoutManager = LinearLayoutManager(context)
        rvSubIndex.layoutManager = layoutManager
        setListListener()
        rvSubIndex.adapter = subIndexAdapter
    }

    private fun setListListener() {
        subIndexAdapter =
            SubIndexAdapter(
                activity = activity!!,
                items = subChapters
            ) {
                if (mInterstitialAd.isLoaded) {
                    mInterstitialAd.show()
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.")
                }
                bundle.putStringArray(ConstantsManager.PHARAGRAPHS, it.paragrahps.toTypedArray())
                bundle.putString(ConstantsManager.TOOLBAR_TITLE, it.title)
                this.findNavController().navigate(R.id.goToContentFragment, bundle)
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



}
