package com.cloudfy.warInstructions.home


import android.view.View
import androidx.navigation.fragment.findNavController
import com.cloudfy.warInstructions.R
import com.cloudfy.warInstructions.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : BaseFragment() {

    override fun onCreateViewId(): Int {
        return R.layout.fragment_home
    }

    override fun viewCreated(view: View?) {
        goToIndex()
    }

    private fun goToIndex() {
        btnIndex.setOnClickListener {
            this.findNavController().navigate(R.id.goToIndex)
        }

    }



}
