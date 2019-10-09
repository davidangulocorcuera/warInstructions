package com.onion.warInstructions.subIndex


import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import com.onion.warInstructions.R
import com.onion.warInstructions.base.BaseFragment
import com.onion.warInstructions.base.ConstantsManager
import com.onion.warInstructions.entities.Subchapter
import com.onion.warInstructions.subIndex.adapter.SubIndexAdapter
import kotlinx.android.synthetic.main.fragment_sub_index.*

class SubIndexFragment : BaseFragment(), SubIndexView {
    override fun addSubchapters(subchapters: ArrayList<Subchapter>) {
        subIndexAdapter.addAll(subchapters)
    }

    private lateinit var subIndexAdapter: SubIndexAdapter
    private var subChapters: ArrayList<Subchapter> = ArrayList()
    private val args: SubIndexFragmentArgs by navArgs()
    private val presenter: SubIndexPresenter by lazy { SubIndexPresenter(this)}
    private val bundle: Bundle by lazy {Bundle()}


    override fun viewCreated(view: View?) {
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
        val layoutManager = GridLayoutManager(activity, 1)
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
                bundle.putStringArray(ConstantsManager.PHARAGRAPHS, it.paragrahps.toTypedArray())
                bundle.putString(ConstantsManager.TOOLBAR_TITLE, it.title)
                this.findNavController().navigate(R.id.goToContentFragment, bundle)
            }
    }



}
